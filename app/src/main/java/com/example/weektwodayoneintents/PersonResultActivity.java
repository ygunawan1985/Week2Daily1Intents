package com.example.weektwodayoneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PersonResultActivity extends AppCompatActivity {

    ListView lvDisplayPersons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_result);

        lvDisplayPersons = findViewById(R.id.lvDisplayPersons);
        Intent passedIntent = getIntent();
        Bundle passedPersonsBundle = passedIntent.getExtras();

        if(passedPersonsBundle != null) {
            ArrayList<Person> persons = passedPersonsBundle.getParcelableArrayList("persons");
            ArrayList<String> strings = new ArrayList<>();

            for (Person person : persons) {
                strings.add(person.toString());
            }

            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strings);
            lvDisplayPersons.setAdapter(arrayAdapter);
        }
    }
}
