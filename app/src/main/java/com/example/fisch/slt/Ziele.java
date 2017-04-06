package com.example.fisch.slt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ziele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ziele);

        TextView textInArbeit = (TextView) findViewById(R.id.textViewZiele);
        textInArbeit.setText("Aktivität Ziele in Arbeit");
    }
}
