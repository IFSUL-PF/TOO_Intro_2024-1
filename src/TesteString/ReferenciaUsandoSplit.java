/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteString;

import javax.swing.JOptionPane;


/**
 *
 * @author vanessalagomachado
 */
public class ReferenciaUsandoSplit {
    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Informe seu nome completo");
        nomeCompleto = nomeCompleto.trim();
        
        String palavras[] = nomeCompleto.split(" ");
        int tam = palavras.length;
        String referencia = palavras[tam-1]+", ";
        for(int i=0; i<tam-1;i++){
            try{
                referencia += palavras[i].charAt(0)+".";
            } catch (StringIndexOutOfBoundsException e){
                System.out.println("indice do vetor vazio");
            }
        }
        JOptionPane.showMessageDialog(null, referencia.toUpperCase());
    }
}