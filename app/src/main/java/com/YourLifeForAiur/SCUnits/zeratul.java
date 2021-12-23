package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class zeratul extends AppCompatActivity{
    Intent zeratul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeratul);
    }

    public void actzer (View view){
        switch (view.getId()) {
            case R.id.bzerbw:
                zeratul = new Intent(this, zeratulbw.class);
                startActivity(zeratul);
                break;
            case R.id.bzerwol:
                zeratul = new Intent(this, zeratulwol.class);
                startActivity(zeratul);
                break;
            case R.id.bzerlotv:
                zeratul = new Intent(this, zeratullotv.class);
                startActivity(zeratul);
                break;
        }
    }
}