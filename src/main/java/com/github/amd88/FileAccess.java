package com.github.amd88;

import java.io.File;

/**
 * Created by vibodha on 12/13/16.
 */
public class FileAccess {
    private static FileAccess fileAccess = null;
    private static String path;

    public FileAccess(String filePath) {
        path = filePath;
    }

    public static FileAccess getInstance(){
        return fileAccess = new FileAccess(path);
    }

    public File getFile(){
        return new File(path);
    }

    public Folder getFolder(){
        return new Folder(new File(path));
    }

}
