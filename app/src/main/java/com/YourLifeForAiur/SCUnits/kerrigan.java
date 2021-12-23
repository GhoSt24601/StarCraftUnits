package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class kerrigan extends AppCompatActivity{
    Intent kerrigan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerrigan);
    }

    public void actkerr (View view){
        switch (view.getId()) {
            case R.id.bkerrsc1:
                kerrigan = new Intent(this, kerrigansc1.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrisc1:
                kerrigan = new Intent(this, korolevasc1.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrwol:
                kerrigan = new Intent(this, korolevawol.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrgh:
                kerrigan = new Intent(this, kerriganhots.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrgh2:
                kerrigan = new Intent(this, kerriganhots2.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrhots:
                kerrigan = new Intent(this, korolevahots.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrlotv:
                kerrigan = new Intent(this, korolevalotv.class);
                startActivity(kerrigan);
                break;
            case R.id.bkerrxel:
                kerrigan = new Intent(this, xelnaga.class);
                startActivity(kerrigan);
                break;
        }
    }
}