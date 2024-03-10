package com.campus.console;

import com.campus.core.Person;
import com.campus.service.PersonService;

public class App {

    private  static PersonService personService = new PersonService();
    public static void main(String[] args){
        System.out.println("Hello World");

        Person person = new Person();
        person.setFirstName("Jon");
        person.setLastName("Smith");
        System.out.println(person);

       // String json = personService.convert(person);
        //System.out.println(json);

       // Person fromJson = personService.parse(json);
        //System.out.println(fromJson);
    }
}
