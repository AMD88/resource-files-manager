package com.github.amd88;

import java.io.File;

/**
 * Created by vibodha on 12/13/16.
 */
public class Folder {

    private File directory;
    private long length = 0;

    public Folder(File directory) {
        this.directory = directory;
    }

    public long length(){
        for (File file : directory.listFiles()) {
            if (file.isFile())
                this.length += file.length();
            else
                this.length += new Folder(file).length();
        }
        return length;
    }

}
