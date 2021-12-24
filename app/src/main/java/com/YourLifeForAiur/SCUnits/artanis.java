package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class artanis extends AppCompatActivity{
    Intent artanis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artanis);
    }

    public void actarta (View view){
        switch (view.getId()) {
            case R.id.bartabw:
                artanis = new Intent(this, artanisbw.class);
                startActivity(artanis);
                break;
            case R.id.bartawol:
                artanis = new Intent(this, artaniswol.class);
                startActivity(artanis);
                break;
            case R.id.bartalotv:
                artanis = new Intent(this, artanislotv.class);
                startActivity(artanis);
                break;
        }
    }
}