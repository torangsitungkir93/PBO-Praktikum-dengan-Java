package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewAbout extends JFrame {

    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox = new JPanel();

    JLabel lJudul, lDeskripsi1, lDeskripsi2, lDeskripsi3;

    JButton btnHome;

    GroupLayout gpPanelBack, gpPanelBox;

    public ViewAbout() {
        setTitle("About Us");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400, 500);
        setLocationRelativeTo(null);
        
        ImageIcon aboutIcon = new ImageIcon(getClass().getResource("/images/iconAbout.png"));
        JLabel imgAbout = new JLabel();
        JLabel imgAbout1 = new JLabel();
        imgAbout.setIcon(aboutIcon);
        imgAbout1.setIcon(aboutIcon);
        
        lJudul = new JLabel("ABOUT US");
        lJudul.setFont(new Font("HELVETICA", Font.BOLD, 29));
        lJudul.setForeground(Color.BLACK);
        lDeskripsi1 = new JLabel("Perpustakaan UPN");
        lDeskripsi1.setFont(new Font("HELVETICA", Font.PLAIN, 20));
        lDeskripsi2 = new JLabel("081397752892");
        lDeskripsi2.setFont(new Font("HELVETICA", Font.PLAIN, 20));
        lDeskripsi3 = new JLabel("Jl. Barbarsari no 77 Yogya");
        lDeskripsi3.setFont(new Font("HELVETICA", Font.PLAIN, 20));

        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/iconHome1.png"));

        btnHome = new JButton(homeIcon);

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
        pPanelBox.add(imgAbout);
        pPanelBox.add(imgAbout1);
        pPanelBox.add(lDeskripsi1);
        pPanelBox.add(lDeskripsi2);
        pPanelBox.add(lDeskripsi3);
        pPanelBox.add(btnHome);

        lJudul.setBounds(100, 60, 300, 40);
        imgAbout.setBounds(255, 58, 300, 40);
        imgAbout1.setBounds(65, 58, 300, 40);

        lDeskripsi1.setBounds(20, 150, 300, 40);
        lDeskripsi2.setBounds(20, 180, 300, 40);
        lDeskripsi3.setBounds(20, 210, 300, 40);

        btnHome.setBounds(10, 10, 50, 30);
    }
    
    public static void main(String[] args) {
        new ViewAbout();
    }
}
