package com.mycompany.exercise10_joptionpane;
import javax.swing.*;

public class Exercise10_JOptionPane {

    public static void main(String[] args) {
        //Declare the variables
        String input1, input2, menu, optionStr ;
        int num1, num2, escape, result, option;
        //Prompt the user to enter the 2 numbers and store them into variables
        input1 = JOptionPane.showInputDialog("Please enter a number: ");
        num1 = Integer.parseInt(input1);
        input2 = JOptionPane.showInputDialog("Please enter another number: ");
        num2 =Integer.parseInt(input2);
        
        escape = -1;
        //Ignore this comment. this is to push to github
        Calculator calc1 = new Calculator();
        
        while(escape !=0){
            menu = """
                   Select an operation:     
                   1. Addition 2.Subtraction 3.Multiplication 4.Division 0.Exit""";
             
            optionStr = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionStr);  
            
            switch(option){
                case 1 -> {
                    //addition
                    result = calc1.add(num1, num2);
                    JOptionPane.showMessageDialog(null, "The sum of the two numbers is: " + result);
                }
                case 2 -> {
                    //subtraction
                    result = calc1.subtract(num1, num2);
                    JOptionPane.showMessageDialog(null, "The difference of the two numbers is : " + result);
                }
                case 3 -> {
                    //addition
                    result = calc1.multiply(num1, num2);
                    JOptionPane.showMessageDialog(null, "The product of the two numbers is: " + result);
                }
                case 4 -> {
                    //division
                    if(num2 != 0) {
                        result = calc1.divide(num1, num2);
                        JOptionPane.showMessageDialog(null, "The division of the two numbers is: " + result);                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: UNDEFINED! ");
                    }
                }
                default -> //An invalid option
                    JOptionPane.showMessageDialog(null, "Calculation not recognized! ");
             
            }
            break;
        }
    }
}
