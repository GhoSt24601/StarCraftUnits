package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kerrigan extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerrigan);
        Button bkerrsc1 = (Button) findViewById(R.id.bkerrsc1);
        bkerrsc1.setOnClickListener(this);
        Button bkerrisc1 = (Button) findViewById(R.id.bkerrisc1);
        bkerrisc1.setOnClickListener(this);
        Button bkerrwol = (Button) findViewById(R.id.bkerrwol);
        bkerrwol.setOnClickListener(this);
        Button bkerrgh = (Button) findViewById(R.id.bkerrgh);
        bkerrgh.setOnClickListener(this);
        Button bkerrhots = (Button) findViewById(R.id.bkerrhots);
        bkerrhots.setOnClickListener(this);
        Button bkerrlotv = (Button) findViewById(R.id.bkerrlotv);
        bkerrlotv.setOnClickListener(this);
        Button bkerrxel = (Button) findViewById(R.id.bkerrxel);
        bkerrxel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.bkerrsc1:
                Intent kerrsc1;
                kerrsc1 = new Intent(this, kerrigansc1.class);
                startActivity(kerrsc1);
                break;
            case R.id.bkerrisc1:
                Intent kerrisc1;
                kerrisc1 = new Intent(this, korolevasc1.class);
                startActivity(kerrisc1);
                break;
            case R.id.bkerrwol:
                Intent kerrwol;
                kerrwol = new Intent(this, korolevawol.class);
                startActivity(kerrwol);
                break;
            case R.id.bkerrgh:
                Intent kerrgh;
                kerrgh = new Intent(this, kerriganhots.class);
                startActivity(kerrgh);
                break;
            case R.id.bkerrhots:
                Intent kerrhots;
                kerrhots = new Intent(this, korolevahots.class);
                startActivity(kerrhots);
                break;
            case R.id.bkerrlotv:
                Intent kerrilotv;
                kerrilotv = new Intent(this, korolevalotv.class);
                startActivity(kerrilotv);
                break;
            case R.id.bkerrxel:
                Intent kerrxel;
                kerrxel = new Intent(this, xelnaga.class);
                startActivity(kerrxel);
                break;
            default:
                break;
        }
    }
}