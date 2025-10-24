package main.model.entities;

public class PeopleHeight {
    private String name;
    private Character gender;
    private Integer age;
    private Double height;

    public PeopleHeight(String name,char gender, int age, double height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    
}
