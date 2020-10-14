package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> numberList=new ArrayList<Word>();

        numberList.add(new Word("One","Lutti"));
        numberList.add(new Word("Two","otiiko"));
        numberList.add(new Word("Three","tolookosu"));
        numberList.add(new Word("Four","oyyiisa"));
        numberList.add(new Word("Five","massokka"));
        numberList.add(new Word("Six","temmokka"));
        numberList.add(new Word("Seven","kenekaku"));
        numberList.add(new Word("Eight","kawinta"));
        numberList.add(new Word("Nine","wo'e"));
        numberList.add(new Word("Ten","na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, numberList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}