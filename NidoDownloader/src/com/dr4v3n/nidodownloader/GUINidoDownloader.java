/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dr4v3n.nidodownloader;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dr44v3n
 */
public class GUINidoDownloader extends javax.swing.JFrame {

    /**
     * Creates new form GUINidoDownloader
     */
    public GUINidoDownloader() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("NidoDownloader");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfURL = new javax.swing.JTextField();
        btnDownload = new javax.swing.JButton();
        includeAll = new javax.swing.JCheckBox();
        includeImgs = new javax.swing.JCheckBox();
        includeVids = new javax.swing.JCheckBox();
        includeGIFs = new javax.swing.JCheckBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblDebug = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        options = new javax.swing.JMenu();
        settings = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        licenses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("URL del hilo: ");

        tfURL.setMaximumSize(new java.awt.Dimension(4, 287));
        tfURL.setMinimumSize(new java.awt.Dimension(4, 287));
        tfURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfURLActionPerformed(evt);
            }
        });

        btnDownload.setText("Descargar");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        includeAll.setSelected(true);
        includeAll.setText("Descargar todos los archivos");
        includeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                includeAllActionPerformed(evt);
            }
        });

        includeImgs.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        includeImgs.setText("Descargar imágenes");
        includeImgs.setEnabled(false);
        includeImgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                includeImgsActionPerformed(evt);
            }
        });

        includeVids.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        includeVids.setText("Descargar vídeos");
        includeVids.setEnabled(false);
        includeVids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                includeVidsActionPerformed(evt);
            }
        });

        includeGIFs.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        includeGIFs.setText("Descargar GiFs");
        includeGIFs.setEnabled(false);
        includeGIFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                includeGIFsActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/nidownoaderlogoS.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblDebug, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(includeAll)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(includeGIFs)
                                                    .addComponent(includeImgs)
                                                    .addComponent(includeVids))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(includeAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(includeImgs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(includeVids, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(includeGIFs)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblDebug, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        options.setText("Opciones");

        settings.setText("Ajustes");
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        options.add(settings);

        jMenuBar1.add(options);

        help.setText("Ayuda");

        about.setText("Acerca de");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        licenses.setText("Licencias");
        licenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensesActionPerformed(evt);
            }
        });
        help.add(licenses);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        new GUINidoSettings().setVisible(true);
    }//GEN-LAST:event_settingsActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        new GUINidoDownloaderAbout().setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void includeVidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_includeVidsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_includeVidsActionPerformed

    private void includeGIFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_includeGIFsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_includeGIFsActionPerformed

    private void includeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_includeAllActionPerformed
        
        includeImgs.setEnabled(!includeAll.isSelected());
        includeVids.setEnabled(!includeAll.isSelected());
        includeGIFs.setEnabled(!includeAll.isSelected());
        
        if (includeAll.isSelected()) {
            includeImgs.setSelected(false);
            includeVids.setSelected(false);
            includeGIFs.setSelected(false);
        }
    }//GEN-LAST:event_includeAllActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        jProgressBar1.setValue(0);
        lblDebug.setText("Cargando la página...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (includeAll.isSelected() || includeImgs.isSelected() || 
                        includeVids.isSelected() || includeGIFs.isSelected()) {
                    if (tfURL.getText().contains("www.nido.org")) {
                        NidoDownloader nido = new NidoDownloader(tfURL.getText(), jProgressBar1, lblDebug);
                        nido.setIncludeAll(includeAll.isSelected());
                        nido.setIncludeImgs(includeImgs.isSelected());
                        nido.setIncludeVids(includeVids.isSelected());
                        nido.setIncludeGifs(includeGIFs.isSelected());
                        nido.download();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: bad URL", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, 
                            "No quieres descargar ningún tipo de archivo??", 
                            "ERROR", 
                            JOptionPane.QUESTION_MESSAGE);
                }
            }
        }).start();
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void includeImgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_includeImgsActionPerformed
        
    }//GEN-LAST:event_includeImgsActionPerformed

    private void licensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensesActionPerformed
        new GUINidoDownloaderLicense().setVisible(true);
    }//GEN-LAST:event_licensesActionPerformed

    private void tfURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfURLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUINidoDownloader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINidoDownloader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINidoDownloader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINidoDownloader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINidoDownloader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JButton btnDownload;
    private javax.swing.JMenu help;
    private javax.swing.JCheckBox includeAll;
    private javax.swing.JCheckBox includeGIFs;
    private javax.swing.JCheckBox includeImgs;
    private javax.swing.JCheckBox includeVids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblDebug;
    private javax.swing.JMenuItem licenses;
    private javax.swing.JMenu options;
    private javax.swing.JMenuItem settings;
    private javax.swing.JTextField tfURL;
    // End of variables declaration//GEN-END:variables

}
