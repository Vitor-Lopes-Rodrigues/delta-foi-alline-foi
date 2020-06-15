/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delta.no.git;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class DeltaNoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double del,x1,x2,a,b,c;
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Informe o valor de a:");
        a = entrada.nextDouble();
        System.out.println ("Informe o valor de b:");
        b = entrada.nextDouble();
        System.out.println ("Inform o valor de c:");
        c = entrada.nextDouble();
        
        del = Math.pow (b,2) - 4 * a * c ;
        x1 = (-b) + Math.sqrt(del) / (2 * a);
        x2 = (-b) - Math.sqrt(del) / (2 * a);
        
        System.out.println ("O delta vale:"+del);
        if(a == 0) {
            System.out.print("O valor de a não pode ser zero");
        }
        else
            if(del>0){
                System.out.println(x1);
                System.out.print(x2);
            }
        else
                if(del == 0){
                    System.out.print (x1);
                }
        else
                    if(del<0){
                        System.out.println("()");
                        System.out.print("()");
                        
                    }
    }
    
}
