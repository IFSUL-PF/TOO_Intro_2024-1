package Vetores;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exe1174 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int aux = 0;
        boolean achou = false;
        int X[] = new int[N];
        int menorValor = Integer.MAX_VALUE;
        int pos = -1;
        for (int i = 0; i < N; i++) {
            aux = sc.nextInt();
            achou = false;
            for (int j = 0; j < i; j++) {
                if (X[j] == aux) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                X[i] = aux;
            } 

        }
        for (int z = 0; z < N; z++) {
            if (X[z] < menorValor) {
                menorValor = X[z];
                pos = z;
            }
        }
        System.out.println("Menor valor: " + menorValor + "\nPosicao: " + pos);
    }

}
