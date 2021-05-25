package com.infosys.learning.service;

import com.infosys.learning.dot.Person;
import org.springframework.stereotype.Service;

@Service
public class LearningService {

    public String getName(String gender){
        Person person = new Person();

        if ("man".equals(gender)){
            person.setName("Jhony");
        }else{
            person.setName("Jenny");
        }

        return person.getName();
    }

    public Person getNameV2(String gender){
        Person person = new Person();

        if ("man".equals(gender)){
            person.setName("John");
        }else{
            person.setName("Jane");
        }

        return person;
    }

    public static String getNameV3(String name){
        String fullname = "Not Identifier";

        if ("john".equals(name)){
            fullname = "John Doe";
        }else if("Jane".equals(name)){
            fullname = "jenny Jane";
        }

        return fullname;
    }
}
