package chapter2;

public class PrePostConditions {
    public static void main(String[] args) {
        int age = 25;

        //pre-condition - change the value then use it
        System.out.println("==============PRE DECREMENT=====================");
        System.out.println("Current age is: " + age);//25
        System.out.println("Decrease the value of age by 1, then use it: " + --age);//24
        System.out.println("The new value of age is: " + age);//24

        int x = 10;
        x++;//10

        System.out.println("\n==============POST DECREMENT=====================");
        System.out.println("Current X is: " + x);//11
        System.out.println("Decrease the value of X by 1: " + x--);//11
        System.out.println("The new value of X is: " + x);//10


    }
}
