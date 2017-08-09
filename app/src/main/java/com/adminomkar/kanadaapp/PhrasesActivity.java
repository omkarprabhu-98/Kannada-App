package com.adminomkar.kanadaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("Namaskāra", "Hello"));
        phrases.add(new Word("Hegiddērā?","How are you?"));
        phrases.add(new Word("Samaya ēnu","What is the time?"));
        phrases.add(new Word("Nanage kannaḍa gottilla","I don't know Kannada"));
        phrases.add(new Word("Nīvu hindi athavā english mātanāḍabahudē?","Can you talk in Hindi or English?"));
        phrases.add(new Word("Dayaviṭṭu adannu nīvu bareyabahudē?","Could you write it down please?"));

        WordAdapter phrasesadap =new WordAdapter(this,phrases);
        ListView listPhrases = (ListView)findViewById(R.id.activity_phrases);
        listPhrases.setAdapter(phrasesadap);
    }


}
