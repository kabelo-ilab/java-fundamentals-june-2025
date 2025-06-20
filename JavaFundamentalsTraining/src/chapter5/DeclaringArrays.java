package chapter5;
/*Arrays a variables that can store multiple values of
* the same data type*/
public class DeclaringArrays {
    public static void main(String[] args) {
        //1. Declare
        //datatype[] arrayname = initial values
        String[] names = new String[]{ "Smith", "Kabelo", "John", "Tom"};
        double[] prices = {7.6, 4.2, 8.3, 10.5, 11.6};
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        int[] oddNumbers = {5, 7, 13, 71, 11, 19, 21, 3};

        int[] numbers = new int[13];//empty array to store 3 integers
        // 5   4   14
        String[] hobbies = new String[4];

        //2. Assign

        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 14;

        hobbies[0] = "Soccer";
        hobbies[1] = "Tennis";
        hobbies[2] = "Chess";
        hobbies[3] = "Hiking";

        //3. Consume / Use
        System.out.println("==================NUMBERS===================");
        for (int x = 0; x <= numbers.length - 1;x++){
            System.out.print(numbers[x] + "  ");//5
        }
        System.out.println("\nLength = " + numbers.length);
        System.out.println("\n\n==================NAMES===================");

        for (int i = 0; i <= names.length - 1 ; i++) {
            System.out.print(names[i] + "     ");
        }
        System.out.println("\nLength = " + names.length);

        System.out.println("\n\n==================HOBBIES===================");

        for (int i = 0; i <= hobbies.length - 1 ; i++) {
            System.out.print(hobbies[i] + "     ");
        }
        System.out.println("\nLength = " + hobbies.length);

    }
}
