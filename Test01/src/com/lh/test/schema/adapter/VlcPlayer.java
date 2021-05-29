package com.lh.test.schema.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void play(String fileName) {
        System.out.println("play vlc file name:"+fileName);
    }
}
