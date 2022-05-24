/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author LENOVO
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 4, b = 9;
        int total = 0;
        for (int n = 14; n<= 30; n++) {
            int u = a + ((n-1) * b);
            total = total + u;
            System.out.println(u);
        }
        System.out.println("Total Deret "+ total);
        // TODO code application logic here
    }
    
}
