package menuKasir;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewHomeKasir extends JFrame {
    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox1 = new JPanel();
    JPanel pPanelBox2 = new JPanel();
    JPanel pPanelBox3 = new JPanel();
    
    JPanel pPanelDekor = new JPanel();
    
    JLabel lJudul, lNamaAdmin, lNamaToko, lNamaToko1;
    JButton btnLogout, btnDataKasir, btnTransaksi, btnDataBuku;
    
    GroupLayout gpPanelBack, gpPanelBox1, gpPanelBox2, gpPanelBox3, gpPanelDekor;
    
    public ViewHomeKasir() {
        setTitle("Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(800,600);
        setLocationRelativeTo(null);
        
        lJudul = new JLabel("WELCOME USER");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 30));
        lJudul.setForeground(Color.BLACK);
        lNamaAdmin = new JLabel("Rangto Tusingkir");
        lNamaAdmin.setFont(new Font("COURIER NEW", Font.PLAIN, 22));
        lNamaToko = new JLabel("Attala");
        lNamaToko.setFont(new Font("COURIER NEW", Font.PLAIN, 22));
        lNamaToko1 = new JLabel("Book Store");
        lNamaToko1.setFont(new Font("COURIER NEW", Font.PLAIN, 22));
        
        ImageIcon logoutIcon = new ImageIcon(getClass().getResource("/images/iconLogout1.png"));
        ImageIcon dataKasirIcon = new ImageIcon(getClass().getResource("/images/buttonDataKasir.png"));
        ImageIcon transaksiIcon = new ImageIcon(getClass().getResource("/images/buttonTransaksi.png"));
        ImageIcon dataBukuIcon = new ImageIcon(getClass().getResource("/images/buttonDataBuku.png"));
        
        btnLogout = new JButton("Logout", logoutIcon);
        btnDataKasir = new JButton("", dataKasirIcon);
        btnTransaksi = new JButton("", transaksiIcon);
        btnDataBuku = new JButton("", dataBukuIcon);
        
        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelBox1 = new GroupLayout(pPanelBox1);
        pPanelBox1.setLayout(gpPanelBox1);
        gpPanelBox2 = new GroupLayout(pPanelBox2);
        pPanelBox2.setLayout(gpPanelBox2);
        gpPanelBox3 = new GroupLayout(pPanelBox3);
        pPanelBox3.setLayout(gpPanelBox3);
        
        gpPanelDekor = new GroupLayout(pPanelDekor);
        pPanelDekor.setLayout(gpPanelDekor);
        
        add(pPanelBack);
        pPanelBack.add(pPanelDekor);
        pPanelBack.add(pPanelBox1);
        pPanelBack.add(pPanelBox2);
        pPanelBack.add(pPanelBox3);
        
        pPanelBox1.add(btnDataKasir);
        pPanelBox2.add(btnTransaksi);
        pPanelBox3.add(btnDataBuku);
        
        pPanelBack.add(lJudul);
        pPanelBack.add(lNamaAdmin);
        pPanelBack.add(lNamaToko);
        pPanelBack.add(lNamaToko1);
        
        pPanelBack.add(btnLogout);
        
        pPanelBack.setBounds(0, 0, 785, 555);
        pPanelBack.setBackground(Color.ORANGE);
        pPanelDekor.setBounds(535, 43, 220, 2);
        pPanelDekor.setBackground(Color.BLACK);
        
        pPanelBox1.setBounds(90, 190, 180, 180);
        pPanelBox1.setBackground(Color.WHITE);
        pPanelBox2.setBounds(300, 190, 180, 180);
        pPanelBox2.setBackground(Color.WHITE);
        pPanelBox3.setBounds(510, 190, 180, 180);
        pPanelBox3.setBackground(Color.WHITE);
        
        lJudul.setBounds(280, 120, 300, 50);
        lNamaAdmin.setBounds(540, 20, 250, 20);
        lNamaToko.setBounds(20, 20, 100, 20);
        lNamaToko1.setBounds(20, 50, 140, 20);
        
        btnLogout.setBounds(570, 50, 150, 40);
        btnDataKasir.setBounds(10, 10, 160, 160);
        btnTransaksi.setBounds(10, 10, 160, 160);
        btnDataBuku.setBounds(10, 10, 160, 160);
        
        
    }
    
//    public static void main(String[] args) {
//        new ViewHomeKasir();
//    }
}
