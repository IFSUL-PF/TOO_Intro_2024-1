/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vanessalagomachado
 */
public class TesteData {

    public static void main(String[] args) {
        Date novaData = new Date();
        SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data sem máscara: " + novaData);
        System.out.println("Data com máscara: " + mascaraData.format(novaData));
        try {
            String dataNascimentoJuca = "20/11/1998";

            Date dataNascJuca = mascaraData.parse(dataNascimentoJuca);

            String dataNascimentoJoana = "20/11/1998";

            Date dataNascJoana = mascaraData.parse(dataNascimentoJoana);
            
            if(dataNascJoana.before(dataNascJuca)){ // before = testa se a primeira data é antes da 2a
                System.out.println("Joana é mais velha");
            } else if(dataNascJoana.after(dataNascJuca)){ // after = testa se a primeira data é depois da 2a
                System.out.println("Juca é o mais velho");
            } else if(dataNascJoana.equals(dataNascJuca)){ // testa se ambas as datas são iguais
                System.out.println("Juca e Joana nasceram no mesmo dia");
            }
            
            
        } catch (ParseException e) {
            System.err.println("Data inválida " + e.getMessage() + " informe uma data no formato (dd/MM/yyyy)");
        }

    }
}
