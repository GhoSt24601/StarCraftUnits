package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bc extends AppCompatActivity {
    Intent bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc);
    }
    public void actbc (View view) {
        switch (view.getId()) {
            case R.id.bbcbw:
                bc = new Intent(this, bcbw.class);
                startActivity(bc);
                break;
            case R.id.bbcsc2:
                bc = new Intent(this, bcsc2.class);
                startActivity(bc);
                break;
        }
    }
}