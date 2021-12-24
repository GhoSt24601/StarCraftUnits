package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class artaniswol extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artaniswol);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bartawol1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol1); mediaPlayer.start();  break;
            case R.id.bartawol2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol2); mediaPlayer.start();  break;
            case R.id.bartawol3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol3); mediaPlayer.start();  break;
            case R.id.bartawol4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol4); mediaPlayer.start();  break;
            case R.id.bartawol5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol5); mediaPlayer.start();  break;
            case R.id.bartawol6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol6); mediaPlayer.start();  break;
            case R.id.bartawol7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol7); mediaPlayer.start();  break;
            case R.id.bartawol8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol8); mediaPlayer.start();  break;
            case R.id.bartawol9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol9); mediaPlayer.start();  break;
            case R.id.bartawol10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol10); mediaPlayer.start();  break;
            case R.id.bartawol11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol11); mediaPlayer.start();  break;
            case R.id.bartawol12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol12); mediaPlayer.start();  break;
            case R.id.bartawol13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol13); mediaPlayer.start();  break;
            case R.id.bartawol14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol14); mediaPlayer.start();  break;
            case R.id.bartawol15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol15); mediaPlayer.start();  break;
            case R.id.bartawol16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol16); mediaPlayer.start();  break;
            case R.id.bartawol17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol17); mediaPlayer.start();  break;
            case R.id.bartawol18: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol18); mediaPlayer.start();  break;
            case R.id.bartawol19: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol19); mediaPlayer.start();  break;
            case R.id.bartawol20: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol20); mediaPlayer.start();  break;
            case R.id.bartawol21: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol21); mediaPlayer.start();  break;
            case R.id.bartawol22: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artawol22); mediaPlayer.start();  break;


        }

    }
}