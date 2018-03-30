package itAcademy.classes;

import itAcademy.interfaces.Generate;

import java.util.Date;

public class Patient {
    private String name;
    @Generate
    private String lastName;
    private Date date;
    @Generate
    private Boolean healt;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHealt(Boolean healt) {
        this.healt = healt;
    }

    public String getName() {

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDate() {
        return date;
    }

    public boolean isHealt() {
        return healt;
    }

    public Patient() {

    }

    public Patient(String name, String lastName, Date date, boolean healt) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.healt = healt;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                ", healt=" + healt +
                '}';
    }
}