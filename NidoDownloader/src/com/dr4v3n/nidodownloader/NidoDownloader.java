package com.dr4v3n.nidodownloader;

import java.awt.Desktop;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.TextUtils;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;

public class NidoDownloader {
	public final static String LINK = "https://www.nido.org";
	public final static String[] IMGS_FORMATS = {".tif", ".tiff", ".jpeg", ".jpg", ".bmp", ".png"};
	public final static String[] VIDS_FORMATS = {".webm", ".mpg", ".mpeg", ".mov", ".mp4", ".flv"};
	public final static String[] GIFS_FORMATS = {".gif"};
	
	private String url;
	private boolean includeAll;
	private boolean downloadAll;
	private int limit;
	private String folderName;
	private String threadName;
	private String threadNo;
	private String path;
	
	private boolean includeImgs;
	private boolean includeVids;
	private boolean includeGifs;

	private int counter = 1;
        private int imgsDownloaded = 0;
	private JProgressBar progressBar;
        private JLabel lblDebug;
	
	public NidoDownloader(String url, boolean includeAll, boolean downloadAll, 
			int limit, String folderName, boolean includeImgs, 
			boolean includeVids, boolean includeGifs) {
		
		this.url = url;
		this.includeAll = includeAll;
		this.downloadAll = downloadAll;
		this.limit = limit;
		this.folderName = folderName;
		this.includeImgs = includeImgs;
		this.includeVids = includeVids;
		this.includeGifs = includeGifs;
	}

	public NidoDownloader(String url, boolean includeAll, boolean downloadAll) {
		this.url = url;
		this.includeAll = includeAll;
		this.downloadAll = downloadAll;
		this.limit = 0;
		this.folderName = "";
		if (includeAll) {
			this.includeAll = includeAll;
		} else {
			this.includeImgs = false;
			this.includeVids = false;
			this.includeGifs = false;
		}
	}

	public NidoDownloader(String url, int limit, boolean includeImgs, boolean includeVids, boolean includeGifs) {
		super();
		this.url = url;
		this.limit = limit;
		this.includeImgs = includeImgs;
		this.includeVids = includeVids;
		this.includeGifs = includeGifs;
	}
	
	public NidoDownloader(String url, String folderName) {
		super();
		this.url = url;
		this.folderName = folderName;
	}

	public NidoDownloader(String url, JProgressBar pb) {
		this.url = url;
		progressBar = pb;
	}
	
	public NidoDownloader(String url) {
		this.url = url;
	}

        NidoDownloader(String text, JProgressBar jProgressBar1, JLabel lblDebug) {
            url = text;
            progressBar = jProgressBar1;
            this.lblDebug = lblDebug;
        }
	
	public void download() {
		String[] arrayUrl = url.split("/");
		threadNo = arrayUrl[arrayUrl.length-1].replace(".html", "");
		
		try {
			Document doc = Jsoup.connect(url).get();
			threadName = doc.title().split(" -")[0].replaceAll(" ", "_");
			
			Elements elements = doc.select("div#thread_" + threadNo + " > div.post"
					+ " > div.aditional-files > div > a");
			if (elements != null) {
				Element element = doc.select("div#thread_" + threadNo + " > p.fileinfo"
						+ " > a").first();
				if (element != null) {
					String link = LINK + element.attr("href");
					downloadFile(link);
				}
			} else {
				System.out.println("ERROR: bad url");
			}
			
			Element respuestas = doc.select("div#thread_" + threadNo).first();
			Elements resp = respuestas.getElementsByClass("post reply");
			Elements resp2 = resp.select("a.post_file");
			Elements resp3 = respuestas.getElementsByClass("image-additional").select("a");
			resp2.addAll(resp3);
			if (progressBar != null) {
				progressBar.setMaximum(resp2.size());
			}
			
			for (Element e: resp2) {
				String href = e.attr("href");
				String nLink = LINK + href;
				downloadFile(nLink);
                                if (progressBar != null && lblDebug != null) {
                                    progressBar.setValue(counter);
                                }
                        counter++;
			}
                        
                        createTxt();
                        if (progressBar != null) {
                            progressBar.setValue(progressBar.getMaximum());
                        }
			int x = JOptionPane.showOptionDialog(null, 
                                "Se han descargado " + imgsDownloaded + " archivos en " + path + threadName, 
                                "Terminado",
                                JOptionPane.DEFAULT_OPTION, 
                                JOptionPane.INFORMATION_MESSAGE, 
                                null, 
                                NidoStngs.OPTIONS_PANE,
                                NidoStngs.OPTIONS_PANE[0]);
			
                        if (x == JOptionPane.NO_OPTION) {
                            Desktop.getDesktop().open(new File(path + threadName));
                        }
		} catch (HttpStatusException e) {
			JOptionPane.showMessageDialog(null, "ERROR: bad URL", "ERROR", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR", e.getMessage(), JOptionPane.ERROR_MESSAGE);
		} catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, 
                            "ERROR: algo salió mal... revisa la URL y reinicia el programa" ,
                            "ERROR", 
                            JOptionPane.ERROR_MESSAGE);
                }
                
		
	}
	
	private void downloadFile(String url) throws IOException{
                File config = new File(NidoStngs.CONFIG_DIR, "config.ini");
                if (config.exists()) {
                    String nPath = FileUtils.readFileToString(config, "utf8");
                    if (!TextUtils.isEmpty(nPath))
                        path = nPath;
                    else { 
                        File defaultDir = new File(NidoStngs.DEFAULT_DIR);
                        defaultDir.mkdirs();
                        path = NidoStngs.DEFAULT_DIR;
                    }
                } else {
                    File defaultDir = new File(NidoStngs.DEFAULT_DIR);
                    defaultDir.mkdirs();
                    path = NidoStngs.DEFAULT_DIR;
                }
                
		String folderName = threadName; 
		CloseableHttpClient httpCliente = HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.11 Safari/537.36");
		
		HttpResponse httpResponse = httpCliente.execute(httpGet);
		HttpEntity imageEntity = httpResponse.getEntity();
		
		if (imageEntity != null) {
			File file = new File(path + folderName);
			file.mkdirs();
			String[] nFile = url.split("/");
			String imageName = nFile[nFile.length-1];
                        if (includeAll) {
                            downloadFiles(file, imageName, imageEntity);
                        } else {
                            if (includeImgs) {
                                for (String formato: IMGS_FORMATS) {
                                    if (imageName.contains(formato)) {
                                        downloadFiles(file, imageName, imageEntity);
                                    }
                                }
                            }
                            if (includeVids) {
                                for (String formato: VIDS_FORMATS) {
                                    if (imageName.contains(formato)) {
                                        downloadFiles(file, imageName, imageEntity);
                                    }
                                }
                            }
                            if (includeGifs) {
                                if (imageName.contains(".gif")) {
                                    downloadFiles(file, imageName, imageEntity);
                                }
                            }
                        }
		}
		
		httpGet.releaseConnection();
		
	}
        
        private void downloadFiles(File file, String imageName, HttpEntity imageEntity) throws IOException{
            File imgFile = new File(file.getAbsolutePath(), imageName);
            FileUtils.copyInputStreamToFile(imageEntity.getContent(), imgFile);
            lblDebug.setText(imageName);
            imgsDownloaded++;
        }
	
	private void createTxt() throws IOException {
		File file = new File(path + threadName);
		file.mkdirs();
		File txt = new File(file.getAbsolutePath(), "hilo.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(txt));
		bw.write(url);
		bw.close();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isIncludeAll() {
		return includeAll;
	}

	public void setIncludeAll(boolean includeAll) {
		this.includeAll = includeAll;
	}

	public boolean isDownloadAll() {
		return downloadAll;
	}

	public void setDownloadAll(boolean downloadAll) {
		this.downloadAll = downloadAll;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public boolean isIncludeImgs() {
		return includeImgs;
	}

	public void setIncludeImgs(boolean includeImgs) {
		this.includeImgs = includeImgs;
	}

	public boolean isIncludeVids() {
		return includeVids;
	}

	public void setIncludeVids(boolean includeVids) {
		this.includeVids = includeVids;
	}

	public boolean isIncludeGifs() {
		return includeGifs;
	}

	public void setIncludeGifs(boolean includeGifs) {
		this.includeGifs = includeGifs;
	}

	@Override
	public String toString() {
		return "NidoDownloader [url=" + url + ", includeAll=" + includeAll + ", downloadAll=" + downloadAll + ", limit="
				+ limit + ", folderName=" + folderName + ", includeImgs=" + includeImgs + ", includeVids=" + includeVids
				+ ", includeGifs=" + includeGifs + "]";
	}
	
	
	
}
