package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class nova extends AppCompatActivity{
    Intent nova;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);
    }

    public void actnov (View view){
        switch (view.getId()) {
            case R.id.bnovwol:
                nova = new Intent(this, novawol.class);
                startActivity(nova);
                break;
            case R.id.bnovlotv:
                nova = new Intent(this, novalotv.class);
                startActivity(nova);
                break;
        }
    }
}