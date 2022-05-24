/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer jumlah_hari;
        double jumlah_bayar;
        String datapenginapan[][]={
            {"Durian","3","100000","200000","300000"},
            {"Pisang","2","150000","260000","380000"},
            {"Lombok","1","50000","130000","320000"},
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan jumlah hari");
        jumlah_hari=input.nextInt();
        System.out.println("Inputkan nama Roomnya");
        String nama_room=input.next();
        System.out.println("Inputkan nama jenis hari");
        String jenis_hari=input.next();
        if(jenis_hari=="weekday"){
            jenis_day=2;
        }   else if(){
        
        
        for(int h=0; h < datapenginapan.length;h++){
            for(int n=0;n<datapenginapan[h].length; n++)
                 if(datapenginapan [h][n].equals(nama_room)) {
                   // System.out.println(datapenginapan[h][2]);
                   jumlah_bayar=jumlah_hari* Double.parseDouble(datapenginapan[h][2]);
                   System.out.print("jumlah bayar "+jumlah_bayar);
        }
        
    }
    
}
