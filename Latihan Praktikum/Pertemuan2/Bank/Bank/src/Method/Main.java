package Method;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torangto Situngkir
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        Tabungan tabungan = new Tabungan("Torangto Situngkir","123180122");
        tabungan.jumlahSaldo=2000000;
        int pilihMenu;
        int jumlah = 0;
        int saldoAkhir = 0;
        char kembali = 0;

        do {
            System.out.println("========= Tabungan : "+tabungan.nama);
            System.out.println("MENU");
            System.out.println("1. Penarikan");
            System.out.println("2. Penyetoran");
            System.out.print("Pilih : ");
            pilihMenu = scanInput.nextInt();

            if (pilihMenu == 1) {
                System.out.println("Penarikan Tunai");
                System.out.print("Masukkan Jumlah : ");
                jumlah = scanInput.nextInt();
                if (jumlah < (tabungan.jumlahSaldo-50000)) {
                    saldoAkhir = tabungan.penarikanSaldo(jumlah);
                    System.out.println("Saldo Akhir Anda adalah : " + saldoAkhir ); 
                } else {
                    saldoAkhir = tabungan.getJumlahSaldo();
                    System.out.println("Jumlah penarikan melebihi saldo Anda. Transaksi dibatalkan.");
                    System.out.println("Saldo Akhir Anda adalah : " + saldoAkhir );
                }
            } else if (pilihMenu == 2) {
                System.out.println("Penarikan Tunai");
                System.out.print("Masukkan Jumlah : ");
                jumlah = scanInput.nextInt();
                tabungan.setorSaldo(jumlah);
                System.out.println("Saldo Akhir Anda adalah : " + tabungan.getJumlahSaldo());
            } else {
                System.out.println("Input Menu tidak sesuai !");
            }
            System.out.print("Apakah Anda akan melakukan transaksi kembali ? (y/n): ");
            kembali = scanInput.next().charAt(0);
        } while (kembali == 'Y' || kembali == 'y');
    }
}
