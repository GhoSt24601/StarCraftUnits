package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class kerriganhots2 extends AppCompatActivity{

    private SoundPool soundPool;
    private int skerrhots21,
            skerrhots22,
            skerrhots23,
            skerrhots24,
            skerrhots25,
            skerrhots26,
            skerrhots27,
            skerrhots28,
            skerrhots29,
            skerrhots210,
            skerrhots211,
            skerrhots212,
            skerrhots213,
            skerrhots214,
            skerrhots215,
            skerrhots216,
            skerrhots217,
            skerrhots218,
            skerrhots219,
            skerrhots220,
            skerrhots221,
            skerrhots222,
            skerrhots223,
            skerrhots224,
            skerrhots225,
            skerrhots226,
            skerrhots227,
            skerrhots228,
            skerrhots229,
            skerrhots230,
            skerrhots231,
            skerrhots232,
            skerrhots233,
            skerrhots234,
            skerrhots235,
            skerrhots236,
            skerrhots237,
            skerrhots238,
            skerrhots239,
            skerrhots240,
            skerrhots241,
            skerrhots242;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerriganhots2);

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
        skerrhots21= soundPool.load(this, R.raw.kerrhots21, 1);
        skerrhots22= soundPool.load(this, R.raw.kerrhots22, 1);
        skerrhots23= soundPool.load(this, R.raw.kerrhots23, 1);
        skerrhots24= soundPool.load(this, R.raw.kerrhots24, 1);
        skerrhots25= soundPool.load(this, R.raw.kerrhots25, 1);
        skerrhots26= soundPool.load(this, R.raw.kerrhots26, 1);
        skerrhots27= soundPool.load(this, R.raw.kerrhots27, 1);
        skerrhots28= soundPool.load(this, R.raw.kerrhots28, 1);
        skerrhots29= soundPool.load(this, R.raw.kerrhots29, 1);
        skerrhots210= soundPool.load(this, R.raw.kerrhots210, 1);
        skerrhots211= soundPool.load(this, R.raw.kerrhots211, 1);
        skerrhots212= soundPool.load(this, R.raw.kerrhots212, 1);
        skerrhots213= soundPool.load(this, R.raw.kerrhots213, 1);
        skerrhots214= soundPool.load(this, R.raw.kerrhots214, 1);
        skerrhots215= soundPool.load(this, R.raw.kerrhots215, 1);
        skerrhots216= soundPool.load(this, R.raw.kerrhots216, 1);
        skerrhots217= soundPool.load(this, R.raw.kerrhots217, 1);
        skerrhots218= soundPool.load(this, R.raw.kerrhots218, 1);
        skerrhots219= soundPool.load(this, R.raw.kerrhots219, 1);
        skerrhots220= soundPool.load(this, R.raw.kerrhots220, 1);
        skerrhots221= soundPool.load(this, R.raw.kerrhots221, 1);
        skerrhots222= soundPool.load(this, R.raw.kerrhots222, 1);
        skerrhots223= soundPool.load(this, R.raw.kerrhots223, 1);
        skerrhots224= soundPool.load(this, R.raw.kerrhots224, 1);
        skerrhots225= soundPool.load(this, R.raw.kerrhots225, 1);
        skerrhots226= soundPool.load(this, R.raw.kerrhots226, 1);
        skerrhots227= soundPool.load(this, R.raw.kerrhots227, 1);
        skerrhots228= soundPool.load(this, R.raw.kerrhots228, 1);
        skerrhots229= soundPool.load(this, R.raw.kerrhots229, 1);
        skerrhots230= soundPool.load(this, R.raw.kerrhots230, 1);
        skerrhots231= soundPool.load(this, R.raw.kerrhots231, 1);
        skerrhots232= soundPool.load(this, R.raw.kerrhots232, 1);
        skerrhots233= soundPool.load(this, R.raw.kerrhots233, 1);
        skerrhots234= soundPool.load(this, R.raw.kerrhots234, 1);
        skerrhots235= soundPool.load(this, R.raw.kerrhots235, 1);
        skerrhots236= soundPool.load(this, R.raw.kerrhots236, 1);
        skerrhots237= soundPool.load(this, R.raw.kerrhots237, 1);
        skerrhots238= soundPool.load(this, R.raw.kerrhots238, 1);
        skerrhots239= soundPool.load(this, R.raw.kerrhots239, 1);
        skerrhots240= soundPool.load(this, R.raw.kerrhots240, 1);
        skerrhots241= soundPool.load(this, R.raw.kerrhots241, 1);
        skerrhots242= soundPool.load(this, R.raw.kerrhots242, 1);


    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkerrhots21:soundPool.play(skerrhots21, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots22:soundPool.play(skerrhots22, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots23:soundPool.play(skerrhots23, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots24:soundPool.play(skerrhots24, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots25:soundPool.play(skerrhots25, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots26:soundPool.play(skerrhots26, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots27:soundPool.play(skerrhots27, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots28:soundPool.play(skerrhots28, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots29:soundPool.play(skerrhots29, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots210:soundPool.play(skerrhots210, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots211:soundPool.play(skerrhots211, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots212:soundPool.play(skerrhots212, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots213:soundPool.play(skerrhots213, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots214:soundPool.play(skerrhots214, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots215:soundPool.play(skerrhots215, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots216:soundPool.play(skerrhots216, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots217:soundPool.play(skerrhots217, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots218:soundPool.play(skerrhots218, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots219:soundPool.play(skerrhots219, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots220:soundPool.play(skerrhots220, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots221:soundPool.play(skerrhots221, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots222:soundPool.play(skerrhots222, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots223:soundPool.play(skerrhots223, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots224:soundPool.play(skerrhots224, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots225:soundPool.play(skerrhots225, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots226:soundPool.play(skerrhots226, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots227:soundPool.play(skerrhots227, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots228:soundPool.play(skerrhots228, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots229:soundPool.play(skerrhots229, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots230:soundPool.play(skerrhots230, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots231:soundPool.play(skerrhots231, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots232:soundPool.play(skerrhots232, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots233:soundPool.play(skerrhots233, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots234:soundPool.play(skerrhots234, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots235:soundPool.play(skerrhots235, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots236:soundPool.play(skerrhots236, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots237:soundPool.play(skerrhots237, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots238:soundPool.play(skerrhots238, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots239:soundPool.play(skerrhots239, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots240:soundPool.play(skerrhots240, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots241:soundPool.play(skerrhots241, 1, 1, 0, 0, 1); break;
            case R.id.bkerrhots242:soundPool.play(skerrhots242, 1, 1, 0, 0, 1); break;
        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}