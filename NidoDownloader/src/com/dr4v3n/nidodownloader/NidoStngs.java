/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dr4v3n.nidodownloader;

import java.io.File;

/**
 *
 * @author dr44v3n
 */
public class NidoStngs {
    public static final String HOME_PATH = System.getProperty("user.home");
    public static final String CONFIG_DIR = HOME_PATH + File.separator + ".nidodownloader" + File.separator;
    public static final String DEFAULT_DIR = HOME_PATH + File.separator + "NidoDownloader" + File.separator + "hilos" + File.separator;
    public static final Object[] OPTIONS_PANE = {"Aceptar", "Abrir carpeta"};
    public static final String VERSION = "1.0.1";
}
