package chapter2;

import java.util.Scanner;

/*This class will demonstrate the use of IF-Else statement
* It contains both the true and the false clause*/
public class IfElseStatement {
    public static void main(String[] args) {
        int age;
        int testMark = 50;
        Scanner in = new Scanner(System.in);
        //boolean check = (age >= 18);
        System.out.print("Please enter you age: ");
        age = in.nextInt();

        if (age >= 18){
            //true
            System.out.println("You can vote");
        }else{
            //false
            System.out.println("Sorry... You cannot vote");
        }

        if (testMark >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        if (testMark >= 40){
            System.out.println("You qualify for second opportunity");
        }
    }
}
