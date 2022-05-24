/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdass5;

/**
 *
 * @author LENOVO
 */
public class Progdass5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int laptop=7, hardisk=11, mouse=21;
   int harga_laptop, harga_hardisk, harga_mouse;
   harga_laptop = 10000000;
   harga_hardisk =  1500000;
   harga_mouse = 150000;
   int  total_barang, total_aset, total_laptop, total_hardisk, total_mouse;
   total_laptop = laptop*harga_laptop;
   total_hardisk = hardisk*harga_hardisk;
   total_mouse = mouse*harga_mouse;
   
   
  total_barang = laptop+hardisk+mouse;
  total_aset = total_laptop+total_hardisk+total_mouse;
  
  System.out.println("total barang :" +total_barang);
  System.out.println("total aset :" +total_aset);
  
           }
}
        // TODO code application logic here
    
    

