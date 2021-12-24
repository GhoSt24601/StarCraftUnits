package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class duranzerg extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duranzerg);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bdurz1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz2); mediaPlayer.start();  break;
            case R.id.bdurz2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz3); mediaPlayer.start();  break;
            case R.id.bdurz3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz4); mediaPlayer.start();  break;
            case R.id.bdurz4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz5); mediaPlayer.start();  break;
            case R.id.bdurz5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz6); mediaPlayer.start();  break;
            case R.id.bdurz6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz7); mediaPlayer.start();  break;
            case R.id.bdurz7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz8); mediaPlayer.start();  break;
            case R.id.bdurz8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz9); mediaPlayer.start();  break;
            case R.id.bdurz9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz10); mediaPlayer.start();  break;
            case R.id.bdurz10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz11); mediaPlayer.start();  break;
            case R.id.bdurz11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz12); mediaPlayer.start();  break;
            case R.id.bdurz12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz13); mediaPlayer.start();  break;
            case R.id.bdurz13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz14); mediaPlayer.start();  break;
            case R.id.bdurz14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz15); mediaPlayer.start();  break;
            case R.id.bdurz15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz16); mediaPlayer.start();  break;
            case R.id.bdurz16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz17); mediaPlayer.start();  break;
            case R.id.bdurz17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.durz18); mediaPlayer.start();  break;


        }

    }
}