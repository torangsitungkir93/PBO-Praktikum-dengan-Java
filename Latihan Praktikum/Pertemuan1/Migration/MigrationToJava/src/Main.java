
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torangto Situngkir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Ini adalah Java");
        System.out.print("Masukkan Nama anda : ");
        nama=in.nextLine();
        System.out.println("\n ==== Hai "+nama+"! ini adalah contoh input user");
    }
    
}
