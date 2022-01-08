package com.java.patterns.Media;

public class MP3 implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println(getClass().getSimpleName() + " " + filename);
    }
}
