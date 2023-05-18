package ValidatingParameters;

import java.util.Scanner;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        if (name == null || name.trim().isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be null, empty, or over 40 characters in length.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a name: ");
        String name = input.nextLine();

        System.out.println("Please Enter an age: ");
        int age = input.nextInt();

        try {
            Person person = new Person(name, age);
            System.out.println("Person successfully created with valid name " + person.name + " and age " + person.age + ".");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        input.close();
    }
}

