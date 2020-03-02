/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Throws gunanya untuk error sebelum di compile 

import java.io.FileInputStream;
import java.io.IOException;

public class Contoh {

    public static void main(String[] args) throws IOException{

       FileInputStream inputFile = new FileInputStream("input.txt"); 
       System.out.println((char)inputFile.read());
    }
}
