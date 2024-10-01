/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lazarus
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
        int a = 10;
        int b = 5;
        int c = 2;

        int addition = a + b + c;
        int subtraction = a - b - c;
        int multiplication = a * b * c;

        
        double division;
        if (b != 0 && c != 0) {
            division = (double) a / b / c;
        } else {
            System.out.println("Division by zero error!");
            division = 0;
        }

       
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
