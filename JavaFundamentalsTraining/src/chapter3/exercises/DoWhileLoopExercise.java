package chapter3.exercises;

import java.util.Scanner;

/*The program should prompt the user for any number of integers,
 * calculate and display their sum and average. The user should
 * enter zero (0) to stop the program*/
public class DoWhileLoopExercise {
    public static void main(String[] args) {
        int number, sum = 0, count = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter any integer. Enter zero (0) to exit: ");
            number = input.nextInt();
            count++;
            sum = sum + number;

        }while(number != 0);

        average = sum / count;
        System.out.println("Sum: " + sum + "\nAverage: " + average);
    }
}
