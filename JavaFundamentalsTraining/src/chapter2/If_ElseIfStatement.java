package chapter2;
/*The program should assign grades to students
* based on their test mark
* A: 80 - 100, B: 60 - 79, C: 40 - 59, D: <40*/
public class If_ElseIfStatement {
    public static void main(String[] args) {
        int testMark = 107;
        String grade = "None";

        //Logical AND (&&)
        /*TRUE &&  TRUE = TRUE
        TRUE  &&   FALSE = FALSE
        FALSE &&   TRUE  = FALSE
        FALSE && FALSE = FALSE
         */

        /*Logical OR (||)
        * TRUE  ||  TRUE    = TRUE
        * TRUE  ||  FALSE   = TRUE
        * FALSE ||  TRUE    = TRUE
        * FALSE ||  FALSE   = FALSE*/

        if (testMark < 0 || testMark > 100){//107
            System.out.println("Test mark should be from 0 to 100");
        }else{
            if (testMark >= 80 && testMark <= 100){//78 FALSE
                grade = "A";
            } else if (testMark >= 60 && testMark <= 79) {//TRUE
                grade = "B";
            } else if (testMark >= 40 && testMark <= 59) {
                grade = "C";
            } else if(testMark >= 0 && testMark <= 39) {
                grade = "D";
            }

            System.out.println("Test Mark: " + testMark + " (" + grade + ")");

        }



    }
}
