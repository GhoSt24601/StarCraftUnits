package com.YourLifeForAiur.SCUnits;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class kerriganhots extends AppCompatActivity{

    private SoundPool soundPool;
    private int skerrhots11,
            skerrhots12,
            skerrhots13,
            skerrhots14,
            skerrhots15,
            skerrhots16,
            skerrhots17,
            skerrhots18,
            skerrhots19,
            skerrhots110,
            skerrhots111,
            skerrhots112,
            skerrhots113,
            skerrhots114,
            skerrhots115,
            skerrhots116,
            skerrhots117,
            skerrhots118,
            skerrhots119,
            skerrhots120,
            skerrhots121,
            skerrhots122,
            skerrhots123,
            skerrhots124,
            skerrhots125,
            skerrhots126,
            skerrhots127,
            skerrhots128,
            skerrhots129,
            skerrhots130,
            skerrhots131,
            skerrhots132,
            skerrhots133,
            skerrhots134,
            skerrhots135,
            skerrhots136,
            skerrhots137,
            skerrhots138,
            skerrhots139,
            skerrhots140,
            skerrhots141,
            skerrhots142;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerriganhots);

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
            skerrhots11= soundPool.load(this, R.raw.kerrhots11, 1);
            skerrhots12= soundPool.load(this, R.raw.kerrhots12, 1);
            skerrhots13= soundPool.load(this, R.raw.kerrhots13, 1);
            skerrhots14= soundPool.load(this, R.raw.kerrhots14, 1);
            skerrhots15= soundPool.load(this, R.raw.kerrhots15, 1);
            skerrhots16= soundPool.load(this, R.raw.kerrhots16, 1);
            skerrhots17= soundPool.load(this, R.raw.kerrhots17, 1);
            skerrhots18= soundPool.load(this, R.raw.kerrhots18, 1);
            skerrhots19= soundPool.load(this, R.raw.kerrhots19, 1);
            skerrhots110= soundPool.load(this, R.raw.kerrhots110, 1);
            skerrhots111= soundPool.load(this, R.raw.kerrhots111, 1);
            skerrhots112= soundPool.load(this, R.raw.kerrhots112, 1);
            skerrhots113= soundPool.load(this, R.raw.kerrhots113, 1);
            skerrhots114= soundPool.load(this, R.raw.kerrhots114, 1);
            skerrhots115= soundPool.load(this, R.raw.kerrhots115, 1);
            skerrhots116= soundPool.load(this, R.raw.kerrhots116, 1);
            skerrhots117= soundPool.load(this, R.raw.kerrhots117, 1);
            skerrhots118= soundPool.load(this, R.raw.kerrhots118, 1);
            skerrhots119= soundPool.load(this, R.raw.kerrhots119, 1);
            skerrhots120= soundPool.load(this, R.raw.kerrhots120, 1);
            skerrhots121= soundPool.load(this, R.raw.kerrhots121, 1);
            skerrhots122= soundPool.load(this, R.raw.kerrhots122, 1);
            skerrhots123= soundPool.load(this, R.raw.kerrhots123, 1);
            skerrhots124= soundPool.load(this, R.raw.kerrhots124, 1);
            skerrhots125= soundPool.load(this, R.raw.kerrhots125, 1);
            skerrhots126= soundPool.load(this, R.raw.kerrhots126, 1);
            skerrhots127= soundPool.load(this, R.raw.kerrhots127, 1);
            skerrhots128= soundPool.load(this, R.raw.kerrhots128, 1);
            skerrhots129= soundPool.load(this, R.raw.kerrhots129, 1);
            skerrhots130= soundPool.load(this, R.raw.kerrhots130, 1);
            skerrhots131= soundPool.load(this, R.raw.kerrhots131, 1);
            skerrhots132= soundPool.load(this, R.raw.kerrhots132, 1);
            skerrhots133= soundPool.load(this, R.raw.kerrhots133, 1);
            skerrhots134= soundPool.load(this, R.raw.kerrhots134, 1);
            skerrhots135= soundPool.load(this, R.raw.kerrhots135, 1);
            skerrhots136= soundPool.load(this, R.raw.kerrhots136, 1);
            skerrhots137= soundPool.load(this, R.raw.kerrhots137, 1);
            skerrhots138= soundPool.load(this, R.raw.kerrhots138, 1);
            skerrhots139= soundPool.load(this, R.raw.kerrhots139, 1);
            skerrhots140= soundPool.load(this, R.raw.kerrhots140, 1);
            skerrhots141= soundPool.load(this, R.raw.kerrhots141, 1);
            skerrhots142= soundPool.load(this, R.raw.kerrhots142, 1);


    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkerrhots11:soundPool.play(skerrhots11, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots12:soundPool.play(skerrhots12, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots13:soundPool.play(skerrhots13, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots14:soundPool.play(skerrhots14, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots15:soundPool.play(skerrhots15, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots16:soundPool.play(skerrhots16, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots17:soundPool.play(skerrhots17, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots18:soundPool.play(skerrhots18, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots19:soundPool.play(skerrhots19, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots110:soundPool.play(skerrhots110, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots111:soundPool.play(skerrhots111, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots112:soundPool.play(skerrhots112, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots113:soundPool.play(skerrhots113, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots114:soundPool.play(skerrhots114, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots115:soundPool.play(skerrhots115, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots116:soundPool.play(skerrhots116, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots117:soundPool.play(skerrhots117, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots118:soundPool.play(skerrhots118, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots119:soundPool.play(skerrhots119, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots120:soundPool.play(skerrhots120, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots121:soundPool.play(skerrhots121, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots122:soundPool.play(skerrhots122, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots123:soundPool.play(skerrhots123, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots124:soundPool.play(skerrhots124, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots125:soundPool.play(skerrhots125, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots126:soundPool.play(skerrhots126, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots127:soundPool.play(skerrhots127, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots128:soundPool.play(skerrhots128, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots129:soundPool.play(skerrhots129, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots130:soundPool.play(skerrhots130, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots131:soundPool.play(skerrhots131, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots132:soundPool.play(skerrhots132, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots133:soundPool.play(skerrhots133, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots134:soundPool.play(skerrhots134, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots135:soundPool.play(skerrhots135, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots136:soundPool.play(skerrhots136, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots137:soundPool.play(skerrhots137, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots138:soundPool.play(skerrhots138, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots139:soundPool.play(skerrhots139, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots140:soundPool.play(skerrhots140, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots141:soundPool.play(skerrhots141, 1, 1, 0, 0, 1); break;
        case R.id.bkerrhots142:soundPool.play(skerrhots142, 1, 1, 0, 0, 1); break;
        }
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}