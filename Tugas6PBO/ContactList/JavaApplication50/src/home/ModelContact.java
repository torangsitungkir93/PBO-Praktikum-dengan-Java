package home;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ModelContact {

    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/latihan_javacontact";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query

    public ModelContact() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }

    public void insertKontak(String nama, String hp, String umur, String email, String note) {
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

    public String[][] readSatuKontak(String hp) {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][5]; //baris, kolom nya ada 3

            String query = "Select * from `kontak` where no_hp='" + hp + "'"; //pengambilan dara dalam java dari database
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

    public String[][] readNamaKontak() {
        try {
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][2]; //baris, kolom nya ada 3

            String query = "Select * from `kontak`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) { //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("nama"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("no_hp");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public int getBanyakData() {//menghitung jumlah baris
        int jmlData = 0;
        try {
            statement = koneksi.createStatement();
            String query = "Select * from `kontak`"; //pengambilan dara dalam java dari database
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
