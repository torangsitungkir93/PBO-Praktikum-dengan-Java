package dataCatatanTransaksi;

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
public class ModelCatatanTransaksi {

    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tugas_pbotokobuku";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query
    ResultSet rs;

    public ModelCatatanTransaksi() {
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
            String query = "Select * from `catatan_transaksi`"; //pengambilan dara dalam java dari database
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

    public String[][] readTransaksi() {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][9]; //baris, kolom nya ada 3

            String query = "Select * from `catatan_transaksi`INNER JOIN `buku` ON catatan_transaksi.id_buku=buku.id"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("id"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("tanggal");
                data[jmlData][2] = resultSet.getString("judul");
                data[jmlData][3] = resultSet.getString("buyer");
                data[jmlData][4] = resultSet.getString("jumlah");
                data[jmlData][5] = resultSet.getString("harga");
                data[jmlData][6] = resultSet.getString("total");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public String[][] searchTransaksi(String nama) {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][9]; //baris, kolom nya ada 3

            String query = "Select * from `catatan_transaksi`INNER JOIN `buku` ON catatan_transaksi.id_buku=buku.id"
                    + " where `judul` LIKE '%" + nama + "%'"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
               data[jmlData][0] = resultSet.getString("id"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("tanggal");
                data[jmlData][2] = resultSet.getString("judul");
                data[jmlData][3] = resultSet.getString("buyer");
                data[jmlData][4] = resultSet.getString("jumlah");
                data[jmlData][5] = resultSet.getString("harga");
                data[jmlData][6] = resultSet.getString("total");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
}
