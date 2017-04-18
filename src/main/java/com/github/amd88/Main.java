package com.github.amd88;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        //System.out.println(new FileAccess("/home/vibodha/Pictures/Wallpapers/ubuntu_os_white_orange_30925_1366x768.jpg").getFile().length());
        //giSystem.out.println(new FileAccess("/home/vibodha/Pictures/Wallpapers").getFolder().length());

        //System.out.println(new FileAccess("/home/vibodha/Firefox_wallpaper.png").getFile().length());

        /*MemoryManagement memoryManagement = new MemoryManagement() {
            public int asyncmemorymanagement() {
                for (int i = 0; i<100; i++){
                    m = i;
                    System.out.println(m);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return 0;
            }
        };
        memoryManagement.start();
        memoryManagement.asyncmemorymanagement();*/
        FileProcessor fp = new FileProcessor();
        File file = new File("/home/amoda/Pictures/14281584_1780085735594878_2084325646_n88.jpg");
       // File file1 = new File();
fp.resizeImage(file,700,7000);
        //File outputfile = new File("/home/amoda/Pictures/image.jpg");
        //ImageIO.write(fp.resizeImage(file,1000,7000), "jpg", outputfile);

    }
}