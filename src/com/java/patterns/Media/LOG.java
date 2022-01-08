package com.java.patterns.Media;

public class LOG {
    public static void log() {
        MediaPackage vlc = new VLC();
        MediaPackage mp4 = new MP4();
        MediaPlayer mp3 = new MP3();

        FormatAdapter adapterMP4 = new FormatAdapter(mp4);
        FormatAdapter adapterVLC = new FormatAdapter(vlc);
        adapterMP4.play("Michael Jackson");
        adapterVLC.play("Elvis Presley");
        mp3.play("Frank Sinatra");
    }
}
