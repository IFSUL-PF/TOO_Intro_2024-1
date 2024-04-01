/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteString;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Bee2137 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] livros = new String[n];
            for (int i = 0; i < n; i++) {
                livros[i] = sc.next();
            }
            Arrays.sort(livros);
            for (int i = 0; i < n; i++) {
                System.out.println(livros[i]);
            }
        }

    }
}
