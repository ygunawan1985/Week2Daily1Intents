package com.example.weektwodayoneintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class PersonActivity extends AppCompatActivity {

    EditText etFirstName, etLastName, etGender, etAge, etMaritalStatus;
    Button btnAddPerson, btnDisplayPersons;
    ArrayList<Person> persons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etGender = findViewById(R.id.etGender);
        etAge = findViewById(R.id.etAge);
        etMaritalStatus = findViewById(R.id.etMaritalStatus);
        btnAddPerson = findViewById(R.id.btnAddPerson);
        btnDisplayPersons = findViewById(R.id.btnDisplayPersons);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAddPerson:
                final String firstName = etFirstName.getText().toString();
                final String lastName = etLastName.getText().toString();
                final String gender = etGender.getText().toString();
                final int age = Integer.parseInt(etAge.getText().toString());
                final String maritalStatus = etMaritalStatus.getText().toString();
                persons.add(new Person(firstName, lastName, gender, age, maritalStatus));
                clearPersonFields();

                break;

            case R.id.btnDisplayPersons:
                Intent personResultActivityIntent = new Intent(this, PersonResultActivity.class);
                Bundle bundlePersons = new Bundle();
                bundlePersons.putParcelableArrayList("persons", persons);
                personResultActivityIntent.putExtras(bundlePersons);
                startActivity(personResultActivityIntent);

                break;
        }
    }

    private void clearPersonFields() {
        etFirstName.setText("");
        etLastName.setText("");
        etAge.setText("");
        etGender.setText("");
        etMaritalStatus.setText("");
    }
}
