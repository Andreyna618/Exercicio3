
package exercicio3;

import java.util.Scanner;


public class Exercicio3 {

    
    public static void main(String[] args) {
     
        Scanner leia;
        leia = new Scanner (System.in);
        
        float numero;
        float frac ;
        int arren ;
        
        System.out.println("numero inteiro");
        numero = leia.nextInt();
         
        
        System.out.println("parte facionária");
        frac = numero/10;
        System.out.println(frac);
       
        System.out.println("arredondamento");
        arren = (int) Math.ceil(frac);
        
        System.out.println(arren);
        
        
       
    }
    
}
