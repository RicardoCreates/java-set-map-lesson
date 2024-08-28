package de.ricardo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //LIST, Set, Map

        //Set
        Set<String> names = new HashSet<>();

        //Add Values
        names.add("Ricardo");
        names.add("Ricardo");
        names.add("Maria");
        names.add("Lara");

        //Remove Values
        names.remove("Maria");

        System.out.println(names);

        //Is Value present?
        boolean x = names.contains("Ricardo");
        System.out.println(x);

        //How many Values
        int y = names.size();
        System.out.println(y);

        //Set = unsortierte Liste, die keine Duplikate zulässt

        //Map -> Key, Value
        Map<String, Person> persons = new HashMap<>();

        Person person1 = new Person("Ricardo", 25, "12345");
        Person person2 = new Person("Thomas", 37, "12456");

        //Add Values
        persons.put(person1.getSocialSecurityNumber(), person1);
        persons.put(person2.getSocialSecurityNumber(), person2);

        System.out.println(persons);

        //Get Value from Map
        System.out.println(persons.get("12345"));

        //Just get Values
        System.out.println(persons.values());

        //Just get Keys
        System.out.println(persons.keySet());

        //Remove Object
        persons.remove("12345");
        System.out.println(persons);

        //Check if key exists
        boolean isPresent = persons.containsKey("1");
        System.out.println(isPresent);


    }
}