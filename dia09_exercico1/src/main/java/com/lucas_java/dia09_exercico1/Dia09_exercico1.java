

package com.lucas_java.dia09_exercico1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Dia09_exercico1 {

    public static void main(String[] args) {
    int n = 5; // tamanho do vetor
    int v[] = new int[n]; // declaração do vetor "v"
    int i; // índice ou posição
    Scanner ler= new Scanner(System.in);

// Entrada de Dados
    for (i=0; i<n; i++) {
      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
      v[i] = ler.nextInt();
    }

// Processamento: definir o maior e o menor valor
    int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
    int maior = v[0];
    for (i=0; i<n; i++) {

      if (v[i] < menor)
         menor = v[i];

      if (v[i] > maior)
         maior = v[i];
    }

// Saída (resultados)
    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (v[i] == menor)
        System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
      else if (v[i] == maior)
              System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
           else System.out.printf("v[%d] = %2d\n", i, v[i]);
    }

    }
}
