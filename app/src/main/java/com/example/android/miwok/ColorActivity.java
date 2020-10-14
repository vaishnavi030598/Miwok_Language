package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> numberList=new ArrayList<Word>();

        numberList.add(new Word("Red","weṭeṭṭi"));
        numberList.add(new Word("Green","chokokki"));
        numberList.add(new Word("Brown","ṭakaakki"));
        numberList.add(new Word("Gray","ṭopoppi"));
        numberList.add(new Word("Black","kululli"));
        numberList.add(new Word("White","kelelli"));
        numberList.add(new Word("Dusty Yellow","ṭopiisә"));
        numberList.add(new Word("Mustard Yellow","chiwiiṭә"));


        WordAdapter itemsAdapter = new WordAdapter(this, numberList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}