package com.lh.test.schema.adapter;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileNmae) {
        if("mp3".equals(audioType)){
            System.out.println("play mp3 file name:"+fileNmae);
//        }else if("vlc".equalsIgnoreCase(audioType)|| "mp4".equalsIgnoreCase(audioType)){
//            mediaAdapter = new MediaAdapter(audioType);
//            mediaAdapter.play(audioType,fileNmae);
        }else{
            System.out.println("invalid media: "+audioType+" format not support");
        }
    }
}
