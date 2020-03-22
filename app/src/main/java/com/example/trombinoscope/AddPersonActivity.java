package com.example.trombinoscope;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trombinoscope.DAO.IPersonDAO;
import com.example.trombinoscope.DAO.PersonDAOData;
import com.example.trombinoscope.DTO.Person;

public class AddPersonActivity extends AppCompatActivity {
    private static final String TAG = "AddPersonActivity";

    EditText firstName;
    EditText lastName;
    Button btnAddPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final IPersonDAO personDAO  = new PersonDAOData();

        setContentView(R.layout.activity_add_person);
        firstName = (EditText) findViewById(R.id.lastname);
        lastName  = (EditText) findViewById(R.id.firstname);

        btnAddPerson = (Button) findViewById(R.id.btn_add_person);
        btnAddPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Person person = new Person(firstName.getText().toString(), lastName.getText().toString(), Color.BLACK);
                personDAO.addPerson(person);
                Toast.makeText(getApplicationContext(), "Ajout reussi", Toast.LENGTH_LONG).show();

                firstName.setText("");
                lastName.setText("");
            }
        });
    }

}
