/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String firstNumber = JOptionPane.showInputDialog("Enter first number");
        String secondNumber = JOptionPane.showInputDialog("Enter second number");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The sum is "+ sum, "Sum of Two Numbers", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
