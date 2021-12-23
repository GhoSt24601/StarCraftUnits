package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class zeratullotv extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeratullotv);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bzerlotv1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv1); mediaPlayer.start();  break;
            case R.id.bzerlotv2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv2); mediaPlayer.start();  break;
            case R.id.bzerlotv3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv3); mediaPlayer.start();  break;
            case R.id.bzerlotv4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv4); mediaPlayer.start();  break;
            case R.id.bzerlotv5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv5); mediaPlayer.start();  break;
            case R.id.bzerlotv6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv6); mediaPlayer.start();  break;
            case R.id.bzerlotv7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv7); mediaPlayer.start();  break;
            case R.id.bzerlotv8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv8); mediaPlayer.start();  break;
            case R.id.bzerlotv9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv9); mediaPlayer.start();  break;
            case R.id.bzerlotv10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv10); mediaPlayer.start();  break;
            case R.id.bzerlotv11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv11); mediaPlayer.start();  break;
            case R.id.bzerlotv12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv12); mediaPlayer.start();  break;
            case R.id.bzerlotv13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv13); mediaPlayer.start();  break;
            case R.id.bzerlotv14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv14); mediaPlayer.start();  break;
            case R.id.bzerlotv15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv15); mediaPlayer.start();  break;
            case R.id.bzerlotv16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv16); mediaPlayer.start();  break;
            case R.id.bzerlotv17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv17); mediaPlayer.start();  break;
            case R.id.bzerlotv18: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv18); mediaPlayer.start();  break;
            case R.id.bzerlotv19: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.zerlotv19); mediaPlayer.start();  break;

        }

    }
}