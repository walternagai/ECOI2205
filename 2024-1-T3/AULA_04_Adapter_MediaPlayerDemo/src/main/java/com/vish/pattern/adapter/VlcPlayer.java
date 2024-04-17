package com.vish.pattern.adapter;

public class VlcPlayer implements IAdvanceMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc file. Name: "+ fileName);
    }
    public void playMp4(String fileName) {
    }
}