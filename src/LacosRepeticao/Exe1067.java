/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Exe1067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor inteiro");
        try {
            int valor = sc.nextInt();

            for (int i = 1; i <= valor; i += 2) {
                System.out.println(i);
            }
        } catch (InputMismatchException e) {
            System.err.println("Valor inválido!! informe somente valores inteiros");
        }

    }
}
