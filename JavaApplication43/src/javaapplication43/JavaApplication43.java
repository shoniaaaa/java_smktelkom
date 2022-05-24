/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author LENOVO
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
   
        public static int hitung(int a, int b) {
        int jumlah = a+b;
        return jumlah;
                       
            }
    public static void nilai () {
        System.out.print("Nilai A + B adalah : " );
              
    }
     public static int hitung1(int a, int b) {
        int jumlah = a-b;
        return jumlah;
                       
            }
    public static void nilai1 () {
        System.out.print("Nilai A - B adalah : " );
              
    }
     public static int hitung2(int a, int b) {
        int jumlah = a*b;
        return jumlah;
                       
            }
    public static void nilai2 () {
        System.out.print("Nilai A * B adalah : " );
              
    }
     public static int hitung3(int a, int b) {
        int jumlah = a/b;
        return jumlah;
                       
            }
    public static void nilai3 () {
        System.out.print("Nilai A / B adalah : " );
              
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int a = input.nextInt();
        
        System.out.print("Masukkan nilai kedua : ");
        int b = input.nextInt();
        
        System.out.println("Silahkan pilih Method (+,-,*,/)");
        String method = input.next();
        
        if (method equals)
        
        nilai();
        System.out.println(hitung(a,b));
        
        nilai1();
        System.out.println(hitung1(a,b));
        
        nilai2();
        System.out.println(hitung2(a,b));
        
        nilai3();
        System.out.println(hitung3(a,b));
        // TODO code application logic here
    }
    
}
