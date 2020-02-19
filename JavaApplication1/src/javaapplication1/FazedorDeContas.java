/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Alexandre
 */
import javax.swing.JOptionPane;

public class FazedorDeContas {
    
    public static void main(String[] args){
        
        String first = JOptionPane.showInputDialog("Digite o primeiro número:");
        String second = JOptionPane.showInputDialog("Digite o segundo número:");
        String operation = JOptionPane.showInputDialog("Digite o símbolo da operação desejada:\nSoma (+)\nSubtração (-)\nMultiplicação (*)\nDivisão (/)");
        
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        
        int result;
        
        switch(operation){
            case "+":
                result = number1 + number2;
                JOptionPane.showMessageDialog(null, "A soma é " + result, "Fazedor de Contas", JOptionPane.PLAIN_MESSAGE);
                break;
            case "-":
                result = number1 - number2;
                JOptionPane.showMessageDialog(null, "A subtração é " + result, "Fazedor de Contas", JOptionPane.PLAIN_MESSAGE);
                break;
            case "*":
                result = number1 * number2;
                JOptionPane.showMessageDialog(null, "A multiplicação é " + result, "Fazedor de Contas", JOptionPane.PLAIN_MESSAGE);
                break;
            case "/":
                result = number1 / number2;
                JOptionPane.showMessageDialog(null, "A divisão é " + result, "Fazedor de Contas", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você escolheu uma operação inválida ou \nnão digitou um dos símbolos permitidos", "Fazedor de Contas", JOptionPane.PLAIN_MESSAGE);
                break;
        }
                
    }
    
}