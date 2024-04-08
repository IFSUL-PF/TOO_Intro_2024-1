/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author vanessalagomachado
 */
public class TesteMetodos {

    public static void imprimeMensagem(String mensagem){
        System.out.println(mensagem);
    }
    
    public static void main(String[] args) {
        imprimeMensagem("Olá Mundo");
        imprimeMensagem("Soma = "+soma(10, 20));
    }
    
    static double soma(double valor1, double valor2){
        return valor1+valor2;
    }
}
