package chapter5;

import java.util.Scanner;

public class ArraySearchStrings {
    public static void main(String[] args) {
        String[] names = new String[]{ "Smith", "Kabelo", "John", "Tom",
                                        "Jessica", "Peter", "Carol", "Loraine",
                                        "Jake", "Kate"};

        searchForName(names);

        System.out.println("==============Starts with 'J'==========================");
        for (int q = 0; q < names.length; q++) {
            if (names[q].startsWith("J")){
                System.out.print(names[q] + "  |  ");
            }
        }
        System.out.println("\n\n==============Ends with 'e'==========================");
        for (int i = 0; i < names.length; i++) {
            if (names[i].endsWith("e")){
                System.out.print(names[i] + "  |  ");
            }
        }

        System.out.println("\n\n==============Contains 'a'==========================");
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("a")){
                System.out.print(names[i] + "  |  ");
            }
        }
        System.out.println("\n\n==============Longest Name==========================");
        String longestName = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longestName.length()){
                longestName = names[i];
            }
        }

        System.out.println("Longest name: " + longestName);
    }

    public static void searchForName(String[] arNames){
        Scanner sc = new Scanner(System.in);
        String name;
        int position = -1;

        System.out.print("Enter the name to search for...");
        name = sc.next();

        for (int i = 0; i <= arNames.length - 1; i++) {
            if (name.equalsIgnoreCase(arNames[i])){
                position = i;
            }
        }

        if (position == -1){
            System.out.println(name + " doesn't exist!!!");
        }else{
            System.out.println(name + " is found at position: " + position);
        }

    }
}
