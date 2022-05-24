/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl5;

/**
 *
 * @author LENOVO
 */
public class Ukl5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        int a[][]={{-7,5,2,4},{4,8,3,4},{2,4,6,8}};
        int b[][]={{2,3,4,5},{4,5,6,9},{2,3,6,5},{1,3,6,7}};
    System.out.println("Hasil A-B");
     for(int i=0;i<4;i++){ 
        for(int j=0;j<4;j++){ 
 System.out.print(a[i][j]-b[i][j]+"\t"); 
     }
 System.out.println();
    }
}

}

        // TODO code application logic here
    
    

