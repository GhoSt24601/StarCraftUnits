package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mohandar extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohandar);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bmoh1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh1); mediaPlayer.start();  break;
            case R.id.bmoh2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh2); mediaPlayer.start();  break;
            case R.id.bmoh3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh3); mediaPlayer.start();  break;
            case R.id.bmoh4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh4); mediaPlayer.start();  break;
            case R.id.bmoh5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh5); mediaPlayer.start();  break;
            case R.id.bmoh6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh6); mediaPlayer.start();  break;
            case R.id.bmoh7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh7); mediaPlayer.start();  break;
            case R.id.bmoh8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh8); mediaPlayer.start();  break;
            case R.id.bmoh9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh9); mediaPlayer.start();  break;
            case R.id.bmoh10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh10); mediaPlayer.start();  break;
            case R.id.bmoh11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh11); mediaPlayer.start();  break;
            case R.id.bmoh12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh12); mediaPlayer.start();  break;
            case R.id.bmoh13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh13); mediaPlayer.start();  break;
            case R.id.bmoh14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh14); mediaPlayer.start();  break;
            case R.id.bmoh15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh15); mediaPlayer.start();  break;
            case R.id.bmoh16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh16); mediaPlayer.start();  break;
            case R.id.bmoh17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh17); mediaPlayer.start();  break;
            case R.id.bmoh18: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh18); mediaPlayer.start();  break;
            case R.id.bmoh19: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh19); mediaPlayer.start();  break;
            case R.id.bmoh20: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.moh20); mediaPlayer.start();  break;


        }

    }
}