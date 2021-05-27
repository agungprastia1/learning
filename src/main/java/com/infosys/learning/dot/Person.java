package com.infosys.learning.dot;

import java.time.Year;
public class Person {

    private String name;
    int tahun,age;
    Data data = new Data();


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTahun() {
        return tahun;
    }



    public int getData (){
       age = Year.now().getValue() - getTahun();
       return age;
    }




}
