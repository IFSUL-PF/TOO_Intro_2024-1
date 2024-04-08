/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author vanessalagomachado
 */
public class Calculadora {
    public static void main(String[] args) {
        
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String opSelecionada = (String) JOptionPane.showInputDialog(null, 
                "Selecione a operação desejada", 
                "Calculadora", 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                operacoes, 
                operacoes[0]);
        
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1o valor"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2o valor"));
        double resultado = 0;
        switch(opSelecionada){
            case "Soma":
                resultado = soma(valor1, valor2);
                break;
            case "Subtração":
                resultado = subtracao(valor1, valor2);
                break;
            case "Multiplicação":
                resultado = multiplicacao(valor1, valor2);
                break;
            case "Divisão":
                resultado = divisao(valor1, valor2);
                break;
            default:
                imprimeMensagem("Valor inválido");
                break;
        }
        imprimeResultado(resultado);
    }
    
    public static double soma(double v1, double v2){
        return v1+v2;
    }
    public static double subtracao(double v1, double v2){
        return v1-v2;
    }
    public static double divisao(double v1, double v2){
        return v1/v2;
    }
    public static double multiplicacao(double v1, double v2){
        return v1*v2;
    }
    public static void imprimeResultado(double res){
        imprimeMensagem("Resultado: "+res);
    }
    public static void imprimeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
