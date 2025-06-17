package chapter1;

public class UserDetails {
    public static void main(String[] args) {
        //1. Declare and initialize
        int age = 25;
        float salary = 25500.55F;
        double height = 1.71;
        char employmentType = 'C';
        boolean isMarried = true;
        String firstName = "Tom";
        String lastName = "Smith";

        age = 35;//re-assign

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Married? " + isMarried);
        System.out.println("Salary: " + salary);
        System.out.println("Employment Type: " + employmentType);

    }
}
