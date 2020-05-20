
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
public class ModelPerpus {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tugas_responsipbo";
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;

    public ModelPerpus() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Success");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Connection Error");
        }
    }

    public int checkLogin(String username, String password) {
        int user = 0;
        try {
            String query = "SELECT * FROM user WHERE username='" + username + "' AND password='" + password + "' ";
            statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                user++;
            }
            if (user == 1) {
                JOptionPane.showMessageDialog(null, "Berhasil Login!");
            }
            return user;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }

    public int getPeminjaman() {
        int jumlahData = 0;
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "SELECT * FROM peminjaman ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jumlahData++;
            }
            return jumlahData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return 0;
        }
    }

    public String[][] readPeminjaman() {
        int jumlah = 0;
        try {
            String data[][] = new String[getPeminjaman()][5];
            String query = "Select * FROM peminjaman INNER JOIN `buku` ON peminjaman.buku=buku.id_buku "
                    + "INNER JOIN `anggota` ON anggota.id_anggota=peminjaman.peminjam";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("id_pinjam");
                data[jumlah][1] = rs.getString("id_anggota");
                data[jumlah][2] = rs.getString("nama");
                data[jumlah][3] = rs.getString("id_buku");
                data[jumlah][4] = rs.getString("judul");
                jumlah++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }

    public String[][] readAnggota(String id) {
        int jumlah = 0;
        try {
            String data[][] = new String[10][5];
            String query = "Select * FROM anggota WHERE id_anggota='" + id + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[0][0] = rs.getString("nama");
                jumlah++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }

    public String[][] readBuku(String id) {
        int jumlah = 0;
        try {
            String data[][] = new String[10][5];
            String query = "Select * FROM buku WHERE id_buku='" + id + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("judul");
                jumlah++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }

    public void tambahPeminjaman(String anggota, String buku) {
        try {
            String query = "INSERT INTO `peminjaman` (`buku`,`peminjam`) "
                    + "VALUES ('" + buku + "','" + anggota + "')";
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Pinjam Buku!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateAnggota(String id, String anggota) {
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "UPDATE `anggota` SET `nama` ='" + anggota + "' WHERE `id_anggota` ='" + id + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Update");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateBuku(String id, String judul) {
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "UPDATE `buku` SET `judul` ='" + judul + "' WHERE `id_buku` ='" + id + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Update");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void hapusPeminjaman(String idPinjam) {
        int id = Integer.parseInt(idPinjam);
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "DELETE FROM peminjaman WHERE `id_pinjam` = '" + id + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }
    
    public void updatePinjamBuku(String id, String anggota, String buku) {
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "UPDATE `peminjaman` SET `buku` ='" + buku + "', `peminjam` ='" + anggota + "' WHERE `id` ='" + id + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Pinjam Buku Berhasil di update");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
