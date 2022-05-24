/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

/**
 *
 * @author LENOVO
 */
public class Ukl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a=10;    
     int b=8;    
     int u=a;    
     int s=a; 
    System.out.println("Deret Aritmatikanya adalah");     
    for(int i=0;i<6;i++){                            
        for(int j=0;j<7;j++){  
            System.out.print(u+"\t");            
            u=u+b; 
            s=s+u;                     
        }  
        System.out.println(); 
    }     s=s-u; 
    System.out.println("Jumlah Deret Aritmatikanya adalah "+s); 
} 

        // TODO code application logic here
    }
    

