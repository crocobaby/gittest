package com.lh.test.schema.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("vlc".equals(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileNmae) {
        advancedMediaPlayer.play(fileNmae);
    }
}
