package chapter3;
/*break: exit the loop
* continue: skip the current iteration*/
public class LoopTermination {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Java");//1 2 3 4
            if (i == 4) break;
        }
        System.out.println("================================");

        //use the modulus (%) operator to search for even numbers
        for (int i = 1; i < 11 ; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println("Thursday");
        }

        System.out.println("===============Multiples of 3=====================");
        //use the modulus (%) operator to search for multiples of 3
        for (int i = 1; i <= 15 ; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
