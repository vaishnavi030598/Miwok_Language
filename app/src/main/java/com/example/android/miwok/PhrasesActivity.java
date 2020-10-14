package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> numberList=new ArrayList<Word>();

        numberList.add(new Word("Where are you going?","minto wuksus"));
        numberList.add(new Word("What is your name?","tinnә oyaase'nә"));
        numberList.add(new Word("My name is...","oyaaset..."));
        numberList.add(new Word("How are you feeling?","michәksәs?"));
        numberList.add(new Word("I’m feeling good.","kuchi achit"));
        numberList.add(new Word("Are you coming?","әәnәs'aa?"));
        numberList.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        numberList.add(new Word("I’m coming.","әәnәm"));
        numberList.add(new Word("Let’s go.","yoowutis"));
        numberList.add(new Word("Come here.","әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, numberList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}