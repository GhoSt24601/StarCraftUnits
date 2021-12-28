package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class bcbw extends AppCompatActivity{

    private MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcbw);






    }

    public void playSound (View view){
        switch (view.getId()) {

            case R.id.bbcbw1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw1); mediaPlayer.start();  break;
            case R.id.bbcbw2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw2); mediaPlayer.start();  break;
            case R.id.bbcbw3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw3); mediaPlayer.start();  break;
            case R.id.bbcbw4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw4); mediaPlayer.start();  break;
            case R.id.bbcbw5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw5); mediaPlayer.start();  break;
            case R.id.bbcbw6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw6); mediaPlayer.start();  break;
            case R.id.bbcbw7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw7); mediaPlayer.start();  break;
            case R.id.bbcbw8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw8); mediaPlayer.start();  break;
            case R.id.bbcbw9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw9); mediaPlayer.start();  break;
            case R.id.bbcbw10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw10); mediaPlayer.start();  break;
            case R.id.bbcbw11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw11); mediaPlayer.start();  break;
            case R.id.bbcbw12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw12); mediaPlayer.start();  break;
            case R.id.bbcbw13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw13); mediaPlayer.start();  break;
            case R.id.bbcbw14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.bcbw14); mediaPlayer.start();  break;



        }
    }
}