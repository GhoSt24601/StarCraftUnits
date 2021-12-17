package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kerrigansc1 extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer skerrbw1, skerrbw2,skerrbw3, skerrbw4,skerrbw5, skerrbw6,skerrbw7,skerrbw8, skerrbw9, skerrbw10, skerrbw11,skerrbw12, skerrbw13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerrigansc1);
        Button bkerrbw1 = (Button) findViewById(R.id.bkerrbw1);
        bkerrbw1.setOnClickListener(this);
        Button bkerrbw2 = (Button) findViewById(R.id.bkerrbw2);
        bkerrbw2.setOnClickListener(this);
        Button bkerrbw3 = (Button) findViewById(R.id.bkerrbw3);
        bkerrbw3.setOnClickListener(this);
        Button bkerrbw4 = (Button) findViewById(R.id.bkerrbw4);
        bkerrbw4.setOnClickListener(this);
        Button bkerrbw5 = (Button) findViewById(R.id.bkerrbw5);
        bkerrbw5.setOnClickListener(this);
        Button bkerrbw6 = (Button) findViewById(R.id.bkerrbw6);
        bkerrbw6.setOnClickListener(this);
        Button bkerrbw7 = (Button) findViewById(R.id.bkerrbw7);
        bkerrbw7.setOnClickListener(this);
        Button bkerrbw8 = (Button) findViewById(R.id.bkerrbw8);
        bkerrbw8.setOnClickListener(this);
        Button bkerrbw9 = (Button) findViewById(R.id.bkerrbw9);
        bkerrbw9.setOnClickListener(this);
        Button bkerrbw10 = (Button) findViewById(R.id.bkerrbw10);
        bkerrbw10.setOnClickListener(this);
        Button bkerrbw11 = (Button) findViewById(R.id.bkerrbw11);
        bkerrbw11.setOnClickListener(this);
        Button bkerrbw12 = (Button) findViewById(R.id.bkerrbw12);
        bkerrbw12.setOnClickListener(this);
        Button bkerrbw13 = (Button) findViewById(R.id.bkerrbw13);
        bkerrbw13.setOnClickListener(this);
        skerrbw1 = MediaPlayer.create(this, R.raw.kerrbw1);
        skerrbw2 = MediaPlayer.create(this, R.raw.kerrbw2);
        skerrbw3 = MediaPlayer.create(this, R.raw.kerrbw3);
        skerrbw4 = MediaPlayer.create(this, R.raw.kerrbw4);
        skerrbw5 = MediaPlayer.create(this, R.raw.kerrbw5);
        skerrbw6 = MediaPlayer.create(this, R.raw.kerrbw6);
        skerrbw7 = MediaPlayer.create(this, R.raw.kerrbw7);
        skerrbw8 = MediaPlayer.create(this, R.raw.kerrbw8);
        skerrbw9 = MediaPlayer.create(this, R.raw.kerrbw9);
        skerrbw10 = MediaPlayer.create(this, R.raw.kerrbw10);
        skerrbw11 = MediaPlayer.create(this, R.raw.kerrbw11);
        skerrbw12 = MediaPlayer.create(this, R.raw.kerrbw12);
        skerrbw13 = MediaPlayer.create(this, R.raw.kerrbw13);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.bkerrbw1:
                soundPlay(skerrbw1);
                break;
            case R.id.bkerrbw2:
                soundPlay(skerrbw2);
                break;
            case R.id.bkerrbw3:
                soundPlay(skerrbw3);
                break;
            case R.id.bkerrbw4:
                soundPlay(skerrbw4);
                break;
            case R.id.bkerrbw5:
                soundPlay(skerrbw5);
                break;
            case R.id.bkerrbw6:
                soundPlay(skerrbw6);
                break;
            case R.id.bkerrbw7:
                soundPlay(skerrbw7);
                break;
            case R.id.bkerrbw8:
                soundPlay(skerrbw8);
                break;
            case R.id.bkerrbw9:
                soundPlay(skerrbw9);
                break;
            case R.id.bkerrbw10:
                soundPlay(skerrbw10);
                break;
            case R.id.bkerrbw11:
                soundPlay(skerrbw11);
                break;
            case R.id.bkerrbw12:
                soundPlay(skerrbw12);
                break;
            case R.id.bkerrbw13:
                soundPlay(skerrbw13);
                break;
            default:
                break;
        }
    }

    private void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}