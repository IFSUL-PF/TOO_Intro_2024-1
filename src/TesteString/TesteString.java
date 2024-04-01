
package TesteString;

import javax.swing.JOptionPane;

/**
 *
 * @author vanessalagomachado
 */
public class TesteString {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        
        // remove os espaços em branco de início e fim do texto
        nome = nome.trim();
        
        int indicePrimeiroEspaco = nome.indexOf(" ");
        String primeiroNome = nome.substring(0, indicePrimeiroEspaco);
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) "+primeiroNome);
        
        String[] nomes = nome.split(" ");
        JOptionPane.showMessageDialog(null, "Bem-vindo(a)  "+nomes[0]);
        
        System.out.println("Primeiro Caractere: "+nome.charAt(0));
        
        System.out.println(nome.replaceFirst("a", "@"));
    }
}
