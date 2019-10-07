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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
        int k=teclado.nextInt();
        Integer l[][]=new Integer[n][2];
        for(int i=0;i<n;i++){
            l[i][0]=teclado.nextInt();
            l[i][1]=teclado.nextInt();
        }
        int count=0;
        
        int iniciar=0;
        for(int i=n-1;i>=0;i--)
            {
            if(count==k && l[i][1]==1)iniciar-=l[i][0];
            else
                {
                iniciar+=l[i][0];
                if(l[i][1]==1)count++;
            }
        }
            System.out.println(iniciar);
        }
}

