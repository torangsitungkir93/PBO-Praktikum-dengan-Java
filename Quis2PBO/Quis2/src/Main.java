
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int pilih;
        int pilihan = 0;
        String kembali2 = null;
        Scanner in = new Scanner(System.in);
        CekAngka cekAngka = new CekAngka();

        do {
            System.out.println(" --- Menu Form Pendaftaran --- ");
            System.out.println("    1.Asisten Laboratorium ");
            System.out.println("    2.Admin Laboratorium");
            System.out.print("      Pilih Jenis Form : ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1: {
                    int jumlah;

                    int nilaiTulis, nilaiKoding, nilaiWawancara, nilaiMicro;
                    String nim, nama;
                    do {
                        System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");
                        System.out.print("Berapa banyak data yang akan dinputkan ? ");
                        jumlah = in.nextByte();
                        try {
                            if (jumlah < 1) {
                                throw new RuntimeException("Data yang dimasukkan harus >=1 ");
                            }
                            for (int i = 0; i < jumlah; i++) {
                                System.out.print("Input NIM   : ");
                                nim = in.nextLine();
                                nim = in.nextLine();
                                System.out.print("Input Nama  : ");
                                nama = in.nextLine();
                                try {
                                    System.out.print("Input Nilai Tes Tulis     : ");
                                    nilaiTulis = in.nextInt();
                                    if (cekAngka.isNilaiTrue(nilaiTulis) == false) {
                                        throw new RuntimeException("Inputan 0-100");
                                    }
                                    System.out.print("Input Nilai Coding        : ");
                                    nilaiKoding = in.nextInt();
                                    if (cekAngka.isNilaiTrue(nilaiKoding) == false) {
                                        throw new RuntimeException("Inputan 0-100");
                                    }
                                    System.out.print("Input Nilai Wawancara     : ");
                                    nilaiWawancara = in.nextInt();
                                    if (cekAngka.isNilaiTrue(nilaiWawancara) == false) {
                                        throw new RuntimeException("Inputan 0-100");
                                    }
                                    System.out.print("Input Nilai MicroTeaching : ");
                                    nilaiMicro = in.nextInt();
                                    if (cekAngka.isNilaiTrue(nilaiMicro) == false) {
                                        throw new RuntimeException("Inputan 0-100");
                                    }
                                    AsistenLaboratorium asdos = new AsistenLaboratorium(nim, nama, nilaiTulis, nilaiKoding, nilaiWawancara, nilaiMicro);
                                    System.out.println("Nilai Akhir : " + asdos.getNilaiAkhir());
                                    asdos.getKeputusan();
                                    System.out.println("\n");
                                } catch (Exception e) {
                                    System.out.println(e);
                                } finally {
                                    System.out.println("Inputan Harus Bilangan Bulat");
                                }
                            }
                            System.out.print("Apakah anda ingin kembali kemenu utama ? Y/N : ");
                            kembali2 = in.nextLine();
                            kembali2 = in.nextLine();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } while (kembali2.equals("n"));
                    break;
                }
                case 2: {
                    int jumlah;
                    int nilaiTulis, nilaiKoding, nilaiWawancara, nilaiJaringan;
                    String nim, nama;

                    do {
                        System.out.println("FORM PENDAFTARAN ADMIN LABORATORIUM");
                        System.out.print("Berapa banyak data yang akan dinputkan ? ");
                        jumlah = in.nextByte();

                        try {
                            if (jumlah < 1) {
                                throw new RuntimeException("Data yang dimasukkan harus >=1 ");
                            }
                            for (int i = 0; i < jumlah; i++) {
                                System.out.print("Input NIM   : ");
                                nim = in.nextLine();
                                nim = in.nextLine();
                                System.out.print("Input Nama  : ");
                                nama = in.nextLine();
                                System.out.print("Input Nilai Tes Tulis     : ");
                                nilaiTulis = in.nextInt();
                                System.out.print("Input Nilai Coding        : ");
                                nilaiKoding = in.nextInt();
                                System.out.print("Input Nilai Wawancara     : ");
                                nilaiWawancara = in.nextInt();
                                System.out.print("Input Nilai MicroTeaching : ");
                                nilaiJaringan = in.nextInt();
                                AdminLaboratorium admin = new AdminLaboratorium(nim, nama, nilaiTulis, nilaiKoding, nilaiWawancara, nilaiJaringan);
                                System.out.println("Nilai Akhir : " + admin.getNilaiAkhir());
                                admin.getKeputusan();
                                System.out.println("\n");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } while (kembali2.equals("n"));
                    break;
                }

                default: {
                    System.out.println("Input yang anda masukkkan salah ");
                    break;
                }
            }

        } while (pilihan != 1);

    }

}
