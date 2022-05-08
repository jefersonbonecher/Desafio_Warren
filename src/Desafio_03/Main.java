/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {
    
    public static String soma(int [] vetor, int n ){
        int soma=0; 
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaAux  = new ArrayList<>();
        // adiciona o vetor de numeros em uma lista 
        for (int numero : vetor) {
            listaNumeros.add(numero);
        }
           Collections.sort(listaNumeros);
        
        for (int i = 0; i < listaNumeros.size(); i++) {
            while (soma<=n){
                soma+=(vetor[i]);
                listaAux.add(vetor[i]);                   
            }
            
       
            

//   for (int j = 0; j < listaNumeros.size(); j++) {
                
                            
           
                if (i%n==0){
                    
                }
            }
   //     }
        
        
        return null;
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
