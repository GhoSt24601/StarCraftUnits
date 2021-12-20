package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class xelnaga extends AppCompatActivity{

    private SoundPool soundPool;
    private int sxelnaga1,
            sxelnaga2,
            sxelnaga3,
            sxelnaga4,
            sxelnaga5,
            sxelnaga6,
            sxelnaga7,
            sxelnaga8,
            sxelnaga9,
            sxelnaga10,
            sxelnaga11,
            sxelnaga12,
            sxelnaga13,
            sxelnaga14,
            sxelnaga15,
            sxelnaga16,
            sxelnaga17,
            sxelnaga18,
            sxelnaga19,
            sxelnaga20,
            sxelnaga21,
            sxelnaga22,
            sxelnaga23,
            sxelnaga24,
            sxelnaga25,
            sxelnaga26,
            sxelnaga27,
            sxelnaga28,
            sxelnaga29,
            sxelnaga30,
            sxelnaga31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xelnaga);

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
        sxelnaga1= soundPool.load(this, R.raw.xelnaga1, 1);
        sxelnaga2= soundPool.load(this, R.raw.xelnaga2, 1);
        sxelnaga3= soundPool.load(this, R.raw.xelnaga3, 1);
        sxelnaga4= soundPool.load(this, R.raw.xelnaga4, 1);
        sxelnaga5= soundPool.load(this, R.raw.xelnaga5, 1);
        sxelnaga6= soundPool.load(this, R.raw.xelnaga6, 1);
        sxelnaga7= soundPool.load(this, R.raw.xelnaga7, 1);
        sxelnaga8= soundPool.load(this, R.raw.xelnaga8, 1);
        sxelnaga9= soundPool.load(this, R.raw.xelnaga9, 1);
        sxelnaga10= soundPool.load(this, R.raw.xelnaga10, 1);
        sxelnaga11= soundPool.load(this, R.raw.xelnaga11, 1);
        sxelnaga12= soundPool.load(this, R.raw.xelnaga12, 1);
        sxelnaga13= soundPool.load(this, R.raw.xelnaga13, 1);
        sxelnaga14= soundPool.load(this, R.raw.xelnaga14, 1);
        sxelnaga15= soundPool.load(this, R.raw.xelnaga15, 1);
        sxelnaga16= soundPool.load(this, R.raw.xelnaga16, 1);
        sxelnaga17= soundPool.load(this, R.raw.xelnaga17, 1);
        sxelnaga18= soundPool.load(this, R.raw.xelnaga18, 1);
        sxelnaga19= soundPool.load(this, R.raw.xelnaga19, 1);
        sxelnaga20= soundPool.load(this, R.raw.xelnaga20, 1);
        sxelnaga21= soundPool.load(this, R.raw.xelnaga21, 1);
        sxelnaga22= soundPool.load(this, R.raw.xelnaga22, 1);
        sxelnaga23= soundPool.load(this, R.raw.xelnaga23, 1);
        sxelnaga24= soundPool.load(this, R.raw.xelnaga24, 1);
        sxelnaga25= soundPool.load(this, R.raw.xelnaga25, 1);
        sxelnaga26= soundPool.load(this, R.raw.xelnaga26, 1);
        sxelnaga27= soundPool.load(this, R.raw.xelnaga27, 1);
        sxelnaga28= soundPool.load(this, R.raw.xelnaga28, 1);
        sxelnaga29= soundPool.load(this, R.raw.xelnaga29, 1);
        sxelnaga30= soundPool.load(this, R.raw.xelnaga30, 1);
        sxelnaga31= soundPool.load(this, R.raw.xelnaga31, 1);


    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bxelnaga1:soundPool.play(sxelnaga1, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga2:soundPool.play(sxelnaga2, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga3:soundPool.play(sxelnaga3, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga4:soundPool.play(sxelnaga4, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga5:soundPool.play(sxelnaga5, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga6:soundPool.play(sxelnaga6, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga7:soundPool.play(sxelnaga7, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga8:soundPool.play(sxelnaga8, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga9:soundPool.play(sxelnaga9, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga10:soundPool.play(sxelnaga10, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga11:soundPool.play(sxelnaga11, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga12:soundPool.play(sxelnaga12, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga13:soundPool.play(sxelnaga13, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga14:soundPool.play(sxelnaga14, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga15:soundPool.play(sxelnaga15, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga16:soundPool.play(sxelnaga16, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga17:soundPool.play(sxelnaga17, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga18:soundPool.play(sxelnaga18, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga19:soundPool.play(sxelnaga19, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga20:soundPool.play(sxelnaga20, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga21:soundPool.play(sxelnaga21, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga22:soundPool.play(sxelnaga22, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga23:soundPool.play(sxelnaga23, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga24:soundPool.play(sxelnaga24, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga25:soundPool.play(sxelnaga25, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga26:soundPool.play(sxelnaga26, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga27:soundPool.play(sxelnaga27, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga28:soundPool.play(sxelnaga28, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga29:soundPool.play(sxelnaga29, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga30:soundPool.play(sxelnaga30, 1, 1, 0, 0, 1); break;
            case R.id.bxelnaga31:soundPool.play(sxelnaga31, 1, 1, 0, 0, 1); break;
        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}