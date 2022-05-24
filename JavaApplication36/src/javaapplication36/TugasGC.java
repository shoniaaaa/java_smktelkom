/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class TugasGC {
    public static void main(String[] args) {
        int [] inangka = {2,43,34,15,23,12,67,33};
        Array(inangka, "int angka ");
        urutan(inangka);
        Array(inangka, "urutan ");
    }
public static void uruta({int[] data){
        Arrays.sort(data);
        int[] arrayBuffer = Arrays.copyOf(data, data.length);
        for (int i = 0; i<data.lengthl i++){
            data[i] = arrayBUffer[(arrayBuffer.length - 1) -i;]
            
        }
            
        }

        
    }
    

