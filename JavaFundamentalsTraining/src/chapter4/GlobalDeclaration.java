package chapter4;

import java.util.Scanner;

/*Global declaration are done at the class level*/
public class GlobalDeclaration {
    //global declaration
    static int num1;
    static int num2;
    public static void main(String[] args) {
        num1 = 8;
        num2 = 10;

        int sum = calculateSum();
        int product = calculateProduct();
        int diff = calculateDiff();

        System.out.println("Sum:  " + sum + "\n" +
                "Product:  " + product + "\n" +
                "Difference:  " + diff);
    }

    public static int calculateSum(){
        return num1 + num2;
    }
    public static int calculateProduct(){
        return num1 * num2;
    }
    public static int calculateDiff(){
        return num1 - num2;
    }
}
