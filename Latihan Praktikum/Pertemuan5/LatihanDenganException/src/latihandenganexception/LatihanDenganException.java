/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandenganexception;

/**
 *
 * @author asus
 */
public class LatihanDenganException {

    
    public static void main(String[] args) {
        System.out.println("\n****** Program Dengan Exception "+"EXCEPTION HANDLING ******\n");
        
        try{
            int hasil=9/0;
            System.out.println("Hasil pembagian : "+hasil);
            System.out.println("Pernyataan dalam blok "+"try setelah bebas dari exception");
        }catch(ArithmeticException ex){
            System.out.println("");
            System.err.println("ArrithmeticException "+"menangkap exception hasil pembagian "+"oleh nol ");
            System.err.println("Exception yang ditangkap adalah : "+ex);
            System.out.println("");
        }finally{
            System.out.println("");
            System.out.println("Pernyataan dalam finally");
        }
        
        System.out.println("Pernyataan ini diluar blok "+"trycatch");
    }
    
}
