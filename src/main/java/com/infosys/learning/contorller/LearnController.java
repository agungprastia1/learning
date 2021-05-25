package com.infosys.learning.contorller;

import com.infosys.learning.dot.Person;
import com.infosys.learning.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class LearnController {

    @Autowired
    LearningService learningService;

    @GetMapping(value = "/getpersonname")
    public String getPersonName(@RequestParam(value = "gender", defaultValue = "gender") String gender){
        return learningService.getName(gender);
    }

    @GetMapping(value = "/getpersonnamev2")
    public Person getPersonNamev2(@RequestParam(value = "gender",defaultValue = "gender") String gender){
        return learningService.getNameV2(gender);
    }

    @PostMapping(value = "/getpersonnamev3", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public String getPersonNameV3(@RequestBody(required = true) Person person){
        return LearningService.getNameV3(person.getName());
    }

}
