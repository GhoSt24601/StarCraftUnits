package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class korolevawol extends AppCompatActivity{

    private SoundPool soundPool;
    private int skorwol1,
            skorwol2,
            skorwol3,
            skorwol4,
            skorwol5,
            skorwol6,
            skorwol7,
            skorwol8,
            skorwol9,
            skorwol10,
            skorwol11,
            skorwol12,
            skorwol13,
            skorwol14,
            skorwol15,
            skorwol16,
            skorwol17,
            skorwol18,
            skorwol19,
            skorwol20,
            skorwol21,
            skorwol22,
            skorwol23,
            skorwol24,
            skorwol25,
            skorwol26,
            skorwol27,
            skorwol28,
            skorwol29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korolevawol);

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
        skorwol1= soundPool.load(this, R.raw.korwol1, 1);
        skorwol2= soundPool.load(this, R.raw.korwol2, 1);
        skorwol3= soundPool.load(this, R.raw.korwol3, 1);
        skorwol4= soundPool.load(this, R.raw.korwol4, 1);
        skorwol5= soundPool.load(this, R.raw.korwol5, 1);
        skorwol6= soundPool.load(this, R.raw.korwol6, 1);
        skorwol7= soundPool.load(this, R.raw.korwol7, 1);
        skorwol8= soundPool.load(this, R.raw.korwol8, 1);
        skorwol9= soundPool.load(this, R.raw.korwol9, 1);
        skorwol10= soundPool.load(this, R.raw.korwol10, 1);
        skorwol11= soundPool.load(this, R.raw.korwol11, 1);
        skorwol12= soundPool.load(this, R.raw.korwol12, 1);
        skorwol13= soundPool.load(this, R.raw.korwol13, 1);
        skorwol14= soundPool.load(this, R.raw.korwol14, 1);
        skorwol15= soundPool.load(this, R.raw.korwol15, 1);
        skorwol16= soundPool.load(this, R.raw.korwol16, 1);
        skorwol17= soundPool.load(this, R.raw.korwol17, 1);
        skorwol18= soundPool.load(this, R.raw.korwol18, 1);
        skorwol19= soundPool.load(this, R.raw.korwol19, 1);
        skorwol20= soundPool.load(this, R.raw.korwol20, 1);
        skorwol21= soundPool.load(this, R.raw.korwol21, 1);
        skorwol22= soundPool.load(this, R.raw.korwol22, 1);
        skorwol23= soundPool.load(this, R.raw.korwol23, 1);
        skorwol24= soundPool.load(this, R.raw.korwol24, 1);
        skorwol25= soundPool.load(this, R.raw.korwol25, 1);
        skorwol26= soundPool.load(this, R.raw.korwol26, 1);
        skorwol27= soundPool.load(this, R.raw.korwol27, 1);
        skorwol28= soundPool.load(this, R.raw.korwol28, 1);
        skorwol29= soundPool.load(this, R.raw.korwol29, 1);

    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkorwol1:soundPool.play(skorwol1, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol2:soundPool.play(skorwol2, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol3:soundPool.play(skorwol3, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol4:soundPool.play(skorwol4, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol5:soundPool.play(skorwol5, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol6:soundPool.play(skorwol6, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol7:soundPool.play(skorwol7, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol8:soundPool.play(skorwol8, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol9:soundPool.play(skorwol9, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol10:soundPool.play(skorwol10, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol11:soundPool.play(skorwol11, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol12:soundPool.play(skorwol12, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol13:soundPool.play(skorwol13, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol14:soundPool.play(skorwol14, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol15:soundPool.play(skorwol15, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol16:soundPool.play(skorwol16, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol17:soundPool.play(skorwol17, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol18:soundPool.play(skorwol18, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol19:soundPool.play(skorwol19, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol20:soundPool.play(skorwol20, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol21:soundPool.play(skorwol21, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol22:soundPool.play(skorwol22, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol23:soundPool.play(skorwol23, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol24:soundPool.play(skorwol24, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol25:soundPool.play(skorwol25, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol26:soundPool.play(skorwol26, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol27:soundPool.play(skorwol27, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol28:soundPool.play(skorwol28, 1, 1, 0, 0, 1); break;
            case R.id.bkorwol29:soundPool.play(skorwol29, 1, 1, 0, 0, 1); break;

        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}