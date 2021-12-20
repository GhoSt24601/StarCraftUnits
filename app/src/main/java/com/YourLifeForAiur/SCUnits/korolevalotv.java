package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class korolevalotv extends AppCompatActivity{

    private SoundPool soundPool;
    private int skorlotv1,
            skorlotv2,
            skorlotv3,
            skorlotv4,
            skorlotv5,
            skorlotv6,
            skorlotv7,
            skorlotv8,
            skorlotv9,
            skorlotv10,
            skorlotv11,
            skorlotv12,
            skorlotv13,
            skorlotv14,
            skorlotv15,
            skorlotv16,
            skorlotv17,
            skorlotv18,
            skorlotv19,
            skorlotv20,
            skorlotv21,
            skorlotv22,
            skorlotv23,
            skorlotv24,
            skorlotv25,
            skorlotv26,
            skorlotv27,
            skorlotv28,
            skorlotv29,
            skorlotv30,
            skorlotv31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korolevalotv);

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
        skorlotv1= soundPool.load(this, R.raw.korlotv1, 1);
        skorlotv2= soundPool.load(this, R.raw.korlotv2, 1);
        skorlotv3= soundPool.load(this, R.raw.korlotv3, 1);
        skorlotv4= soundPool.load(this, R.raw.korlotv4, 1);
        skorlotv5= soundPool.load(this, R.raw.korlotv5, 1);
        skorlotv6= soundPool.load(this, R.raw.korlotv6, 1);
        skorlotv7= soundPool.load(this, R.raw.korlotv7, 1);
        skorlotv8= soundPool.load(this, R.raw.korlotv8, 1);
        skorlotv9= soundPool.load(this, R.raw.korlotv9, 1);
        skorlotv10= soundPool.load(this, R.raw.korlotv10, 1);
        skorlotv11= soundPool.load(this, R.raw.korlotv11, 1);
        skorlotv12= soundPool.load(this, R.raw.korlotv12, 1);
        skorlotv13= soundPool.load(this, R.raw.korlotv13, 1);
        skorlotv14= soundPool.load(this, R.raw.korlotv14, 1);
        skorlotv15= soundPool.load(this, R.raw.korlotv15, 1);
        skorlotv16= soundPool.load(this, R.raw.korlotv16, 1);
        skorlotv17= soundPool.load(this, R.raw.korlotv17, 1);
        skorlotv18= soundPool.load(this, R.raw.korlotv18, 1);
        skorlotv19= soundPool.load(this, R.raw.korlotv19, 1);
        skorlotv20= soundPool.load(this, R.raw.korlotv20, 1);
        skorlotv21= soundPool.load(this, R.raw.korlotv21, 1);
        skorlotv22= soundPool.load(this, R.raw.korlotv22, 1);
        skorlotv23= soundPool.load(this, R.raw.korlotv23, 1);
        skorlotv24= soundPool.load(this, R.raw.korlotv24, 1);
        skorlotv25= soundPool.load(this, R.raw.korlotv25, 1);
        skorlotv26= soundPool.load(this, R.raw.korlotv26, 1);
        skorlotv27= soundPool.load(this, R.raw.korlotv27, 1);
        skorlotv28= soundPool.load(this, R.raw.korlotv28, 1);
        skorlotv29= soundPool.load(this, R.raw.korlotv29, 1);
        skorlotv30= soundPool.load(this, R.raw.korlotv30, 1);
        skorlotv31= soundPool.load(this, R.raw.korlotv31, 1);


    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkorlotv1:soundPool.play(skorlotv1, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv2:soundPool.play(skorlotv2, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv3:soundPool.play(skorlotv3, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv4:soundPool.play(skorlotv4, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv5:soundPool.play(skorlotv5, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv6:soundPool.play(skorlotv6, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv7:soundPool.play(skorlotv7, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv8:soundPool.play(skorlotv8, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv9:soundPool.play(skorlotv9, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv10:soundPool.play(skorlotv10, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv11:soundPool.play(skorlotv11, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv12:soundPool.play(skorlotv12, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv13:soundPool.play(skorlotv13, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv14:soundPool.play(skorlotv14, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv15:soundPool.play(skorlotv15, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv16:soundPool.play(skorlotv16, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv17:soundPool.play(skorlotv17, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv18:soundPool.play(skorlotv18, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv19:soundPool.play(skorlotv19, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv20:soundPool.play(skorlotv20, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv21:soundPool.play(skorlotv21, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv22:soundPool.play(skorlotv22, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv23:soundPool.play(skorlotv23, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv24:soundPool.play(skorlotv24, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv25:soundPool.play(skorlotv25, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv26:soundPool.play(skorlotv26, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv27:soundPool.play(skorlotv27, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv28:soundPool.play(skorlotv28, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv29:soundPool.play(skorlotv29, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv30:soundPool.play(skorlotv30, 1, 1, 0, 0, 1); break;
            case R.id.bkorlotv31:soundPool.play(skorlotv31, 1, 1, 0, 0, 1); break;
        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}