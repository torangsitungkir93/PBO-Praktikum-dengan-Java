package kasirTransaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ModelDataTransaksi {

    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tugas_pbotokobuku";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    String dataTable[][] = new String[1][8];
    String dataHome[][] = new String[1][8];
    int status;

    Connection koneksi;
    Statement statement;//untuk perintah query
    ResultSet rs;

    public ModelDataTransaksi() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }

    public int getBanyakData() {//menghitung jumlah baris
        int jmlData = 0;
        try {
            statement = koneksi.createStatement();
            String query = "Select * from `buku`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                jmlData++;
            }
            return jmlData;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public void insertDataTransaksi(String tanggal, String id_buku, String buyer, String jumlah, String harga, String total,String id) {
        try {
            if ("".equals(id_buku) || "".equals(buyer) || "".equals(jumlah) || "".equals(harga)
                    || "".equals(total)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "INSERT INTO `catatan_transaksi` (`tanggal`,`id_buku`,`buyer`"
                        + ",`jumlah`,`harga`,`total`)"
                        + " VALUES ('" + tanggal + "','" + id_buku + "','" + buyer + "','"
                        + jumlah + "','" + harga + "','" + total + "')";
                //String '"+String+"' kalau Int "+int+"
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                kurangiStok(jumlah,id);
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambah");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public String[][] ambilDataPending(String id, String pembeli, String jumlah) {
        int num = Integer.parseInt(id);
        int jumlahINT = Integer.parseInt(jumlah);
        int jmlData = 0, subTotal;//menampung jumlah data
        String data[][] = new String[getBanyakData()][7]; //baris, kolom nya ada 3
        try {
            if ("".equals(id) || "".equals(pembeli) || "".equals(jumlah)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "Select * from `buku` where id=" + num + ""; //pengambilan dara dalam java dari database
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                    data[jmlData][0] = resultSet.getString("judul"); //kolom nama harus sama besar kecilnya dgn database
                    data[jmlData][1] = resultSet.getString("harga");
//                    data2[jmlData][0] = resultSet.getInt("harga");
                    data[jmlData][2] = resultSet.getString("stok");
                    jmlData++; //barisnya berpindah terus
                    status = 1;

                    if (jumlahINT > resultSet.getInt("stok")) {
                        status = 0;
                        throw new RuntimeException("Jumlah pembelian Melebihi Stok ! ");
                    }
                }

                if (jmlData == 0) {
                    throw new RuntimeException("Data Tidak Ditemukan,pastikan input id buku dengan benar ! ");
                }

                // Rumus
                int harga = Integer.parseInt(data[0][1]);
                subTotal = harga * jumlahINT;
                String subTotal2 = Integer.toString(subTotal);
                data[0][3] = id;
                data[0][4] = pembeli;
                data[0][5] = subTotal2;
                data[0][6] = jumlah;

                setDataHome(data[0][0], data[0][1], data[0][2], data[0][3], data[0][4], data[0][5], data[0][6]);
                setDataTable(data[0][0], data[0][1], jumlah, subTotal2);
            }
        } catch (Exception sql) {
            status = 0;
            System.out.println(sql.getMessage());
            System.out.println("Error : " + sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
        return data;
    }

    public String cekKembalian(String uang) {
        int total = 0;
        try {
            int harga = Integer.parseInt(this.dataHome[0][5]);
            int bayar = Integer.parseInt(uang);
            total = bayar - harga;
            this.status = 2;
            if (total < 0) {
                this.status = 1;
                throw new RuntimeException("Uang yang dimasukkan tidak cukup");
            }

        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            System.out.println("Error : " + sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
        String total2 = Integer.toString(total);
        return total2;
    }

    public String kurangiStok(String jumlah,String id) {
        int total = 0;
        try {
            int beli = Integer.parseInt(jumlah);
            int stok = Integer.parseInt(this.dataHome[0][6]);
            int sisa = stok - beli;
            int iden = Integer.parseInt(id);
            if ("".equals(iden)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "UPDATE `buku` SET stok='" + sisa + "' WHERE id='" + id + "'";
                //String '"+String+"' kalau Int "+int+"
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil Diedit");
                JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
            }

        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            System.out.println("Error : " + sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
        String total2 = Integer.toString(total);
        return total2;
    }

    public void setDataTable(String judul, String harga, String jumlah, String subTotal) {
        String data[][] = new String[getBanyakData()][4];
        this.dataTable[0][0] = judul; //kolom nama harus sama besar kecilnya dgn database
        this.dataTable[0][1] = harga;
        this.dataTable[0][2] = jumlah;
        this.dataTable[0][3] = subTotal;
    }

    public String[][] getDataTable() {
        String data[][] = new String[getBanyakData()][5];
        data[0][0] = this.dataTable[0][0]; //kolom nama harus sama besar kecilnya dgn database
        data[0][1] = this.dataTable[0][1];
        data[0][2] = this.dataTable[0][2];
        data[0][3] = this.dataTable[0][3];
        return data;
    }

    public void setDataHome(String judul, String harga, String stok, String id, String pembeli, String subTotal, String jumlah) {
        this.dataHome[0][0] = judul; //kolom nama harus sama besar kecilnya dgn database
        this.dataHome[0][1] = harga;
        this.dataHome[0][2] = stok;
        this.dataHome[0][3] = id;
        this.dataHome[0][4] = pembeli; //kolom nama harus sama besar kecilnya dgn database
        this.dataHome[0][5] = subTotal;
        this.dataHome[0][6] = jumlah;
    }

    public String[][] getDataHome() {
        String data[][] = new String[getBanyakData()][8];
        data[0][0] = this.dataHome[0][0]; //kolom nama harus sama besar kecilnya dgn database
        data[0][1] = this.dataHome[0][1];
        data[0][2] = this.dataHome[0][2];
        data[0][3] = this.dataHome[0][3];
        data[0][4] = this.dataHome[0][4]; //kolom nama harus sama besar kecilnya dgn database
        data[0][5] = this.dataHome[0][5];
        data[0][6] = this.dataHome[0][6];
        return data;
    }

    public int cekStatus() {
        return this.status;
    }

    public void insertDataKasir(String nama, String hp, String umur, String email, String note) {
        try {
            if ("".equals(nama) || "".equals(hp) || "".equals(umur) || "".equals(email)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "INSERT INTO `kontak`(`nama`, `no_hp`, `umur`,`email`,`note`) VALUES ('" + nama + "','" + hp + "','" + umur + "','" + email + "','" + note + "')";//value 1 (id diskip)
                //String '"+String+"' kalau Int "+int+"
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambah");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public void updateKontak(String nama, String hp, String umur, String email, String note) {
        try {
            if ("".equals(nama) || "".equals(hp) || "".equals(umur) || "".equals(email)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "UPDATE `kontak` SET nama='" + nama + "',umur='" + umur + "',email='" + email + "',note='" + note
                        + "' WHERE no_hp='" + hp + "'";
                //String '"+String+"' kalau Int "+int+"
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil Diedit");
                JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public String[][] readKontak() {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][5]; //baris, kolom nya ada 3

            String query = "Select * from `kontak`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("nama"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("no_hp");
                data[jmlData][2] = resultSet.getString("umur");
                data[jmlData][3] = resultSet.getString("email");
                data[jmlData][4] = resultSet.getString("note");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public void deleteKontak(String hp) {
        try {
            if ("".equals(hp)) {
                JOptionPane.showMessageDialog(null, "Gagal Dihapus\nPastikan Isi No Hp yang ingin dihapus benar !");
            } else {
                String query = "DELETE FROM `kontak` WHERE `no_hp` ='" + hp + "'";
                statement = koneksi.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            }
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
