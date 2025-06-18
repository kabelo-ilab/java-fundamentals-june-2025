package chapter1.exercises;

import java.util.Scanner;

public class Fundraiser {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 50.37;
        final double CHILD_MEAL_PRICE = 37.55;
        int adultMeals;
        int childMeals;
        double totalAdultMeals;
        double totalChildMeals;
        double totalAllMeals;
        Scanner input = new Scanner(System.in);

        //get input from the user
        System.out.print("How many adult meals? ");
        adultMeals = input.nextInt();
        System.out.print("How many kids meals? ");
        childMeals = input.nextInt();

        totalAdultMeals = adultMeals * ADULT_MEAL_PRICE;
        totalChildMeals = childMeals * CHILD_MEAL_PRICE;
        totalAllMeals = totalAdultMeals + totalChildMeals;

        System.out.println("Total for Adult Meals: " + totalAdultMeals);
        System.out.println("Total for Children Meals: " + totalChildMeals);
        System.out.println("Total for All Meals: " + totalAllMeals);

    }
}
