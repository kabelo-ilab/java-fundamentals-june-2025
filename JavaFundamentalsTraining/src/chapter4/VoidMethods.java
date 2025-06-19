package chapter4;

import javax.swing.*;
import java.util.Scanner;

/*Void methods are methods that perform processing without
* returning any value back to the caller.*/
public class VoidMethods {
    public static void main(String[] args) {

        displayMessage();
        calculateSum();
    }

    //access level return type name()
    public static void displayMessage(){
        System.out.println("Hi, Welcome to Java Training");
    }
    /*Create a method that calculate and display
    * the sum of two numbers*/
    private static void calculateSum(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int sum;

        System.out.print("Enter the number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        //JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + sum);
    }


}


