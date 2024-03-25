/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LacosRepeticao;

import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Exe1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Informe um valor");
        int v1 = sc.nextInt();
//        System.out.println("Informe o segundo valor");
        int v2 = sc.nextInt();
        
        int soma = 0;
        int menor = Math.min(v1, v2);
        int maior = Math.max(v1, v2);
        
        for (int i = menor+1; i<maior; i++){
            if(i%2 != 0){
                soma+=i;
            }
        }
        
//        System.out.println("Soma: "+soma);
        System.out.println(soma);
    }
}
