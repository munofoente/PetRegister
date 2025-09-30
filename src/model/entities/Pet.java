package model.entities;

import model.enums.Gender;
import model.enums.Kind;


public class Pet {

    private Kind kind;
    private Gender gender;
    private String name, lastName;
    private Float age;
    private String address, district;
    private Double weight;
    private String breed;


    public Pet(Kind kind, Gender gender, String name, String lastName, Float age, String address, String district, Double weight, String breed) {
        this.kind = kind;
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.district = district;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
}
