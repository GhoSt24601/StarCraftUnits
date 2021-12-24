package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class selendis extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selendis);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bsel1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel1); mediaPlayer.start();  break;
            case R.id.bsel2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel2); mediaPlayer.start();  break;
            case R.id.bsel3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel3); mediaPlayer.start();  break;
            case R.id.bsel4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel4); mediaPlayer.start();  break;
            case R.id.bsel5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel5); mediaPlayer.start();  break;
            case R.id.bsel6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel6); mediaPlayer.start();  break;
            case R.id.bsel7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel7); mediaPlayer.start();  break;
            case R.id.bsel8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel8); mediaPlayer.start();  break;
            case R.id.bsel9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel9); mediaPlayer.start();  break;
            case R.id.bsel10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel10); mediaPlayer.start();  break;
            case R.id.bsel11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel11); mediaPlayer.start();  break;
            case R.id.bsel12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel12); mediaPlayer.start();  break;
            case R.id.bsel13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel13); mediaPlayer.start();  break;
            case R.id.bsel14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel14); mediaPlayer.start();  break;
            case R.id.bsel15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel15); mediaPlayer.start();  break;
            case R.id.bsel16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel16); mediaPlayer.start();  break;
            case R.id.bsel17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel17); mediaPlayer.start();  break;
            case R.id.bsel18: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel18); mediaPlayer.start();  break;
            case R.id.bsel19: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel19); mediaPlayer.start();  break;
            case R.id.bsel20: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel20); mediaPlayer.start();  break;
            case R.id.bsel21: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.sel21); mediaPlayer.start();  break;


        }

    }
}