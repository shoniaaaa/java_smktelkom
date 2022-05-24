/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.nomor.pkg6;

/**
 *
 * @author LENOVO
 */
public class UKLNomor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a[][]={
                {1,2,4,5},
                {2,4,5,6},
                {3,5,7,8}};
    int b[][]={
                {1,4,4},
                {2,3,4},
                {4,6,7},
                {2,4,5}};
    int h[][]=new int [a.length][b[0].length];
    System.out.println("Hasil perhitungan A x B adalah :");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){ 
            for(int k=0;k<4;k++){ 
                h[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(h[i][j]+"\t");
        }
        System.out.println();
        }
    }
}
        // TODO code application logic here
    
    

