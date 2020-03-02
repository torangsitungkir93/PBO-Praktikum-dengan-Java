
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
        int[] array = {0, 1, 2, 3};
        Scanner input = new Scanner(System.in);
        System.out.print("data ke-");

        int index = input.nextInt();

        // Exception Biasa
        System.out.println("Exception Biasa");
        try {
            System.out.printf("Data dari array ke-%d adalah %d", index, array[index]);
        } catch (Exception e) {
            System.out.println("Error input yang anda masukkan melebihi batas array");
        }
        // Exception dalam fungsi
        System.out.println("\nException didalam fungsi ");
        int data = ambilData(array, index);
        System.out.printf("Data dari array ke-%d adalah %d", index, data);

        // Exception Throws dalam method
        System.out.println("\nException dalam method ");
        System.out.println("Exception throws by method ");

        int data2 = 0;

        try {
           data2 = ambilData2(array, index);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.printf("Data dari array ke-%d adalah %d", index, data2);

        System.out.println("\n\nAkhir dari program");
    }

    private static int ambilData2(int array[], int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    private static int ambilData(int array[], int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.out.println("Error input yang anda masukkan melebihi batas array");
        }

        return hasil;
    }

}
