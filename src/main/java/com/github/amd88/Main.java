package com.github.amd88;

public class Main{
    public static void main(String[] args){
        System.out.println(new FileAccess("/home/vibodha/Pictures/Wallpapers/ubuntu_os_white_orange_30925_1366x768.jpg").getFile().length());
        System.out.println(new FileAccess("/home/vibodha/Pictures/Wallpapers").getFolder().length());

    }
}