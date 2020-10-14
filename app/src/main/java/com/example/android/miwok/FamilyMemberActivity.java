package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> numberList=new ArrayList<Word>();

        numberList.add(new Word("Father","әpә"));
        numberList.add(new Word("Mother","әṭa"));
        numberList.add(new Word("Son","angsi"));
        numberList.add(new Word("Daughter","tune"));
        numberList.add(new Word("Older Brother","taachi"));
        numberList.add(new Word("Younger Brother","chalitti"));
        numberList.add(new Word("Older Sister","teṭe"));
        numberList.add(new Word("Younger Sister","kolliti"));
        numberList.add(new Word("GrandMother","ama"));
        numberList.add(new Word("GrandFather","paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this, numberList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}