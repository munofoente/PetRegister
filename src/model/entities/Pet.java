package model.entities;

import model.enums.Gender;
import model.enums.Kind;

import java.util.Arrays;


public class Pet {

    private Kind kind;
    private Gender gender;
    private String[] name;
    private Float age;
    private String[] address;
    private Double weight;
    private String breed;


    public Pet(Kind kind, Gender gender, String[] name, Float age, String[] address, Double weight, String breed) {
        this.kind = kind;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.address = address;
        this.weight = weight;
        this.breed = breed;
    }


    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "kind=" + kind +
                ", gender=" + gender +
                ", name='" + Arrays.toString(name) + '\'' +
                ", age=" + age +
                ", address='" + Arrays.toString(address) + '\'' +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }
}
