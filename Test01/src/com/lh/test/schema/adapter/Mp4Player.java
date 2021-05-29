package com.lh.test.schema.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void play(String fileName) {
        System.out.println("play mp4 file name:"+fileName);
    }
}
