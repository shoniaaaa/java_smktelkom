/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author LENOVO
 */
public class AplikasiLaundry {
    static JenisLaundry daftarJenisLaundry = new JenisLaundry();
    static Client daftarClient = new Client();
    static Petugas penjagaToko = new Petugas();
    static Transaksi transaksiLaundry = new Transaksi();
    static Laporan laporanLaundry = new Laporan();
    public static void main(String[] args) {
         laporanLaundry.laporan(daftarClient);
         
         
    }
    
}
