package chapter4;

import javax.swing.*;
import java.util.Scanner;

public class ValueTypeMethods {
    public static void main(String[] args) {
        //display the message returned by the method
        System.out.println(getMessage());
        //JOptionPane.showMessageDialog(null, getMessage());
        System.out.println("The sum is: " + calculateSum());
    }

    public static String getMessage(){
        return "Hi, Welcome to Java Training";
    }

    public static int calculateSum(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int sum;

        System.out.print("Enter the number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        return sum;
    }

}
