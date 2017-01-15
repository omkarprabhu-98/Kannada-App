package com.adminomkar.kanadaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView number = (TextView) findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.familymem);
        TextView common = (TextView) findViewById(R.id.cwords);
        TextView phrases = (TextView) findViewById(R.id.phrases);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i1);


            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(i2);



            }
        });
        common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this,CommonWordsActivity.class);
                startActivity(i3);


            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i4);

            }
        });
























































        /* instead of typing in:
        public NewOnClickListener implements View.OnClickListener(){

        @Override
        public void OnClick(View view)
        {

        //do something
        }
        }
        // in the main class in the onCreate method

        TextView number = (TextView) findViewById(R.id.activity_main);
        NewOnClickListener inst = new NewOnClickListener();
        number.setOnClickListener(inst);



         */







    }










}


