package chapter3;
/*We use For Loop structure when we know
* the number of times that the loop should execute*/
public class ForLoop {
    public static void main(String[] args) {
        int y;
        //display Java 5 times
        for(int x = 1;x <= 5;x++){
            System.out.println("Java");
        }

        System.out.println("==============================");
        //display numbers from 1 to 15
        for (int x = 1; x <= 15; x++){
            System.out.print(x + "  ");//123......1415
        }

        System.out.println("\n==============================");
        //Display Thursday 4 times
        for(int count = 7; count <= 13; count+=2){//791113
            System.out.println("Thursday");
        }//11

        System.out.println("\n==============================");
        //display numbers from 10 to 1
        for(int x = 10; x >= 1; x--){
            System.out.print(x + "  ");
        }
        System.out.println("\n==============================");
        //display Java Training 5 times

        for (y = 1; y <= 5; y+=1){//
            System.out.println("Java Training");
        }






    }
}
