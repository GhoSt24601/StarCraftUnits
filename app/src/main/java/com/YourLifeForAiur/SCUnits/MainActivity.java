package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bheroes = (Button) findViewById(R.id.bheroes);
        bheroes.setOnClickListener(this);
        Button bunits = (Button) findViewById(R.id.bunits);
        bunits.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.bheroes:
                    Intent i;
                    i = new Intent(this, Heroes.class);
                    startActivity(i);
                    break;

                case R.id.bunits:
                    Intent a;
                    a = new Intent(this, Units.class);
                    startActivity(a);
                    break;

                default:
                    break;
            }

        }
    }
