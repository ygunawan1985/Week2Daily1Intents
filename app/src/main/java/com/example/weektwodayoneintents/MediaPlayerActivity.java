package com.example.weektwodayoneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MediaPlayerActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
       // playSong();
    }

    public void playSong() {
        // Play song
        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(this, R.raw.alanwalkeronmyway);
        mp.start(); // starting mediaplayer
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.release();
    }


}
