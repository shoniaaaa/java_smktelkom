/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_7;

/**
 *
 * @author LENOVO
 */
public class No_7 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nilai = ("Z");
         
         switch (nilai) {
             case ("A"):
                 System.out.println("Predikat nilai A: Sangat Baik");
                     break;
             case ("B"):
                  System.out.println("Predikat nilai B: Baik");
                     break;
             case ("C"):
                  System.out.println("Predikat nilai C: Cukup");
                     break;
             case ("D"):
                  System.out.println("Predikat nilai D: Kurang");
                     break;
             case ("E"):
                  System.out.println("Predikat nilai E: Sangat Kurang");
                     break;
             default:
                 System.out.println("Predikat nilai F: Buruk");
                     break;
            }
        // TODO code application logic here
    }
    
}
