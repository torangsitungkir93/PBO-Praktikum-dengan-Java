/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author Torangto Situngkir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Membuat String
        String kataString="Hallo";
        
        char[] kataChar = {'h','a','l','l','o'};
        
        //Menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        //Mengakses komponen dari string
        System.out.println("Komponen pertama dari char[] = "+kataChar[3]);
        System.out.println("Komponen pertama dari String = "+kataString.charAt(3));
        
        //Merubah Komponen dari String
        //1 char
        kataChar[0]='c';
        System.out.println("Komponen pertama dari char[] = "+kataChar[3]);
        //2 String
        //String itu imutable,tidak bisa dirubah
        //kita bisa merubah komponen secara tidak langsung dengan subString
        printAddress("kataString : ",kataString);
        kataString="c"+kataString.substring(1,5);
        System.out.println(kataString);
        printAddress("kataString : ",kataString);
    }
    
    private static void printAddress(String nama,String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = "+ data + "\t|| address = "+Integer.toHexString(address));
    }
    
}
