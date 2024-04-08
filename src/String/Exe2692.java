/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Exe2692 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Clearing the scanner buffer
        sc.nextLine();

        char entrada[] = new char[n];
        char saida[] = new char[n];

        for (int i = 0; i < n; i++) {
            entrada[i] = sc.next().charAt(0);
            saida[i] = sc.next().charAt(0);
        }
        // Clearing the scanner buffer
        sc.nextLine();
        int contLines = 0;
        char[] fraseArrayChar = null;
        for (int i = 0; i < m; i++) {
            String fraseEntrada = sc.nextLine();
            if (!fraseEntrada.isEmpty()) {
                contLines++;
                String translatedLine = ""; // String to store the translated line
                fraseArrayChar = fraseEntrada.toCharArray();
                for (int j = 0; j < fraseArrayChar.length; j++) {
                    for (int k = 0; k < n; k++) {
                        if (fraseArrayChar[j] == entrada[k]) {
                            fraseArrayChar[j] = saida[k];
                            break; // Break once replacement is done
                        } else if (fraseArrayChar[j] == saida[k]) {
                            fraseArrayChar[j] = entrada[k];
                            break; // Break once replacement is done
                        }
                    }
                }
                System.out.println(new String(fraseArrayChar));
            } 
            
        }
        while(contLines < m){
            contLines++;
            System.out.println(new String(fraseArrayChar));
        }
    }
}
