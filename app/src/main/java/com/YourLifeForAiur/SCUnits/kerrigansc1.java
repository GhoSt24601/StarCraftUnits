package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class kerrigansc1 extends AppCompatActivity{

    private SoundPool soundPool;
    private int skerrbw1, skerrbw2,skerrbw3, skerrbw4,skerrbw5, skerrbw6,skerrbw7,skerrbw8, skerrbw9, skerrbw10, skerrbw11,skerrbw12, skerrbw13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerrigansc1);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);

        }
            skerrbw1 = soundPool.load(this, R.raw.kerrbw1, 1);
            skerrbw2 = soundPool.load(this, R.raw.kerrbw2, 1);
            skerrbw3 = soundPool.load(this, R.raw.kerrbw3, 1);
            skerrbw4 = soundPool.load(this, R.raw.kerrbw4, 1);
            skerrbw5 = soundPool.load(this, R.raw.kerrbw5, 1);
            skerrbw6 = soundPool.load(this, R.raw.kerrbw6, 1);
            skerrbw7 = soundPool.load(this, R.raw.kerrbw7, 1);
            skerrbw8 = soundPool.load(this, R.raw.kerrbw8, 1);
            skerrbw9 = soundPool.load(this, R.raw.kerrbw9, 1);
            skerrbw10 = soundPool.load(this, R.raw.kerrbw10, 1);
            skerrbw11 = soundPool.load(this, R.raw.kerrbw11, 1);
            skerrbw12 = soundPool.load(this, R.raw.kerrbw12, 1);
            skerrbw13 = soundPool.load(this, R.raw.kerrbw13, 1);
        }

        public void playSound (View view){
            switch (view.getId()) {
                case R.id.bkerrbw1:
                    soundPool.play(skerrbw1, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw2:
                    soundPool.play(skerrbw2, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw3:
                    soundPool.play(skerrbw3, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw4:
                    soundPool.play(skerrbw4, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw5:
                    soundPool.play(skerrbw5, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw6:
                    soundPool.play(skerrbw6, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw7:
                    soundPool.play(skerrbw7, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw8:
                    soundPool.play(skerrbw8, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw9:
                    soundPool.play(skerrbw9, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw10:
                    soundPool.play(skerrbw10, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw11:
                    soundPool.play(skerrbw11, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw12:
                    soundPool.play(skerrbw12, 1, 1, 0, 0, 1);
                    break;
                case R.id.bkerrbw13:
                    soundPool.play(skerrbw13, 1, 1, 0, 0, 1);
                    break;
            }
        }

        @Override
        protected void onDestroy () {
            super.onDestroy();
            soundPool.release();
            soundPool = null;
        }

    }