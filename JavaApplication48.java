/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Angel
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
                Random R=new Random();
        double a;
        int e;
        System.out.println("INGRESE UN NUMERO QUE QUIERAS SABER SI ES CUBICO");
        a=teclado.nextDouble();
        double raiz=Math.cbrt(a);
        System.out.println("LA RAIZ CUBICA DEL NUMERO ES: "+raiz);
        if(raiz%1==0){
            System.out.println("Por lo tanto el NUMERO ES CUBICO");
        }else{
            System.out.println("Por lo tanto el NUMERO NO ES CUBICO");
        }
        
        
    }
    
}
