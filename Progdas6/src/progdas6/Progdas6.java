/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdas6;

/**
 *
 * @author LENOVO
 */
public class Progdas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input= new Scanner (System.in)
        String identitas="shonia";
        System.out.println("nama identitas= " +identitas);
        
        System.out.println("saran resep dari saya");
       
       
        
        //System.out.println("masukkan no. yang akan dipilih");
        int bahan1= 6;
        
        if(bahan1==1 || bahan1==2)
        {
            if(bahan1==1){
                System.out.println("bahan1= ");
                System.out.println("1. susu");
                System.out.println("2. pisang");
                System.out.println("2. tidak ada");
                
            }
            else{
                System.out.println("bahan2: ");
                System.out.println("tepung");
                System.out.println("minyak goreng");
            }
            
          

                    
        
        }
        if (bahan1==5 || bahan1==6)
        {
            if(bahan1==5){
                System.out.println("bahan5:");
                System.out.println("telur");
                System.out.println("minyak goreng");
            }
            else{
                System.out.println("bahan6:");
                System.out.println("telur yang sudah digoreng");
                System.out.println("roti");
        }
        }
        //System.out.println("masukkan nomor pilihan anda");
                
        int bahan2=2;
        if(bahan2>= 1 && bahan2<= 3){
            if(bahan1==2) {
                switch (bahan1)
                {
                    case 1:System.out.println("anda dapat membuat"
                                    +"minuman pisang" ); break;
                    case 2:System.out.println("anda dapat membuat"
                            + " pisang goreng"); break;
                    case 3:System.out.println("anda dapat membuat"
                            + "pisang rebus");
                }
                
            }
        }
        int bahan5=5;
        if(bahan5>=4 && bahan5<=6){
            if(bahan5==6){
                switch (bahan1)
                {
                    case 4:System.out.println("anda dapat membuat"
                            + "telur rebus"); 
                    case 5:System.out.println("anda dapat membuat"
                            + "telur goreng"); break;
                    case 6:System.out.println("anda dapat membuat"
                            + "roti telur"); break;
                }
            }
        }
        
      else{
            System.out.println("bahan tidak ditemukan"
                    + " tidak bisa menemukan resep");
             
        // TODO code application logic here
        }
    }
}
        // TODO code application logic here
    
    

