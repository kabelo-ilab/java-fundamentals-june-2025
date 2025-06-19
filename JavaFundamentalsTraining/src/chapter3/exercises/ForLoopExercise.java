package chapter3.exercises;

import java.util.Scanner;
/*The program should prompt the user for 5 integers,
* calculate and display their sum*/
public class ForLoopExercise {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        for (int x = 1; x <= 5; x++){
            System.out.print("Enter number " + x + ":  ");
            num = input.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum: " + sum);
    }
}
