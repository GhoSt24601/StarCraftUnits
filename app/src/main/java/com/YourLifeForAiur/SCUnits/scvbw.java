package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class scvbw extends AppCompatActivity{

    private MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scvbw);






    }

    public void playSound (View view){
        switch (view.getId()) {

            case R.id.bscvbw1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw1); mediaPlayer.start();  break;
            case R.id.bscvbw2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw2); mediaPlayer.start();  break;
            case R.id.bscvbw3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw3); mediaPlayer.start();  break;
            case R.id.bscvbw4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw4); mediaPlayer.start();  break;
            case R.id.bscvbw5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw5); mediaPlayer.start();  break;
            case R.id.bscvbw6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw6); mediaPlayer.start();  break;
            case R.id.bscvbw7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw7); mediaPlayer.start();  break;
            case R.id.bscvbw8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw8); mediaPlayer.start();  break;
            case R.id.bscvbw9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw9); mediaPlayer.start();  break;
            case R.id.bscvbw10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw10); mediaPlayer.start();  break;
            case R.id.bscvbw11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw11); mediaPlayer.start();  break;
            case R.id.bscvbw12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw12); mediaPlayer.start();  break;
            case R.id.bscvbw13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw13); mediaPlayer.start();  break;
            case R.id.bscvbw14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw14); mediaPlayer.start();  break;
            case R.id.bscvbw15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw15); mediaPlayer.start();  break;
            case R.id.bscvbw16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw18); mediaPlayer.start();  break;
            case R.id.bscvbw17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw17); mediaPlayer.start();  break;
            case R.id.bscvbw18: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw16); mediaPlayer.start();  break;
            case R.id.bscvbw19: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.scvbw19); mediaPlayer.start();  break;



        }
    }
}