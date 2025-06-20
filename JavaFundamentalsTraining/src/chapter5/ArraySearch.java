package chapter5;

import java.util.Random;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random rnd = new Random();

        //populate the array with random integers from 10 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(10,100);
        }

        //display all numbers
        System.out.println("============All Numbers======================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "   ");
        }
       //display all the even numbers
        //16   18   29  64  ....
        //0    1    2    3
        System.out.println("\n============Even Numbers======================");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + "   ");
            }
        }
        //display multiples of 3
        System.out.println("\n============Odd Numbers======================");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                System.out.print(numbers[i] + "   ");
            }
        }

        System.out.println("\n============Multiples of 3======================");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0){
                System.out.print(numbers[i] + "   ");
            }
        }
        System.out.println("\n============Greater than 50======================");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50){
                System.out.print(numbers[i] + "   ");
            }
        }
        System.out.println("\n============Highest Number======================");
        //10    54   16  58
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest){
                highest = numbers[i];//58
            }
        }
        System.out.println("Highest: " + highest);

    }
}
