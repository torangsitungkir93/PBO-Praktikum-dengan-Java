package Segitiga;

import java.util.Scanner;

/**
 *
 * @author Torangto Situngkir
 */
public class Main {

    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);

        // Inputan sisi 1,sisi 2,alas,tinggi,SisiTegak
        PrismaSegitiga prisma1 = new PrismaSegitiga(10, 8, 6, 8, 12);
        // Limas Segitiga Anggapannya Segitiga sama sisi
        LimasSegitiga limas1 = new LimasSegitiga(8, 8, 8, 10, 10);
        // Instance Tabung
        Tabung tabung1 = new Tabung(10, 30);
        // Instance Bola
        Bola bola1 = new Bola(14);

        do {
            System.out.println(" ==== | Menu Bangun Ruang | ==== ");

            System.out.println(" 1. Tampil Data Prisma Segitiga ");
            System.out.println(" 2. Ubah data Prisma Segitiga");
            System.out.println(" 3. Tampil Limas Segitiga ");
            System.out.println(" 4. Ubah Limas Segitiga ");
            System.out.println("--------------------------------------  ");
            System.out.println(" 5. Tampil Data Tabung ");
            System.out.println(" 6. Ubah Data Tabung");
            System.out.println(" 7. Tampil Data Kerucut ");
            System.out.println(" 8. Ubah Data Kerucut ");
            System.out.println(" 0. Exit");

            System.out.print(" Pilih : ");
            choice = in.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println(" -- Tampil data Prisma Segitiga -- ");
                    prisma1.showData();
                    break;
                }
                case 2: {
                    double tegak;
                    System.out.println(" -- Ubah tinggi Prisma Segitiga -- ");
                    System.out.println(" ----- Masukkan Data Baru");
                    System.out.print("Tinggi Prisma : ");
                    tegak = in.nextDouble();
                    prisma1.setSisiTegak(tegak);
                    break;
                }
                case 3: {
                    System.out.println(" -- Tampil Limas Segitiga -- ");
                    limas1.showData();
                    break;
                }
                case 4: {
                    double tegak;
                    System.out.println(" -- Ubah Limas Segitiga -- ");
                    System.out.println(" ----- Masukkan Data Baru");
                    System.out.print("Tinggi Limas : ");
                    tegak = in.nextDouble();
                    limas1.setSisiTegak(tegak);
                    break;
                }
                case 5: {
                    System.out.println(" -- Tampil data Tabung -- ");
                    tabung1.showData();
                    break;
                }
                case 6: {
                    double rad;
                    System.out.println(" -- Ubah Radius Tabung -- ");
                    System.out.println(" ----- Masukkan Data Baru");
                    System.out.print("Radius Tabung : ");
                    rad = in.nextDouble();
                    tabung1.setRadius((float) rad);
                    break;
                }
                case 7: {
                    System.out.println(" -- Tampil Data Bola -- ");
                    bola1.showData();
                    break;
                }
                case 8: {
                    double rad;
                    System.out.println(" -- Ubah Data Bola -- ");
                    System.out.println(" ----- Masukkan Data Baru");
                    System.out.print("Radius Bola : ");
                    rad = in.nextDouble();
                    bola1.setRadius((float) rad);
                    break;
                }
                case 0: {
                    System.out.println("Keluar ... ");
                    break;
                }
                default: {
                    System.out.println("Inputan anda salah ! ");
                    break;
                }
            }
            System.out.println("-------------------------------------------");
        } while (choice != 0);

    }

}
