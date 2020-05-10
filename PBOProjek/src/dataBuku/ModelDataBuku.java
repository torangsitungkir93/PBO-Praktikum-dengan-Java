package dataBuku;

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

    public void insertDataBuku(String judul, String kategori, String penerbit, String isbn,
            String suplier, String tahun, int harga, int stok) {
        try {
            if ("".equals(judul) || "".equals(kategori) || "".equals(penerbit)
                    || "".equals(isbn) || "".equals(suplier) || "".equals(tahun)
                    || "".equals(harga) || "".equals(stok)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "INSERT INTO `buku` (`judul`,`kategori`,`penerbit`,`ISBN`,`suplier`"
                        + ",`tahun`,`harga`,`stok`) "
                        + "VALUES ('" + judul + "','" + kategori + "','" + penerbit + "','" + isbn + "','" + suplier + "'"
                        + ",'" + tahun + "','" + harga + "','" + stok + "')";
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

    public void updateSuplier(int id, String nama, String hp, String alamat) {
        try {
            if ("".equals(nama) || "".equals(hp) || "".equals(alamat)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "UPDATE `suplier` SET nama='" + nama + "',no_hp='" + hp + "',alamat='" + alamat + "' WHERE id='" + id + "'";
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

    public String[][] readSuplier() {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 3

            String query = "Select * from `suplier`"; //pengambilan dara dalam java dari database
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

    public String[][] readSatuSuplier(String id) {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 3
            int num = Integer.parseInt(id);

            String query = "Select * from `suplier` where id='" + id + "'"; //pengambilan dara dalam java dari database
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

    public void deleteSuplier(int id) {
        try {
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Gagal Dihapus\nPastikan Isi No Hp yang ingin dihapus benar !");
            } else {
                String query = "DELETE FROM `suplier` WHERE `id` ='" + id + "'";
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
