package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class duranter extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duranter);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bdurt1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt2); mediaPlayer.start();  break;
            case R.id.bdurt2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt3); mediaPlayer.start();  break;
            case R.id.bdurt3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt4); mediaPlayer.start();  break;
            case R.id.bdurt4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt5); mediaPlayer.start();  break;
            case R.id.bdurt5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt6); mediaPlayer.start();  break;
            case R.id.bdurt6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt7); mediaPlayer.start();  break;
            case R.id.bdurt7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt8); mediaPlayer.start();  break;
            case R.id.bdurt8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt9); mediaPlayer.start();  break;
            case R.id.bdurt9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt10); mediaPlayer.start();  break;
            case R.id.bdurt10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt11); mediaPlayer.start();  break;
            case R.id.bdurt11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt12); mediaPlayer.start();  break;
            case R.id.bdurt12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt13); mediaPlayer.start();  break;
            case R.id.bdurt13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt14); mediaPlayer.start();  break;
            case R.id.bdurt14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt15); mediaPlayer.start();  break;
            case R.id.bdurt15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt16); mediaPlayer.start();  break;
            case R.id.bdurt16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt17); mediaPlayer.start();  break;
            case R.id.bdurt17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durt18); mediaPlayer.start();  break;


        }

    }
}