package com.example.trombinoscope.DAO;

import android.graphics.Color;


import com.example.trombinoscope.DTO.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOData implements IPersonDAO {

    private static List<Person> persons= new ArrayList<Person>() {{
        add(new Person("PRENOM1", "NOM1", Color.BLACK));
        add(new Person("PRENOM2", "NOM2", Color.BLUE));
    }};

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public void removePerson(Person person) {
        persons.remove(person);
    }
}