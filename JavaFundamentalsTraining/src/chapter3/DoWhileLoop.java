package chapter3;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Display Java 5 times
        int count = 1;
        do{
            System.out.println(count + ":  Java");//1 2 3 4 5
            count++;
        }while(count <= 5);

        System.out.println("===================================");

        int x = 0;
        do {
            System.out.println("Hello World");//0 5
            x += 5;
        }while (x == 5);



    }
}
