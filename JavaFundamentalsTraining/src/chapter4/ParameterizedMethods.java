package chapter4;

import java.util.Scanner;

/*Parameterized Methods are methods that require data items
* for them to function. Data items (arguments) should be passed by the
* caller of the method*/
public class ParameterizedMethods {
    public static void main(String[] args) {
        displayText("Hello World");
        Scanner input = new Scanner(System.in);
        int intNum1, intNum2;
        String strOperator;

        System.out.print("Enter the number 1: ");
        intNum1 = input.nextInt();//5
        System.out.print("Enter the number 2: ");
        intNum2 = input.nextInt();//3
        System.out.print("Operator (+, -, *, /): ");
        strOperator = input.next();

//        double x = calculate(strOperator,intNum1,intNum2);

        //System.out.println("Results: " + calculateSum(intNum1, intNum2));
        //                                          *           5       8
        System.out.println("Results: " + calculate(strOperator,intNum1,intNum2));

    }
    public static void displayText(String text){
        System.out.println(text);
    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;//5 + 3 = 8
        return sum;//8
    }
    //                                      *           5               8
    public static double calculate(String operator, int number1, int number2){
        double results = 0;

        switch (operator){//*
            case "+": results = number1 + number2;//
                break;
            case "-": results = number1 - number2;
                break;
            case "*": results = number1 * number2;//40
                break;
            case "/":
                results = number1 / number2;
                break;
        }

        return results;//40
    }

}
