package com.vish.pattern.adapter;
public class Mp4Player implements IAdvanceMediaPlayer {
    public void playVlc(String fileName) {
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}