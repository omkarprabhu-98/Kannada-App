package com.adminomkar.kanadaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
         ArrayList<Word> family =new ArrayList<Word>();
        /* Word w=new Word("kannada","english);
        family.add(w);
         */

        family.add(new Word(" Appa","Father",R.drawable.family_father));
        family.add(new Word("Amma","Mother", R.drawable.family_mother));
        family.add(new Word("Maga","Son", R.drawable.family_son));
        family.add(new Word("Magalu","Daughter", R.drawable.family_daughter));
        family.add(new Word("Anna","Older Brother", R.drawable.family_older_brother));
        family.add(new Word("Akka","Older Sister", R.drawable.family_older_sister));
        family.add(new Word("Thamma","Younger Brother", R.drawable.family_younger_brother));
        family.add(new Word("Thangi","Younger Sister", R.drawable.family_younger_sister));
        family.add(new Word("Ajja","Grandfather", R.drawable.family_grandfather));
        family.add(new Word("Ajji","Grandmother", R.drawable.family_grandmother));






        //ArrayAdapter<Word> numbers =new ArrayAdapter<Word>(this,R.layout.list_item,family);
        //new word adapter object
        WordAdapter familymem=new WordAdapter(this,family);
        ListView listfamily = (ListView)findViewById(R.id.activity_family_members);
        listfamily.setAdapter(familymem);
    }
}
