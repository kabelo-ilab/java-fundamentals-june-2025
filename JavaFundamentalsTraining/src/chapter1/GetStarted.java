package chapter1;
//single-line comment

/*This is the class to get us
* started with variables */
public class GetStarted {
    public static void main(String[] args) {
        //1. Declaration - define variables that are needed
        int intAge;
        double height;
        float salary;
        boolean isMarried;
        //Employment type (C - contractor, F - Full time, P - Part time)
        char employmentType;
        String name;

        //2. Assign - assign values to your variables
        intAge = 31;
        height = 1.71;
        salary = 25000.505555555F;
        isMarried = true;
        employmentType = 'F';
        name = "Tom Smith";
        //3 . Use / Consume - use the values stored inside variables
        System.out.println(intAge);
        System.out.println(height);
        System.out.println(salary);
        System.out.println(isMarried);
        System.out.println(employmentType);
        System.out.println(name);

    }
}
