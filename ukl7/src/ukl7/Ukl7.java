/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl7;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ukl7 {

    /**
     * @param args the command line arguments
     */


        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int admin = 13000; // menambah biaya admin
            String namaPelanggan[] = {"Galuh", "Indro", "Jedi", "Kanu"}; 
            String alamat[] = {"sawojajar", "kedungkandang", "batu", "kayu"};
            System.out.print("Masukkan Id Pelanggan= ");
            int id = input.nextInt();
            if (id < 1 || id > namaPelanggan.length) { 
                System.out.print("SALAH");
                System.exit(id); // misah
            }

            System.out.print("Masukkan Golongan Anda = ");
            int pilih = input.nextInt();
            System.out.print("Pemakaian listrik (kwh)= ");
            int listrik = input.nextInt(); 
            int tagihan = hitung(listrik, pilih);
            System.out.println("\n\n======================================================");
            System.out.println("Id Pelanggan        :" + id);
            System.out.println("Nama Pelanggan      :" + namaPelanggan[id - 1]);
            System.out.println("Alamat              :" + alamat[id - 1]);
            System.out.println("Biaya Admin         :13000");
            System.out.println("Jumlah Tagihan      :" + tagihan);

        }

        public static int hitung(int listrik, int pilih) {
            int tagihan = 0, admin = 13000;
            if (pilih == 1) {
                tagihan = listrik * 2000 + admin;
            } else if (pilih == 2) {
                tagihan = listrik * 5000 + admin;
            } else if (pilih == 3) {
                tagihan = listrik * 10000 + admin;;
            }
            return tagihan;

        }
    }
        // TODO code application logic here
//jumlah kwh listrik inputan user(100) * (dikali) 1500 + admin 13.000
    
    

