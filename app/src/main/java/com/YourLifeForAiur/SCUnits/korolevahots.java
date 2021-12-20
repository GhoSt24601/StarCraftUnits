package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class korolevahots extends AppCompatActivity{

    private SoundPool soundPool;
    private int skorhots1,
            skorhots2,
            skorhots3,
            skorhots4,
            skorhots5,
            skorhots6,
            skorhots7,
            skorhots8,
            skorhots9,
            skorhots10,
            skorhots11,
            skorhots12,
            skorhots13,
            skorhots14,
            skorhots15,
            skorhots16,
            skorhots17,
            skorhots18,
            skorhots19,
            skorhots20,
            skorhots21,
            skorhots22,
            skorhots23,
            skorhots24,
            skorhots25,
            skorhots26,
            skorhots27,
            skorhots28,
            skorhots29,
            skorhots30,
            skorhots31,
            skorhots32,
            skorhots33,
            skorhots34,
            skorhots35,
            skorhots36,
            skorhots37,
            skorhots38,
            skorhots39,
            skorhots40,
            skorhots41,
            skorhots42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korolevahots);

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
        skorhots1= soundPool.load(this, R.raw.korhots1, 1);
        skorhots2= soundPool.load(this, R.raw.korhots2, 1);
        skorhots3= soundPool.load(this, R.raw.korhots3, 1);
        skorhots4= soundPool.load(this, R.raw.korhots4, 1);
        skorhots5= soundPool.load(this, R.raw.korhots5, 1);
        skorhots6= soundPool.load(this, R.raw.korhots6, 1);
        skorhots7= soundPool.load(this, R.raw.korhots7, 1);
        skorhots8= soundPool.load(this, R.raw.korhots8, 1);
        skorhots9= soundPool.load(this, R.raw.korhots9, 1);
        skorhots10= soundPool.load(this, R.raw.korhots10, 1);
        skorhots11= soundPool.load(this, R.raw.korhots11, 1);
        skorhots12= soundPool.load(this, R.raw.korhots12, 1);
        skorhots13= soundPool.load(this, R.raw.korhots13, 1);
        skorhots14= soundPool.load(this, R.raw.korhots14, 1);
        skorhots15= soundPool.load(this, R.raw.korhots15, 1);
        skorhots16= soundPool.load(this, R.raw.korhots16, 1);
        skorhots17= soundPool.load(this, R.raw.korhots17, 1);
        skorhots18= soundPool.load(this, R.raw.korhots18, 1);
        skorhots19= soundPool.load(this, R.raw.korhots19, 1);
        skorhots20= soundPool.load(this, R.raw.korhots20, 1);
        skorhots21= soundPool.load(this, R.raw.korhots21, 1);
        skorhots22= soundPool.load(this, R.raw.korhots22, 1);
        skorhots23= soundPool.load(this, R.raw.korhots23, 1);
        skorhots24= soundPool.load(this, R.raw.korhots24, 1);
        skorhots25= soundPool.load(this, R.raw.korhots25, 1);
        skorhots26= soundPool.load(this, R.raw.korhots26, 1);
        skorhots27= soundPool.load(this, R.raw.korhots27, 1);
        skorhots28= soundPool.load(this, R.raw.korhots28, 1);
        skorhots29= soundPool.load(this, R.raw.korhots29, 1);
        skorhots30= soundPool.load(this, R.raw.korhots30, 1);
        skorhots31= soundPool.load(this, R.raw.korhots31, 1);
        skorhots32= soundPool.load(this, R.raw.korhots32, 1);
        skorhots33= soundPool.load(this, R.raw.korhots33, 1);
        skorhots34= soundPool.load(this, R.raw.korhots34, 1);
        skorhots35= soundPool.load(this, R.raw.korhots35, 1);
        skorhots36= soundPool.load(this, R.raw.korhots36, 1);
        skorhots37= soundPool.load(this, R.raw.korhots37, 1);
        skorhots38= soundPool.load(this, R.raw.korhots38, 1);
        skorhots39= soundPool.load(this, R.raw.korhots39, 1);
        skorhots40= soundPool.load(this, R.raw.korhots40, 1);
        skorhots41= soundPool.load(this, R.raw.korhots41, 1);
        skorhots42= soundPool.load(this, R.raw.korhots42, 1);


    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkorhots1:soundPool.play(skorhots1, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots2:soundPool.play(skorhots2, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots3:soundPool.play(skorhots3, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots4:soundPool.play(skorhots4, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots5:soundPool.play(skorhots5, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots6:soundPool.play(skorhots6, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots7:soundPool.play(skorhots7, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots8:soundPool.play(skorhots8, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots9:soundPool.play(skorhots9, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots10:soundPool.play(skorhots10, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots11:soundPool.play(skorhots11, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots12:soundPool.play(skorhots12, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots13:soundPool.play(skorhots13, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots14:soundPool.play(skorhots14, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots15:soundPool.play(skorhots15, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots16:soundPool.play(skorhots16, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots17:soundPool.play(skorhots17, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots18:soundPool.play(skorhots18, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots19:soundPool.play(skorhots19, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots20:soundPool.play(skorhots20, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots21:soundPool.play(skorhots21, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots22:soundPool.play(skorhots22, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots23:soundPool.play(skorhots23, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots24:soundPool.play(skorhots24, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots25:soundPool.play(skorhots25, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots26:soundPool.play(skorhots26, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots27:soundPool.play(skorhots27, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots28:soundPool.play(skorhots28, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots29:soundPool.play(skorhots29, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots30:soundPool.play(skorhots30, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots31:soundPool.play(skorhots31, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots32:soundPool.play(skorhots32, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots33:soundPool.play(skorhots33, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots34:soundPool.play(skorhots34, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots35:soundPool.play(skorhots35, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots36:soundPool.play(skorhots36, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots37:soundPool.play(skorhots37, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots38:soundPool.play(skorhots38, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots39:soundPool.play(skorhots39, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots40:soundPool.play(skorhots40, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots41:soundPool.play(skorhots41, 1, 1, 0, 0, 1); break;
            case R.id.bkorhots42:soundPool.play(skorhots42, 1, 1, 0, 0, 1); break;
        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}