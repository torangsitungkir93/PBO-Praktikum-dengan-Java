
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       int[] array = {0,1,2,3};
       Scanner input = new Scanner(System.in);
       FileInputStream fileInput = null;
       System.out.print("Nilai Array ke-");
       int index = input.nextInt();
       
////      // Exception handling(try,catch,finaly)
//        try{
//            System.out.printf("index ke=%d,adalah %d",index,array[index]);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        
//        // Run time error jika run time tidak ada
//        try{
//            fileInput = new FileInputStream("input.txt");
//        }catch(IOException e ){
//            System.err.println(e);
//        }
        
        // Exception handling(try,catch,finaly)
        System.out.println("Handling out of bound");
        try{
            System.out.printf("index ke=%d,adalah %d\n",index,array[index]);
            fileInput = new FileInputStream("input.txt");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }catch (IOException e){
            System.out.println("File tidak ditemukan");
        }// Finaly
        finally{
            System.out.println("Melakukan Finally");
        }
        
        
        
        System.out.println("\nAkhir dari program");
        
        }
    
}
