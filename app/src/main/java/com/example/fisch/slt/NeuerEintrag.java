package com.example.fisch.slt;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Date;

public class NeuerEintrag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neuer_eintrag);





    }

    public void btn_Speichern_onclick(View view){

        TextView sportart = (TextView) findViewById(R.id.autoCompleteTextViewSportart);
        EditText streckeText = (EditText) findViewById(R.id.editTextStrecke);



        try {


            double strecke = Double.parseDouble(streckeText.getText().toString());
            DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
            Date date = new Date(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
            TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
            //date.setHours(timePicker.getHour());
            //date.setMinutes(timePicker.getMinute());
            TagebuchEintrag neuerEintrag = new TagebuchEintrag(date, sportart.getText().toString(), strecke);
            TagebuchSchreiber.addEintrag(neuerEintrag);
            Context context = NeuerEintrag.this;
            Intent intent = new Intent(context, Main2Activity.class);
            startActivity(intent);
        }catch (Exception e){
            Toast.makeText(NeuerEintrag.this,"Fehlerhafte Eingaben",Toast.LENGTH_LONG).show();
        }

    }



}
