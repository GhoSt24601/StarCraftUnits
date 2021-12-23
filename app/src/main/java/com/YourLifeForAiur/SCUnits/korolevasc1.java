package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class korolevasc1 extends AppCompatActivity{

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korolevasc1);



    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkorbw1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw1); mediaPlayer.start();  break;
            case R.id.bkorbw2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw2); mediaPlayer.start();  break;
            case R.id.bkorbw3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw3); mediaPlayer.start();  break;
            case R.id.bkorbw4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw4); mediaPlayer.start();  break;
            case R.id.bkorbw5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw5); mediaPlayer.start();  break;
            case R.id.bkorbw6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw6); mediaPlayer.start();  break;
            case R.id.bkorbw7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw7); mediaPlayer.start();  break;
            case R.id.bkorbw8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw8); mediaPlayer.start();  break;
            case R.id.bkorbw9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw9); mediaPlayer.start();  break;
            case R.id.bkorbw10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw10); mediaPlayer.start();  break;
            case R.id.bkorbw11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw11); mediaPlayer.start();  break;
            case R.id.bkorbw12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.korbw12); mediaPlayer.start();  break;


        }
    }

}