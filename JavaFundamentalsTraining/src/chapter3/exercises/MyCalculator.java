package chapter3.exercises;

import chapter4.ParameterizedMethods;

import java.util.Scanner;

/*The program should prompt the user for 2 integers and
* an operator (+, -, *, /), compute and display the results*/
public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        String operator;
        double results = 0;
        String userResponse;

        do{//user response

            System.out.print("Enter the first number: ");
            number1 = input.nextInt();
            System.out.print("Enter the second number: ");
            number2 = input.nextInt();
            //display a menu
            do{
                System.out.print("Choose an operator: \n" +
                        "(+) to add\n" +
                        "(-) to subtract\n" +
                        "(*) to multiply\n" +
                        "(/) to divide\n" +
                        "Your choice: ");
                operator = input.next();

            }while(!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")));


            switch (operator){
                case "+": results = number1 + number2;
                    break;
                case "-": results = number1 - number2;
                    break;
                case "*": results = number1 * number2;
                    break;
                case "/":
                    while (number2 == 0){
                        System.out.print("The second number should not be zero. Please enter a different number: ");
                        number2 = input.nextInt();
                    }
                    results = number1 / number2;
                    break;
            }

//        if (operator.equals("+")){
//            results = number1 + number2;
//        } else if (operator.equals("-")) {
//            results = number1 - number2;
//        } else if (operator.equals("*")) {
//            results = number1 * number2;
//        } else if (operator.equals("/")) {
//            results = number1 / number2;
//        }
            System.out.println("Results: " + results);

            System.out.print("Do you want to continue? (Y / N): ");
            userResponse = input.next();
        }while (userResponse.equalsIgnoreCase("Y"));

    }
}
