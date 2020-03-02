/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Exception {
    public static void main(String[] args) throws FileNotFoundException {
       int[] array = {0,1,2,3};
       Scanner input = new Scanner(System.in);
       System.out.println("Nilai Array ke-");
       int index = input.nextInt();
       
//       Exception handling(try,catch,finaly)
        try{
            System.out.printf("index ke=%d,adalah %d",index,array[index]);
        }catch (java.lang.Exception e){
            System.out.println(e);
        }
        
        // Run time error jika run time tidak ada
        FileInputStream fileInput = null;
        
        try{
            fileInput = new FileInputStream("input.txt");
        }catch(java.lang.IOException e ){
            System.err.println(e);
        }
        
        // Menggabungkan 2 exception 
//        try{
//            
//        }
        
        System.out.println("Akhir dari program");
        
        }
}
