package com.java.patterns.Media;

public class MP4 implements MediaPackage{
    @Override
    public void playFile(String filename) {
        System.out.println(getClass().getSimpleName() + " " + filename);
    }
}
