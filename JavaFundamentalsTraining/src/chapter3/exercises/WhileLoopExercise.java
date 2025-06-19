package chapter3.exercises;

import java.util.Scanner;
/*The program should prompt the user for any number of integers,
* calculate and display their sum and average. The user should
* enter zero (0) to stop the program*/
public class WhileLoopExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        double average = 0;
        int count = 0;//count the number of integers

        System.out.print("Enter any integer. Enter zero (0) to exit: ");
        number = input.nextInt();//loop-control variable
        //1
        while (number != 0){//
            if (number > 0){
                sum = sum + number;//8
                count++;//3
            }
            //change the value of the loop-control variable
            System.out.print("Enter any integer. Enter zero (0) to exit: ");
            number = input.nextInt();//0
        }//1 2 5

        average = sum / count;

        System.out.println("Sum: " + sum + "\nAverage: " + average);

    }
}
