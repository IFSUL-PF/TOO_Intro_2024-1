/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Exe1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String linha = sc.nextLine();
            linha = linha.toLowerCase();
            char[] vetorChar = linha.toCharArray();
            boolean troca = true;
            
            for (int i = 0; i < vetorChar.length; i++) {
                if(vetorChar[i] != ' '){
                    
                    if(troca){
                        vetorChar[i] = (vetorChar[i]+"").toUpperCase().charAt(0);
                        troca = false;
                    } else {
                        troca = true;
                    }
                }
            }
            System.out.println(new String(vetorChar));
            
        }
    }
}
