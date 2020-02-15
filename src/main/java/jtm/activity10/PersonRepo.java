package jtm.activity10;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import jtm.activity09.Order;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PersonRepo {

    private List<Person> personList;

    public PersonRepo() {
        init();
    }

    public void init() {

        try {
            List<String> file = Files.readAllLines(Paths.get("/home/student/Downloads/JTM_LZ/src/main/resources/data.json"));
            String fileString = String.join("\n", file);
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(fileString, Person[].class);
            this.personList = Arrays.asList(personArray);

            // 1. Read file data.json from resources folder into String
            // 2. Use ObjectMapper to convert String to List of Persons and
            // store in personList field
            //Hint: Correct way how to use ObjectMapper to convert String to List below
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person oldestPerson() {
        //Find oldest person in personList field and return it
        Person oldestPerson = personList.get(0);
        for (Person i : personList) {
            if (i.getBirthDate().compareTo(oldestPerson.getBirthDate()) < 0) {
                oldestPerson = i;
            }
        }
        return oldestPerson;
    }

    public Person youngestPerson() {
        //Find youngest person in personList field and return it
        Person youngestPerson = personList.get(0);
        for (Person i : personList) {
            if (i.getBirthDate().compareTo(youngestPerson.getBirthDate()) > 0) {
                youngestPerson = i;
            }
        }
        return youngestPerson;
    }

    public String largestPopulation() {
        //Find country with largest population and return it's name
//        Person countryCount = personList.get(0);
//        for (Person i : personList){
//            if (i.getCountry() == countryCount.getCountry()){
//                countryCount = i;
//            }
//      }
        Comparator<Person> compareByCountry = (Person p1, Person p2) -> p1.getCountry().compareTo(p2.getCountry());
        Collections.sort(personList, compareByCountry);
        int x = 1;
        int temp = 0;
        Person comp = personList.get(0);
        Person result = personList.get(0);
        for (Person i : personList) {
            if (comp.getCountry().equals(i.getCountry())) {
                x++;
                comp = i;
            } else if (!comp.getCountry().equals(i.getCountry())) {
                if (x > temp) {
                    result = comp;
                    temp = x;
                    x = 1;
                    comp = i;
                } else x = 1;
                comp = i;
            }
        }
        return result.getCountry();
    }
}







/*

Hint:
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(data, Person[].class);
            List<Person> personList = Arrays.asList(personArray);
 */
