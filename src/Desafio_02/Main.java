/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {

    public static String aula(int x, int[] tempoChegada) {
        int aux = 0;
        List<Integer> listaChegada = new ArrayList<>();

        for (int chegada : tempoChegada) {
            listaChegada.add(chegada);
        }

        for (int i = 0; i < listaChegada.size(); i++) {

          
            if (tempoChegada[i] <= 0) {
                aux++;
            }

        }
        if (aux >= x) {
            return ("Aula normal");
        } else {
            return ("Aula cancelada");

        }

    }

    public static void main(String[] args) {
        int x = 3;
        int[] tempoChegada = {-2, -1, 0, 1, 2};

        System.out.println(aula(x, tempoChegada));

    }

}
