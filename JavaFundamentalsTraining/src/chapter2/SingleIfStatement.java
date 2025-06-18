package chapter2;
/*This class will demonstrate the use of
* a single IF statement. Only a true clause will
* be executed*/
public class SingleIfStatement {
    public static void main(String[] args) {
        int age = 15;
        //if(condition){statements to be executed}
        if(age >= 18) {
            //true
            System.out.println("You can vote.");
            System.out.println("Thanks for using our system");
        }

        System.out.println("Done...");

    }
}
