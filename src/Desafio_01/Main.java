package Desafio_01;

/**
 *
 * @author Jeferson Bonecher
 */
public class Main {

    /**
     * o metodo inverte o soma os numeros verificando se é impar ou nao no
     * primeiro faço um laço de repetição indo de 11 até a soma ser menor que
     * 1000000 transformo o numero em uma string faço um for com tamanho maximo
     * da string até a posição zero adicionado cada valor na variavel reverso
     * verifico se o primeiro numero é zero senão é ele faz a soma após somar
     * verifica se é impar ou não.
     *
     *
     * @return os numeros mais a quantidade de numeros impar
     */
    public static String rev() {
        int aux;
        String numeros = "";
        int soma = 0;
        int total = 0;
        String reverso = "";
        for (int numero = 11; soma <= 1000000; numero++) {

            for (int i = (String.valueOf(numero).length() - 1); i >= 0; i--) {
                reverso += String.valueOf(numero).charAt(i);
            }

            aux = Integer.parseInt((String) reverso.subSequence(0, 1));

            if (aux != 0) {
                soma = numero + Integer.parseInt(reverso);

                if (soma % 2 != 0) {
                    numeros += String.valueOf(numero) + "\n";
                    total++;

                }
            }
        }
        return numeros + "quantidade de numeros impar é:" + total;

    }

    public static void main(String[] args) {

        System.out.println(rev());

    }
}
