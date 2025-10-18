package model.entities;

import model.enums.Gender;
import model.enums.Kind;
import model.exceptions.DomainException;


import java.util.Arrays;


public class Pet {

    private Kind kind;
    private Gender gender;
    private String[] name;
    private Double age;
    private String[] address;
    private Double weight;
    private String breed;

    public Pet(){

    }

    public Pet(Kind kind, Gender gender, String[] name, Double age, String[] address, Double weight, String breed) {
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

    public String[] getName(String name) {
        String[] arrName;
        arrName = name.split(" ", 2);
        if (!name.isEmpty()) {
            if (arrName.length < 2) {
                throw new DomainException("Last name required for registration");
            }
        }
        return arrName;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public Double getAge(String strAge) {
            double age;
            if (strAge.matches("^[0-9]* months$") || strAge.matches("^[0-9]* month$")) {
                String valAge = strAge.replaceAll("[a-z A-Z]+", "");
                double ageDouble = Double.parseDouble(valAge);
                age = ageDouble / 12;
            } else {
                String valAge = strAge.replace(",", ".");
                age = Double.parseDouble(valAge);
            }
            if (age > 20) {
                throw new DomainException("Age must be below 20");
            }
            return age;
        }

    public void setAge(double age) {
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
        return " - Pet - \n" +
                "Kind: " + kind + "\n" +
                "Gender: " + gender + "\n" +
                "Name: " + Arrays.toString(name) + "\n" +
                "Age: " + String.format("%.1f", age) + " years \n" +
                "Address: " + Arrays.toString(address) + "\n" +
                "Weight: " + weight + "kg \n" +
                "Breed: " + breed + "\n";
    }
}
