
package desafiosemana1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class DesafioSemana1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int maior = 0;
         int menor = 999999999;
         int números = 0;
         ArrayList<Integer> listanumeros = new ArrayList<>();
    
        System.out.println("Digite os números sorteados do bingo:");
        
        while (números != -1){
        números = sc.nextInt();
        
        if (números != -1) {
           System.out.println("Digite o próximo número: "); 
           listanumeros.add(números);
        } else {
         System.out.println("");
         System.out.println("Fim da digitação:"); 
         System.out.println("Números sorteados foram:");
         System.out.println(listanumeros);
         System.out.println("Quantidade de números digitados foi:");
         System.out.println(listanumeros.size());
         System.out.println("O maior número sorteado foi:");       
           for(Integer valor : listanumeros) {  
              if(valor > maior) {
               maior = valor;
              }
           }
         System.out.println(maior); 
         System.out.println("O menor número sorteado foi:");
         for(Integer valor : listanumeros) {  
              if(valor < menor) {
               menor = valor;
              }
         }
         System.out.println(menor);   
             }
        }  
    }
}
