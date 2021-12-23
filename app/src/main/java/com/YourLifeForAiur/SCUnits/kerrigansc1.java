package com.YourLifeForAiur.SCUnits;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class kerrigansc1 extends AppCompatActivity{

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerrigansc1);

    }

    public void playSound (View view){
        switch (view.getId()) {
            case R.id.bkerrbw1: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw1); mediaPlayer.start();  break;
            case R.id.bkerrbw2: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw2); mediaPlayer.start();  break;
            case R.id.bkerrbw3: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw3); mediaPlayer.start();  break;
            case R.id.bkerrbw4: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw4); mediaPlayer.start();  break;
            case R.id.bkerrbw5: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw5); mediaPlayer.start();  break;
            case R.id.bkerrbw6: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw6); mediaPlayer.start();  break;
            case R.id.bkerrbw7: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw7); mediaPlayer.start();  break;
            case R.id.bkerrbw8: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw8); mediaPlayer.start();  break;
            case R.id.bkerrbw9: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw9); mediaPlayer.start();  break;
            case R.id.bkerrbw10: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw10); mediaPlayer.start();  break;
            case R.id.bkerrbw11: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw11); mediaPlayer.start();  break;
            case R.id.bkerrbw12: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw12); mediaPlayer.start();  break;
            case R.id.bkerrbw13: if (mediaPlayer!=null) {mediaPlayer.release(); mediaPlayer=null;} mediaPlayer = MediaPlayer.create(this, R.raw.kerrbw13); mediaPlayer.start();  break;

        }
    }

}