package com.github.amd88;

public class Main{
    public static void main(String[] args){
        System.out.println(new FileAccess("/home/vibodha/Firefox_wallpaper.png").getFile().length());
    }
}