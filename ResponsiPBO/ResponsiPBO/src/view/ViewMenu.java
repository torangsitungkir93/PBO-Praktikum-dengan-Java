package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewMenu extends JFrame {

    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox = new JPanel();

    JLabel lJudul, lDeskripsi1, lDeskripsi2, lDeskripsi3;

    JButton btnPinjam, btnTampil, btnAbout, btnLogout;

    GroupLayout gpPanelBack, gpPanelBox;

    public ViewMenu() {
        setTitle("Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400, 500);
        setLocationRelativeTo(null);
        
        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/iconHome1.png"));
        JLabel imgHome = new JLabel();
        JLabel imgHome1 = new JLabel();
        imgHome.setIcon(homeIcon);
        imgHome1.setIcon(homeIcon);
        
        lJudul = new JLabel("HOME");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 30));
        lJudul.setForeground(Color.BLACK);
        lDeskripsi1 = new JLabel("Welcome!");
        lDeskripsi1.setFont(new Font("COURIER NEW", Font.PLAIN, 24));
        lDeskripsi2 = new JLabel("Silakan Pilih Menu");
        lDeskripsi2.setFont(new Font("COURIER NEW", Font.PLAIN, 20));
        lDeskripsi3 = new JLabel("-- Perpustakaan UPN Yogyakarta --");
        lDeskripsi3.setFont(new Font("COURIER NEW", Font.PLAIN, 15));

        ImageIcon pinjamIcon = new ImageIcon(getClass().getResource("/images/iconRegister1.png"));
        ImageIcon tampilIcon = new ImageIcon(getClass().getResource("/images/iconTampil.png"));
        ImageIcon aboutIcon = new ImageIcon(getClass().getResource("/images/iconAbout.png"));
        ImageIcon logoutIcon = new ImageIcon(getClass().getResource("/images/iconLogout1.png"));

        btnPinjam = new JButton("Pinjam", pinjamIcon);
        btnTampil = new JButton("Tampil", tampilIcon);
        btnAbout = new JButton("About Us", aboutIcon);
        btnLogout = new JButton("Logout", logoutIcon);

        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelBox = new GroupLayout(pPanelBox);
        pPanelBox.setLayout(gpPanelBox);

        add(pPanelBack);
        pPanelBack.add(pPanelBox);

        pPanelBack.setBounds(0, 0, 400, 500);
        pPanelBack.setBackground(Color.BLUE);
        pPanelBox.setBounds(20, 20, 340, 410);
        pPanelBox.setBackground(Color.WHITE);

        pPanelBox.add(lJudul);
        pPanelBox.add(imgHome);
        pPanelBox.add(imgHome1);
        pPanelBox.add(lDeskripsi1);
        pPanelBox.add(lDeskripsi2);
        pPanelBox.add(lDeskripsi3);
        pPanelBox.add(btnPinjam);
        pPanelBox.add(btnTampil);
        pPanelBox.add(btnAbout);
        pPanelBox.add(btnLogout);

        lJudul.setBounds(130, 10, 300, 40);
        imgHome.setBounds(215, 8, 300, 40);
        imgHome1.setBounds(90, 8, 300, 40);

        lDeskripsi1.setBounds(110, 60, 200, 40);
        lDeskripsi2.setBounds(60, 90, 250, 40);
        lDeskripsi3.setBounds(20, 370, 300, 40);

        btnPinjam.setBounds(70, 170, 200, 30);
        btnTampil.setBounds(70, 220, 200, 30);
        btnAbout.setBounds(70, 270, 200, 30);
        btnLogout.setBounds(70, 320, 200, 30);
    }
    
    public static void main(String[] args) {
        new ViewMenu();
    }
}
