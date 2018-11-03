package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "otiiko"));
        words.add(new Word("My name is...", "tolookosu"));
        words.add(new Word("How are you feeling?", "oyyisa"));
        words.add(new Word("I’m feeling good.", "massokka"));
        words.add(new Word("Are you coming?", "temmokka"));
        words.add(new Word("Yes, I’m coming.", "kenekaku"));
        words.add(new Word("I’m coming.", "kawinta"));
        words.add(new Word("Let’s go.", "wo'e"));
        words.add(new Word("Come here.", "n'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
