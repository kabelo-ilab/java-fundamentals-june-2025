package chapter2;
/*The program should allow student to submit assignment 1
* provided they have achieved > 50 for the test. If they
* achieve >= 65 for assignment 1, then they submit assignment 2.
* They pass the module if they get >= 60 for assignment 2,
* otherwise they fail the module
* Final Mark = (Test * 34%, Assignment1 * 33, Assignment2 * 33%)*/
public class NestedIfStatement {
    public static void main(String[] args) {
        int testMark = 70;
        int assignment1 = 77, assignment2 = 17;
        double finalMark = 0;

        if (testMark > 50){//1
            //true
            if (assignment1 >= 65){//2
                //true
                if (assignment2 >= 60){//3
                    //true
                    System.out.println("Good job... You passed all the assessments");//A
                    finalMark = (testMark * 0.34) + (assignment1 * 0.33) + (assignment2 * 0.33);
                    System.out.println("Your final mark is: " + finalMark);
                }else{
                    //false
                    if (assignment2 >= 55 && assignment2 <= 59){
                        System.out.println("Lucky you... You have been promoted");//B
                        finalMark = (testMark * 0.34) + (assignment1 * 0.33) + (assignment2 * 0.33);
                        System.out.println("Your final mark is: " + finalMark);
                    }else {
                        System.out.println("You failed assignment 2");//C
                    }
                }
            }else{
                System.out.println("You failed assignment 1");//D
            }
        }else{
            System.out.println("You failed the test");//E
        }
    }
}
