package com.example.neilsonho.planmysong;

import android.app.IntentService;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;

import java.io.IOException;

/**
 * Created by neilsonho on 15-03-20.
 */
public class MyService extends IntentService {
    public MyService(){super("Mirror");}

    @Override
    protected void onHandleIntent(Intent intent) {
        MediaPlayer mPlayer;
        mPlayer = new MediaPlayer();
        Uri myUri = Uri.parse("file:///sdcard/mySongs/mirrors.mp3");
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            mPlayer.setDataSource(getApplicationContext(), myUri);
            mPlayer.prepare();
            mPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
