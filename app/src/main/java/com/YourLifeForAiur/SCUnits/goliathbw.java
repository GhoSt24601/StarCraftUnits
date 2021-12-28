package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class goliathbw extends AppCompatActivity{

    private MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goliathbw);






    }

    public void playSound (View view){
        switch (view.getId()) {

            case R.id.bgolbw1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw1); mediaPlayer.start();  break;
            case R.id.bgolbw2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw2); mediaPlayer.start();  break;
            case R.id.bgolbw3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw3); mediaPlayer.start();  break;
            case R.id.bgolbw4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw4); mediaPlayer.start();  break;
            case R.id.bgolbw5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw5); mediaPlayer.start();  break;
            case R.id.bgolbw6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw6); mediaPlayer.start();  break;
            case R.id.bgolbw7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw7); mediaPlayer.start();  break;
            case R.id.bgolbw8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw8); mediaPlayer.start();  break;
            case R.id.bgolbw9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw9); mediaPlayer.start();  break;
            case R.id.bgolbw10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw10); mediaPlayer.start();  break;
            case R.id.bgolbw11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw11); mediaPlayer.start();  break;
            case R.id.bgolbw12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw12); mediaPlayer.start();  break;
            case R.id.bgolbw13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw13); mediaPlayer.start();  break;
            case R.id.bgolbw14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw14); mediaPlayer.start();  break;
            case R.id.bgolbw15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.golbw15); mediaPlayer.start();  break;



        }
    }
}