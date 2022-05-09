
package Desafio_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeferson Bonecher
 */
public class Main {

    /**
     * metodo identifica se terá a quantidade de alunos necessario para o
     * professor dar aula. foi transformado o vetor em uma lista fazendo um for
     * each percorrer a lista a cada item da lista ele compara de é menor ou
     * igual a zero ou maior que zero se for menor igual ele adiciona mais 1 na
     * variavel aux se for maior pula para o proximo item da lista
     *
     * @param x representa a quantidade de alunos necesario para ter aula.
     * @param tempoChegada representa o horario que os alunos chegaram na sala
     * @return se a variavel aux for maior igual ao numero informa x retorna
     * aula normal senão returna aula cancelada
     */
    public static String aula(int x, int[] tempoChegada) {
        int aux = 0;
        List<Integer> listaChegada = new ArrayList<>();

        for (int chegada : tempoChegada) {
            listaChegada.add(chegada);
        }

        for (int i = 0; i < listaChegada.size(); i++) {

            if (listaChegada.get(i) <= 0) {
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
