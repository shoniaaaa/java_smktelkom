/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author LENOVO
 */
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
    int a=5;
    int b=3;     
    int n=10;     
    int u=a;     
    int s=a; 
    System.out.println("Deret Aritmatikanya adalah");     
    for(int i=0;i<n;i++){                            
            System.out.println(u);            
            u=u+b;             
            s=s+u;     
        }     
    s=s-u; 
    System.out.println("Jumlah Deret Aritmatikanya adalah "+s); 
    }
}
