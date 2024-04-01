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
public class ReferenciaBibliografica {
    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Informe seu nome completo");
        nomeCompleto = nomeCompleto.trim();
        
        int indice = nomeCompleto.lastIndexOf(" ");
        String sobrenome = nomeCompleto.substring(indice, 
                nomeCompleto.length());
        //String referencia = String.valueOf(nomeCompleto.charAt(0));
        String referencia = ""+nomeCompleto.charAt(0)+".";
        for(int i=0; i<indice;i++){
            if(nomeCompleto.charAt(i) ==  ' ' && 
                    nomeCompleto.charAt(i+1) != ' ')
                referencia += ""+nomeCompleto.charAt(i+1)+".";
        }
        
        JOptionPane.showMessageDialog(null, sobrenome+", "+referencia);
    }
}
