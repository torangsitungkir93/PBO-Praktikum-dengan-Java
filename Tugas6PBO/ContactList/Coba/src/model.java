
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class model {
    Connection koneksi ;
    Statement statement ;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pbo_tugas_7_dbcontact";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";
    
    public model() {
     try {
        Class.forName(JDBC_DRIVER);
        koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        
     }  
     catch (Exception e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
         System.out.println("Koneksi Gagal");
     }
    }
    
    public void insertContact (String nama , String no_hp, String umur , String email) { 
        try {
        String query = "INSERT INTO `contact` (`nama`,`no_hp`,`umur`,`email`) "
                + "VALUES ('" + nama + "','" + no_hp + "','" + umur + "','" + email + "')";
        statement = (Statement) koneksi.createStatement();
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Kontak!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String[][] readContact() {
            int jumlah = 0 ;
            try {
                String data[][] = new String [ getContact()] [5];
                String query = "Select * FROM contact";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    data[jumlah][0] = rs.getString("nama");
                    data[jumlah][1] = rs.getString("no_hp");
                    data[jumlah][2] = rs.getString("umur");
                    data[jumlah][3] = rs.getString("email");
                    data[jumlah][4] = rs.getString("id");
                    jumlah++;
                }
                return data; 
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return null;
            }
        }
    
    public int getContact () {
         int jumlahData =0 ;
            try { 
                statement = (Statement) koneksi.createStatement();
                String query = "SELECT * FROM contact ";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next() ) { 
                    jumlahData ++ ;
                }
                return jumlahData;
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return 0;
            }
    }
    
    public void hapusKontak(String id) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "DELETE FROM contact WHERE `id` = '" +id+ "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }
    
    public void updateKontak (String id,String nama, String no_hp, String umur, String email){
        try{ 
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `contact` SET `nama` ='"+nama+"', `no_hp` ='"+no_hp+"', `umur` ='"+umur+"', `email` ='"+email+"' "+"WHERE `id` ='"+id+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Kontak Berhasil di update");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public int getBanyakContactSearch (String cari) { 
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM contact WHERE nama like '%"+cari+"%' OR no_hp like '%"+cari+"%' OR umur like '%"+cari+"%' OR email like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak ada kontak yang di cari");
            return 0 ;
        }
    }
    
    public String[][] getContactSearch (String cari) {
        try {
            int jmlh = 0 ;
            String data[][] = new String [getBanyakContactSearch(cari)][5] ;
            String query = "SELECT * FROM contact WHERE nama like '%"+cari+"%' OR no_hp like '%"+cari+"%' OR umur like '%"+cari+"%' OR email like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query) ;
            while (rs.next()) {
                data[jmlh][0] = rs.getString("nama");
                data[jmlh][1] = rs.getString("no_hp");
                data[jmlh][2] = rs.getString("umur");
                data[jmlh][3] = rs.getString("email");
                data[jmlh][4] = rs.getString("id");
                jmlh++;
            }
            return data;
        }
        catch (SQLException e) {
            return null;
        }
    }
    
}
