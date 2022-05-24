/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author LENOVO
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void cetak() {
        System.out.println("Kelas XR7");
    }
    
    
    
    public static int nilai() {
      int hasil = 100;
        return hasil;
    }
    
    public static int hitung(int a, int b) {
        int jumlah = a+b;
        return jumlah;
    }
        
    
    public static void main(String[] args) {
       cetak();
       System.out.println("NIlai Anda : " + nilai());
       
       System.out.println("Jumlah : " + hitung(10, 20));
        // TODO code application logic here
    }
    
}
