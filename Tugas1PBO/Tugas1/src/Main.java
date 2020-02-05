
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
    public static void main(String[] args) {
       String nama;
       int nilai[]= new int[5];
       int minValue = 0,maxValue = 0;
       float mean = 0;
       
       Scanner in =new Scanner(System.in);
       System.out.print("Nama : ");
       nama=in.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai ke-" +(i+1)+ " : ");
            nilai[i]=in.nextInt();
        }
        
        System.out.println("\n\n\nNama : "+nama);
        for (int i = 0; i < 5; i++) {
            if(i==0){
                minValue=nilai[i];
                maxValue=nilai[i];
            }else{
                if(minValue>nilai[i]){
                    minValue=nilai[i];
                }else if(maxValue<nilai[i]){
                    maxValue=nilai[i];
                }
            }
            mean+=nilai[i];
        }
        mean/=5;
        System.out.println("Nilai Tertinggi : "+maxValue);
        System.out.println("Nilai Terendah  : "+minValue);
        System.out.println("Rata Rata       : "+mean);
    }
    
}
