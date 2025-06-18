package chapter2;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 8;

        System.out.println(  (x == y) && (z > x)     );//false
        System.out.println(  (x > y) || (x <= y)     );//true

        System.out.println(  (x < z) && (y >= (x * 2))    );

        System.out.println( (x < z) && ((y >= x) || (z > (y / 2)))   );
        //                  TRUE    &&   (FALSE   ||  TRUE)
        //                  TRUE    &&   TRUE = TRUE

    }
}
