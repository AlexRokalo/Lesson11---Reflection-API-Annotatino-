package itAcademy.classes;

import itAcademy.interfaces.Generate;

import java.util.Date;

public class Student {
    @Generate
    private String name;
    private String secondName;
    @Generate
    private Date born;
    private Boolean liave;

    public Student() {
    }

    public Student(String name, String secondName, Date born, boolean liave) {
        this.name = name;
        this.secondName = secondName;
        this.born = born;
        this.liave = liave;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public void setLiave(Boolean liave) {
        this.liave = liave;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", born=" + born +
                ", liave=" + liave +
                '}';
    }

}