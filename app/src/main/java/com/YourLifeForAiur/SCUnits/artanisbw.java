package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class artanisbw extends AppCompatActivity{

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artanisbw);

    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bartabw1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw1); mediaPlayer.start();  break;
            case R.id.bartabw2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw2); mediaPlayer.start();  break;
            case R.id.bartabw3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw3); mediaPlayer.start();  break;
            case R.id.bartabw4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw4); mediaPlayer.start();  break;
            case R.id.bartabw5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw5); mediaPlayer.start();  break;
            case R.id.bartabw6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw6); mediaPlayer.start();  break;
            case R.id.bartabw7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw7); mediaPlayer.start();  break;
            case R.id.bartabw8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw8); mediaPlayer.start();  break;
            case R.id.bartabw9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw9); mediaPlayer.start();  break;
            case R.id.bartabw10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw10); mediaPlayer.start();  break;
            case R.id.bartabw11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw11); mediaPlayer.start();  break;
            case R.id.bartabw12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw12); mediaPlayer.start();  break;
            case R.id.bartabw13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw13); mediaPlayer.start();  break;
            case R.id.bartabw14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.artabw14); mediaPlayer.start();  break;
        }
    }

}