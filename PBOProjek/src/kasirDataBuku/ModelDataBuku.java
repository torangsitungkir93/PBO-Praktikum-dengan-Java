package kasirDataBuku;

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
public class ModelDataBuku {

    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tugas_pbotokobuku";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query
    ResultSet rs;

    public ModelDataBuku() {
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
            String query = "Select * from `user`"; //pengambilan dara dalam java dari database
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

    public String[][] readBuku() {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][9]; //baris, kolom nya ada 3
            
            String query = "Select * from `buku` INNER JOIN `suplier` ON buku.id=suplier.id"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("judul"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][2] = resultSet.getString("kategori");
                data[jmlData][3] = resultSet.getString("penerbit");
                data[jmlData][4] = resultSet.getString("ISBN");
                data[jmlData][5] = resultSet.getString("nama");
                data[jmlData][6] = resultSet.getString("tahun");
                data[jmlData][7] = resultSet.getString("harga");
                data[jmlData][8] = resultSet.getString("stok");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public String[][] searchSuplier(String nama) {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 3

            String query = "Select * from `suplier` where nama LIKE '%" + nama + "%'"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][2] = resultSet.getString("no_hp");
                data[jmlData][3] = resultSet.getString("alamat");
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
