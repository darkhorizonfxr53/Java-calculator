package com.mycompany.exercise10_joptionpane;

public class Calculator {   
    
    public int add(int num1, int num2) {
       int additionResult = num1 + num2;
       ;        
       return additionResult;        
    }    
    public int subtract(int num1, int num2) {
       int subtractionResult = num1 - num2;
       
       return subtractionResult;         
    }
    public int multiply(int num1, int num2) {
       int multiplicationResult = num1 * num2;
        
       return multiplicationResult;         
    }
    public int divide(int num1, int num2) {
       int divisionResult = num1 - num2;
              
       return divisionResult;         
    }    
}
/*
Create a class called Calculator that has 4 methods: Addition(), Subtraction(), Multiplication(), Division()
The methods should accept 2 integers, & all should return a value. using JOptionPane, accept input of 2 int's from user,
display a menu for a user to choose the calculation
Use a while loop so that a user can choose other options they'd want 2 perform
Do not use if statements. Use switch statements
*/