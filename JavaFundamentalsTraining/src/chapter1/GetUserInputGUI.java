package chapter1;

import javax.swing.*;
import java.util.Scanner;

public class GetUserInputGUI {
    public static void main(String[] args) {
        //1. Declare
        String name;
        int age;
        double height;
        float salary;
        char empType;
        
        //2. Assign
        name = JOptionPane.showInputDialog("Enter your name");//string
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
        salary = Float.parseFloat(JOptionPane.showInputDialog("Enter salary"));
        empType = JOptionPane.showInputDialog("Employment Type").charAt(0);

        //3. Use / Consume
        JOptionPane.showMessageDialog(null, "Your name is: " + name);

    }
}
