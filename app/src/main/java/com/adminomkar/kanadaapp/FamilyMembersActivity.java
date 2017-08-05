package com.adminomkar.kanadaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

import static android.R.attr.id;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
         ArrayList<Word> family =new ArrayList<Word>();
        /* Word w=new Word("kannada","english);
        family.add(w);
         */
        family.add(new Word(" Appa","How are you?",));
        family.add(new Word("Amma","What are you doing?"));
        family.add(new Word(" Appa","What is the time?"));
        family.add(new Word("Amma","I do not know Kannada"));
        family.add(new Word(" Appa","Can you talk in Hindi or English?"));
        family.add(new Word("Amma","Could you write it down please?"));
        family.add(new Word(" Appa","Father"));
        family.add(new Word("Amma","Mother"));
        family.add(new Word(" Appa","Father"));
        family.add(new Word("Amma","Mother"));
        family.add(new Word(" Appa","Father"));





        //ArrayAdapter<Word> numbers =new ArrayAdapter<Word>(this,R.layout.list_item,family);
        //new word adapter object
        WordAdapter familymem=new WordAdapter(this,family);
        ListView listfamily = (ListView)findViewById(R.id.activity_family_members);
        listfamily.setAdapter(familymem);
    }
}
