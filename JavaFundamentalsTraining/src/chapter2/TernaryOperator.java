package chapter2;

public class TernaryOperator {
    public static void main(String[] args) {
        int testMark = 25;
        String results;

//        if (testMark >= 50){
//            //System.out.println("Pass");
//            results = "Pass";
//        }else{
//           // System.out.println("Fail");
//            results = "Fail";
//        }

        //variable = condition? valueWhentrue : valueWhenFalse
       results = testMark >= 50 ? "Pass" : "Fail";

        //condition? valueWhentrue : valueWhenFalse

        System.out.println(results);
    }
}
