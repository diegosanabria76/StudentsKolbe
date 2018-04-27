package com.example.diegosanabriabecerra.studentskolbe;

public class student {
    String name;
    String lastName;
    String codigoStudent;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCodigoStudent(String codigoStudent) {
        this.codigoStudent = codigoStudent;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCodigoStudent() {
        return codigoStudent;
    }

    public int getAge() {
        return age;
    }

    public student(String name, String lastName, String codigoStudent, int age) {

        this.name = name;
        this.lastName = lastName;
        this.codigoStudent = codigoStudent;
        this.age = age;
    }
}
