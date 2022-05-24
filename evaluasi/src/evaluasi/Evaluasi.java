/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluasi;

/**
 *
 * @author LENOVO
 */
public class Evaluasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int nilai=79;
        String predikat="B";
        if (nilai>=96){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : A");
            switch (predikat){
                case "A":
                    System.out.println("Kriteria : Sangat Baik");
            }
        }
        else if (nilai>=91){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : A-");
            switch (predikat){
                case "A-":
                    System.out.println("Kriteria : Sangat Baik");
            }
        }
        else if (nilai>=86){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : B+");
            switch (predikat){
                case "B+":
                    System.out.println("Kriteria : Baik");
            }
        }
        else if (nilai>=81){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : B");
            switch (predikat){
                case "B":
                    System.out.println("Kriteria : Baik");
            }
        }
        else if (nilai>=75){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : B-");
            switch (predikat){
                case "B-":
                    System.out.println("Kriteria : Baik");
            }
        }
        else if (nilai>=70){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : C+");
            switch (predikat){
                case "C+":
                    System.out.println("Kriteria : Cukup");
            }
        }
        else if (nilai>=65){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : C");
            switch (predikat){
                case "C":
                    System.out.println("Kriteria : Cukup");
            }
        }
        else if (nilai>=60){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : C-");
            switch (predikat){
                case "C-":
                    System.out.println("Kriteria : Cukup");
            }
        }
        else if (nilai>=55){
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : D+");
            switch (predikat){
                case "D+":
                    System.out.println("Kriteria : Kurang");
            }
        }
        else {
            System.out.println("Nilai : "+nilai);
            System.out.println("Predikat : D");
            switch (predikat){
                case "D":
                    System.out.println(" kriteria : Kurang");
            }
        }
    }
}  
        // TODO code application logic here
    }
    
}
