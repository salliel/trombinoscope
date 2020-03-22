package com.example.trombinoscope.DAO;


import com.example.trombinoscope.DTO.Person;

import java.util.List;

public interface IPersonDAO {
    //public List<Person> getPerson();


    public  List<Person> getPersons();

    public void addPerson(Person person);

    public void removePerson(Person person);

}
