package menuKasir;


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
public class ModelKasir {

    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tugas_pbotokobuku";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query
    ResultSet rs;

    public ModelKasir() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }

    public void cekLogin(String username, String pass) {
        try {
            if ("".equals(username) || "".equals(pass)) {
                System.out.println("Gagal !");
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String sql = "SELECT * FROM user WHERE username='"+username+"' AND password='"+pass+"'";
                rs = statement.executeQuery(sql);
                if (rs.next()) {
                    if (username.equals(rs.getString("username")) && pass.equals(rs.getString("password"))) {
                        JOptionPane.showMessageDialog(null, "berhasil login");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
            }
        } catch (Exception sql) {
            System.out.println("Login gagals" + sql.getMessage());
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
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
}
