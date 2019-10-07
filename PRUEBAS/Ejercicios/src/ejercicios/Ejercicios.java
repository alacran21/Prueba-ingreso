/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.*;

/**
 *
 * @author MARIAP'AULA
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      int t = teclado.nextInt();
      while(t-- > 0){
        char[] sentencia1 = teclado.next().toCharArray();
        char[] sentencia2 = teclado.next().toCharArray();
        int[] so = new int[1000];
        for(int i = 0; i < sentencia1.length; i++){
          so[sentencia1[i]]++;
        }
        String result = "no";
        for(int i = 0; i < sentencia2.length; i++){
          if(so[sentencia2[i]]>0){
            result = "si";
            break;
          }
        }
        System.out.println(result);
      }
    }
    
}