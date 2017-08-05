package com.adminomkar.kanadaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

import static android.R.attr.id;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> no =new ArrayList<Word>();
        /* Word w=new Word("kannada","english);
        no.add(w);
         */
        no.add(new Word("sonnē","ZERO",R.drawable.zero));
        no.add(new Word("ondu","ONE",R.drawable.one));
        no.add(new Word("ēraḍu","TWO",R.drawable.two));
        no.add(new Word("mūru","THREE",R.drawable.three));
        no.add(new Word("nālku","FOUR",R.drawable.four));
        no.add(new Word("aydu","FIVE",R.drawable.five));
        no.add(new Word("āru","SIX",R.drawable.six));
        no.add(new Word("ēḷu","SEVEN",R.drawable.seven));
        no.add(new Word("ēṇṭu","EIGHT",R.drawable.eight));
        no.add(new Word("ombattu","NINE",R.drawable.nine));
        no.add(new Word("hattu","TEN",R.drawable.placeholder));




        //ArrayAdapter<Word> numbers =new ArrayAdapter<Word>(this,R.layout.list_item,no);
        //new word adapter object
        WordAdapter numbers=new WordAdapter(this,no);
        ListView listnumbers = (ListView)findViewById(R.id.activity_numbers);
        listnumbers.setAdapter(numbers);



    }
}
