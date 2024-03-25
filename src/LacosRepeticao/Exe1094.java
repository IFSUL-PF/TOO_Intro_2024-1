/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LacosRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Exe1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntTestes = sc.nextInt();
        
        
        
        
        int totalCobaias = 0, contRatos = 0, contSapos = 0, contCoelho = 0;
        char tipoCobaia;
        for(int i=0; i<qntTestes;i++){
            int n = sc.nextInt();
            tipoCobaia = sc.next().charAt(0);
            switch (tipoCobaia) {
                case 'R':
                    contRatos+=n;
                    break;
                case 'S':
                    contSapos+=n;
                    break;
                case 'C':
                    contCoelho+=n;
                    break;
            }
            totalCobaias += n;
        }
        
        System.out.println("Total: "+totalCobaias+" cobaias\n" +
"Total de coelhos: "+contCoelho+"\n" +
"Total de ratos: "+contRatos+"\n" +
"Total de sapos: "+contSapos);
        float percCoelhos = (float) contCoelho / totalCobaias;
        DecimalFormat formatoNum = new DecimalFormat("0.00");
        System.out.println("Percentual de coelhos: "+formatoNum.format(percCoelhos * 100)+" %");
        System.out.println("Percentual de ratos: "+formatoNum.format((float) contRatos / totalCobaias *100)+" %");
        System.out.printf("Percentual de sapos: %.2f %%\n", ((float) contSapos / totalCobaias * 100));
    }
}
