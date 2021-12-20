package com.YourLifeForAiur.SCUnits;
import com.YourLifeForAiur.SCUnits.R;
import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.SoundPool;
import android.os.Build;



public class korolevasc1 extends AppCompatActivity{
    private SoundPool soundPool;
    private int skorbw1, skorbw2,skorbw3, skorbw4,skorbw5, skorbw6,skorbw7,skorbw8, skorbw9, skorbw10, skorbw11,skorbw12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korolevasc1);
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
        skorbw1 = soundPool.load(this, R.raw.korbw1, 1);
        skorbw2 = soundPool.load(this, R.raw.korbw2, 1);
        skorbw3 = soundPool.load(this, R.raw.korbw3, 1);
        skorbw4 = soundPool.load(this, R.raw.korbw4, 1);
        skorbw5 = soundPool.load(this, R.raw.korbw5, 1);
        skorbw6 = soundPool.load(this, R.raw.korbw6, 1);
        skorbw7 = soundPool.load(this, R.raw.korbw7, 1);
        skorbw8 = soundPool.load(this, R.raw.korbw8, 1);
        skorbw9 = soundPool.load(this, R.raw.korbw9, 1);
        skorbw10 = soundPool.load(this, R.raw.korbw10, 1);
        skorbw11 = soundPool.load(this, R.raw.korbw11, 1);
        skorbw12 = soundPool.load(this, R.raw.korbw12, 1);

    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkorbw1:
                soundPool.play(skorbw1, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw2:
                soundPool.play(skorbw2, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw3:
                soundPool.play(skorbw3, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw4:
                soundPool.play(skorbw4, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw5:
                soundPool.play(skorbw5, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw6:
                soundPool.play(skorbw6, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw7:
                soundPool.play(skorbw7, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw8:
                soundPool.play(skorbw8, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw9:
                soundPool.play(skorbw9, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw10:
                soundPool.play(skorbw10, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw11:
                soundPool.play(skorbw11, 1, 1, 0, 0, 1);
                break;
            case R.id.bkorbw12:
                soundPool.play(skorbw12, 1, 1, 0, 0, 1);
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