package com.adminomkar.kanadaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

import static android.R.attr.id;
public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> color =new ArrayList<Word>();
        /* Word w=new Word("kannada","english);
        color.add(w);
         */
        color.add(new Word("Bili","White",R.drawable.color_white));
        color.add(new Word("Kempu","Red",R.drawable.color_red));
        color.add(new Word("neeli","Blue",R.drawable.color_blue));
        color.add(new Word("Haladhi","Yellow",R.drawable.color_mustard_yellow));
        color.add(new Word("Hasiru","Green",R.drawable.color_green));
        color.add(new Word("Boodu","Gray",R.drawable.color_gray));
        color.add(new Word("Kandu","Brown",R.drawable.color_brown));
        color.add(new Word("Kappu","Black",R.drawable.color_black));





        //ArrayAdapter<Word> numbers =new ArrayAdapter<Word>(this,R.layout.list_item,color);
        //new word adapter object
        WordAdapter colors =new WordAdapter(this,color);
        ListView listcolors = (ListView)findViewById(R.id.activity_colors);
        listcolors.setAdapter(colors);
    }
}
