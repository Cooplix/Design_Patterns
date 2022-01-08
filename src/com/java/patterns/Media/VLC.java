package com.java.patterns.Media;

public class VLC implements MediaPackage{
    @Override
    public void playFile(String filename) {
        System.out.println(getClass().getSimpleName() + " " + filename);
    }
}
