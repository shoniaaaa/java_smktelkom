/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajipegawai;

/**
 *
 * @author LENOVO
 */
public class GajiPegawai {
       //deklarasi variabel dengan modifier private
    public double gajiKotor;
    private double pajak, gajiBersih;
    private double potongan=75000;
    private String nama = "Surya";
    public void setGaji (double gaji){ //mengatur nilai gajiKotor
        gajiKotor=gaji;
    }
    public void hitungPajak(){ //menghitung nilai pajak
        gajiBersih=gajiKotor-pajak-potongan;
    }
    public String namaPegawai(){ //menampilkan nama
        return nama;
    }
    public double getGajiKotor(){ //menampilkan nilai gajiKotor
        return gajiKotor;
    }
    public double getPajak(){ //menampilkan nilai pajak
        return pajak;
    }
    public double getPotongan(){ //menampilkan nilai potongan
        return potongan;
    } 
    public double getGajiBersih(){ //menampilkan nilai gajiBersih
        return gajiBersih;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
