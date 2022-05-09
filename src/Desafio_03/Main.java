package Desafio_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jeferson Bonecher
 */
public class Main {

    public static String soma(int[] vetor, int n) {
        int soma = 0;
        String saida = "";
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaAux = new ArrayList<>();
        List<Integer> temporario = new ArrayList<>();
        // adiciona o vetor de numeros em uma lista 
        for (int numero : vetor) {
            listaNumeros.add(numero);
        }
        Collections.sort(listaNumeros);

        for (int i = 0; i < listaNumeros.size();) {
            soma += i;
            //for (int j = 0; j < listaNumeros.size();) {
            if (soma < n) {
                listaAux.add(listaNumeros.get(i));

            }
            if (soma > n) {
                listaAux.remove(listaAux.size() - 1);
                soma -= i;
                i++;
            }
            if (soma == n) {
                temporario.addAll(listaAux);
                if (listaAux.size() < temporario.size()) {
                    for (int j = 0; j < listaAux.size(); j++) {
                        temporario.add(listaAux.get(j));
                        saida=String.valueOf(temporario);
                      i++;
                        
                        
                    }
                }
                if (listaAux.size() == temporario.size()) {
                    for (int j = 0; j < listaAux.size(); j++) {
                        temporario.add(listaAux.get(j));
                        saida+=String.valueOf(temporario);
                      i++;

            }

        }

     
            }
        }
        return saida;
    }

    public static void main(String[] args) {
        int n = 10;
        int [] vetor = {3, 3, 4};
        System.out.println(soma(vetor, n));

    }

}
