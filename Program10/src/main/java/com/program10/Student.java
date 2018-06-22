package com.program10;

public class Student{

    private String name;
    String surname;
    int dateOfBirth;
    int height;

    Student(String name, String surname, int dateOfBirth, int height) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
