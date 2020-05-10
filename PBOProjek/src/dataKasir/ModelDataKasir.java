package dataKasir;

import menuAdmin.*;
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
public class ModelDataKasir {

    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tugas_pbotokobuku";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query
    ResultSet rs;

    public ModelDataKasir() {
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

    public void insertDataKasir(String username, String nama, String gender,String password) {
        try {
            if ("".equals(username) || "".equals(nama) || "".equals(gender) || "".equals(password)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "INSERT INTO `user` (`username`,`nama`,`gender`,'password','level') "
                        + "VALUES ('" + username + "','" + nama + "','" + gender + "','" +password +"',"+2+")";
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

    public void updateKasir(String username, String nama, String gender,String hp,String alamat) {
        try {
            if ("".equals(nama) || "".equals(username) || "".equals(gender) || "".equals(hp) || "".equals(alamat)) {
                System.out.println("Gagal ditambahkan");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "UPDATE `user` SET nama='" + nama + "',gender='" 
                        + gender + "',no_hp='" + hp + "',alamat='"+alamat+"' WHERE username='" + username + "'";
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

    public String[][] readKasir() {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][7]; //baris, kolom nya ada 3

            String query = "Select * from `user` where level="+2+""; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("username");
                data[jmlData][1] = resultSet.getString("gender"); //kolom nama harus sama besar kecilnya dgn database
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

    public String[][] searchKasir(String nama) {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 3

            String query = "Select * from `user` where level="+2+" AND nama LIKE '%" + nama + "%'"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("username");
                data[jmlData][1] = resultSet.getString("gender"); //kolom nama harus sama besar kecilnya dgn database
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

    public String[][] readSatuKasir(String id) {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 3
            int num = Integer.parseInt(id);

            String query = "Select * from `user` where level="+2+" AND id='" + id + "'"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("username");
                data[jmlData][1] = resultSet.getString("gender"); //kolom nama harus sama besar kecilnya dgn database
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

    public void deleteKasir(int id) {
        try {
            if ("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Gagal Dihapus\nPastikan Isi No Hp yang ingin dihapus benar !");
            } else {
                String query = "DELETE FROM `user`  where level="+2+" AND `id` ='" + id + "'";
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
