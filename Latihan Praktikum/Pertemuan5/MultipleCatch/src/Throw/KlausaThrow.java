/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Throw;

/**
 *
 * @author asus
 */
public class KlausaThrow {
    public static void main(String[] args) {
        String input = "Throw RuntimeException";
        System.out.println("\n ****** Menggunakan Throw Klausa ****** ");
        try{
            if(input.equals("Throw RuntimeException")){
                throw new RuntimeException("Melempar Exception");
            }else if(input == null){
                throw new NullPointerException();
            }else {
                System.out.println("Input adalah : "+input);
            }
            System.out.println("\n Pernyataan dalam blok try setelah "+"Bebas dari pelembaparan exception");
        }catch(Exception ex){
            System.err.println("Exception ditangkap disini");
            System.err.println("\nException yang ditangkap adalah "+ex.getMessage());
        }
    }
}
