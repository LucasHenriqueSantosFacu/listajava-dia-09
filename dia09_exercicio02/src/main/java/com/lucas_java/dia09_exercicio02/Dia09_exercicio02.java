/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lucas_java.dia09_exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Dia09_exercicio02 {

    public static void main(String[] args) {
      double porcentagem = 0;
       double salario[] = new double[2];
       salario[0]=1000;
       salario[1]= 
        porcentagem = (1.5 / 100);
       salario[0] = salario[1] + (salario[0] * porcentagem);
        for (int i = 1; i <= 25; i++) {
        porcentagem = porcentagem * 2;
           salario[1] = salario[1] + (salario[1]*porcentagem);
        }
       System.out.println("Salário atual: R$" + salario[1]);
    }
}
