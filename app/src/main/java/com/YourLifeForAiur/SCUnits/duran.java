package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class duran extends AppCompatActivity{
    Intent duran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duran);
    }

    public void actdur (View view){
        switch (view.getId()) {
            case R.id.bdurter:
                duran = new Intent(this, duranter.class);
                startActivity(duran);
                break;
            case R.id.bdurzerg:
                duran = new Intent(this, duranzerg.class);
                startActivity(duran);
                break;
        }
    }
}