package com.example.nfatma.novapp;

public class RecylerViewModel {

    String Name;
    String Age;

    public RecylerViewModel(String name, String age){

        Name = name;
        Age = age;
    }

    public String getName(){
        return Name;
    }

    public String getAge(){
        return Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(String age) {
        Age = age;
    }

}
