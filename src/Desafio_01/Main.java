/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio_01;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static String rev() {
        int aux;
        String numeros = "";
        int soma = 0;
        for (int numero = 11; soma < 1000000; numero++) {

            String reverso = "";
            for (int i = (String.valueOf(numero).length() - 1); i >= 0; i--) {
                reverso += String.valueOf(numero).charAt(i);
            }

            aux = Integer.parseInt((String) reverso.subSequence(0, 1));

            if (aux != 0) {
                soma = numero + Integer.parseInt(reverso);

                if (soma % 2 != 0) {
                    numeros += String.valueOf(numero) + "\n";

                }
            }
        }
        return numeros;

    }

    public static void main(String[] args) {

        System.out.println(rev());

    }
}
