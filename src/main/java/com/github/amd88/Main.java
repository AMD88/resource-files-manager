package com.github.amd88;

public class Main{
    public static void main(String[] args){
        //System.out.println(new FileAccess("/home/vibodha/Pictures/Wallpapers/ubuntu_os_white_orange_30925_1366x768.jpg").getFile().length());
        //giSystem.out.println(new FileAccess("/home/vibodha/Pictures/Wallpapers").getFolder().length());

        //System.out.println(new FileAccess("/home/vibodha/Firefox_wallpaper.png").getFile().length());

        MemoryManagement memoryManagement = new MemoryManagement() {
            public int syncSave() {
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
        memoryManagement.syncSave();
    }
}