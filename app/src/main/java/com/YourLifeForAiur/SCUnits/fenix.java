package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class fenix extends AppCompatActivity{
    Intent fenix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenix);
    }

    public void actfen (View view){
        switch (view.getId()) {
            case R.id.bfenz:
                fenix = new Intent(this, fenixz.class);
                startActivity(fenix);
                break;
            case R.id.bfend:
                fenix = new Intent(this, fenixd.class);
                startActivity(fenix);
                break;
            case R.id.bfenlotv:
                fenix = new Intent(this, fenixlotv.class);
                startActivity(fenix);
                break;
        }
    }
}