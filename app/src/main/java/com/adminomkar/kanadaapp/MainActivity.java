package com.adminomkar.kanadaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
        ImageView numberi=(ImageView) findViewById(R.id.noimage);
        ImageView phrasesi=(ImageView) findViewById(R.id.phrasesimage);
        ImageView commoni=(ImageView) findViewById(R.id.commonimages);

        ImageView familyi=(ImageView) findViewById(R.id.familyimage);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i1);


            }
        });
        numberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vie) {
                Intent i11 = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i11);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {

                Intent i2 = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(i2);



            }
        });
        familyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i22 = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(i22);
            }
        });
        common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

                Intent i3 = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i3);


            }
        });
        commoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent i33= new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i33);

            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {

                Intent i4 = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i4);

            }
        });
        phrasesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                Intent i44 = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i44);
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


