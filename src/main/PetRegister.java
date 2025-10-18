package main;


import model.entities.Pet;
import model.enums.Gender;
import model.enums.Kind;
import model.exceptions.DomainException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class PetRegister {

    public static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("c:\\Users\\munof\\IdeaProjects\\PetRegister\\src\\resources\\form.txt"))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error in reading file: " + e.getMessage());
        }
    }

    public static void showMenu() {
        System.out.println(
                "1 - Register a new pet \n" +
                "2 - Edit a pet's information \n" +
                "3 - Delete a registered pet \n" +
                "4 - List all registered pets \n" +
                "5 - List pets by criteria(name, age, breed) \n" +
                "6 - Leave "
        );
    }

    public static void inputCheck(String s){
        if(!s.isEmpty()){
            boolean onlyLetters = s.matches("[a-z A-Z]+");
            if (!onlyLetters) {
                throw new DomainException("Invalid input");
            }
        }
    }

    public static final String NOT_INFORMED = "Not informed";
    public static void register(){

        Scanner sc = new Scanner(System.in);


        Pet pet = new Pet();
        System.out.print("1 - ");
        String name = sc.nextLine();
        String[] arrName;
        arrName = pet.getName(name);
        inputCheck(name);


        System.out.print("2 - ");
        String kindStr = sc.next().toUpperCase();
        Kind kind = Kind.valueOf(kindStr);

        System.out.print("3 - ");
        String genderStr = sc.next().toUpperCase();
        Gender gender = Gender.valueOf(genderStr);

        sc.nextLine();
        System.out.print("4 - ");
        System.out.print("i - House number: ");
        String number = sc.nextLine();
        System.out.print("ii - City: ");
        String city = sc.nextLine();
        System.out.print("iii - Street: ");
        String street = sc.nextLine();
        String[] arrAddress = {number, city, street};

        System.out.print("5 - ");
        String strAge = sc.nextLine();
        double age = pet.getAge(strAge);

        System.out.print("6 - ");
        String strWeight = sc.next();
        String valWeight = strWeight.replace("," , ".");
        double weight = Double.parseDouble(valWeight);
        if (weight > 60 || weight < 0.5){
            throw new DomainException("Weight must be between 0.5kg and 60kg");
        }

        System.out.print("7 - ");
        String breed = sc.next();
        inputCheck(breed);

        pet = new Pet(kind, gender, arrName, age, arrAddress, weight, breed);
        List<Pet> petList = new ArrayList<>();
        petList.add(pet);

        System.out.println(petList);

        sc.close();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option;

        try {
            do {
                showMenu();
                System.out.println();
                System.out.print("Select the number of your option: ");
                option = sc.nextInt();
                switch (option) {
                    case 1:

                        readFile();
                        System.out.println();

                        try {
                            register();
                        }
                        catch (InputMismatchException e){
                            System.out.println("Invalid input: " + e.getMessage());
                        }
                        catch (NumberFormatException e){
                            System.out.println("Invalid number format: " + e.getMessage());
                        }
                        catch (DomainException e){
                            System.out.println("Input error: " + e.getMessage());
                        }

                    case 2:

                    case 3:

                    case 4:

                    case 5:

                    case 6:

                }
            } while (option <= 0);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }


        sc.close();

    }
}
