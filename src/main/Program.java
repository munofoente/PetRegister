package main;


import model.entities.Pet;
import model.enums.Gender;
import model.enums.Kind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Program {

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

                        sc.nextLine();
                        String name = sc.nextLine();
                        String[] arrName = name.split(" ", 2);

                        String kindStr = sc.next().toUpperCase();
                        Kind kind = Kind.valueOf(kindStr);
                        String genderStr = sc.next().toUpperCase();
                        Gender gender = Gender.valueOf(genderStr);
                        sc.nextLine();
                        String address = sc.nextLine();
                        String[] arrAddress = address.split(",", 3);

                        float age = sc.nextFloat();

                        double weight = sc.nextDouble();

                        String breed = sc.next();

                        Pet pet = new Pet(kind, gender, arrName, age, arrAddress, weight, breed);
                        List<Pet> petList = new ArrayList<>();
                        petList.add(pet);

                        System.out.println(petList);

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
