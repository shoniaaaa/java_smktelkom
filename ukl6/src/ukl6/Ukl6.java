/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl6;

/**
 *
 * @author LENOVO
 */
public class Ukl6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a[][] = {{1,2,4,5},{2,4,5,6},{3,5,7,8}};
           
      
//2*3
        int b[][] = {{1,4,5},{2,3,4},{3,5,6},{4,6,7}};
            
        
        //3*4
        int hasil[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}

        };
        System.out.println("Hasil AxB");

        for (int i = 0; i < 7; i++) { //mengulang int a
            for (int j = 0; j < 5; j++) { //mengulang int b
                for (int k = 0; k < 5; k++) { //mengulang int a
                    hasil[i][j] = hasil[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 10; i++) { //mengulang int hasil
            for (int j = 0; j < 8; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
     }
}
        // TODO code application logic here
    
    

