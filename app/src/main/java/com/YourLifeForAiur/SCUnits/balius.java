package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class balius extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balius);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bbal1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal1); mediaPlayer.start();  break;
            case R.id.bbal2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal2); mediaPlayer.start();  break;
            case R.id.bbal3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal3); mediaPlayer.start();  break;
            case R.id.bbal4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal4); mediaPlayer.start();  break;
            case R.id.bbal5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal5); mediaPlayer.start();  break;
            case R.id.bbal6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal6); mediaPlayer.start();  break;
            case R.id.bbal7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal7); mediaPlayer.start();  break;
            case R.id.bbal8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal8); mediaPlayer.start();  break;
            case R.id.bbal9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bal9); mediaPlayer.start();  break;


        }

    }
}