package chapter1;

import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        //1. Declare
        int intAge;
        double height;
        float salary;
        String name;
        char employmentType;
        //declare the scanner object
        Scanner input = new Scanner(System.in);

        //2. Assign
        System.out.print("Please enter your name:  ");//prompt
        name = input.next();
        System.out.print("Please enter your age:  ");
        intAge = input.nextInt();
        System.out.print("What is your height?  ");
        height = input.nextDouble();
        System.out.print("Please enter salary:  ");
        salary = input.nextFloat();
        System.out.print("Employment Type (C, F or P): ");
        employmentType = input.next().charAt(0);

        //3. Use / Consume
        System.out.println("=========OUTPUT=============");
        System.out.println("Name: " + name);
        System.out.println("Age: " + intAge);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Employment Type: " + employmentType);
    }
}
