package com.example.nfatma.novapp;

public class ModelStudent {

    String Name;
    String Age;
    String Gender;

    public ModelStudent(String name, String age, String gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setSname(String sname) {
        Name = sname;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
