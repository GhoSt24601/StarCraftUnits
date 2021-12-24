package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class urun extends AppCompatActivity{

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun);





    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.burun1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun1); mediaPlayer.start();  break;
            case R.id.burun2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun2); mediaPlayer.start();  break;
            case R.id.burun3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun3); mediaPlayer.start();  break;
            case R.id.burun4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun4); mediaPlayer.start();  break;
            case R.id.burun5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun5); mediaPlayer.start();  break;
            case R.id.burun6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun6); mediaPlayer.start();  break;
            case R.id.burun7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun7); mediaPlayer.start();  break;
            case R.id.burun8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun8); mediaPlayer.start();  break;
            case R.id.burun9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun9); mediaPlayer.start();  break;
            case R.id.burun10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun10); mediaPlayer.start();  break;
            case R.id.burun11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun11); mediaPlayer.start();  break;
            case R.id.burun12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun12); mediaPlayer.start();  break;
            case R.id.burun13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun13); mediaPlayer.start();  break;
            case R.id.burun14: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun14); mediaPlayer.start();  break;
            case R.id.burun15: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun15); mediaPlayer.start();  break;
            case R.id.burun16: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun16); mediaPlayer.start();  break;
            case R.id.burun17: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun17); mediaPlayer.start();  break;
            case R.id.burun18: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun18); mediaPlayer.start();  break;
            case R.id.burun19: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun19); mediaPlayer.start();  break;
            case R.id.burun20: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun20); mediaPlayer.start();  break;
            case R.id.burun21: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun21); mediaPlayer.start();  break;
            case R.id.burun22: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun22); mediaPlayer.start();  break;
            case R.id.burun23: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.urun23); mediaPlayer.start();  break;


        }

    }
}