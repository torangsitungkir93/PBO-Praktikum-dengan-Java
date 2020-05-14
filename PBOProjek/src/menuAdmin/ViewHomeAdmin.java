package menuAdmin;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewHomeAdmin extends JFrame {

    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox1 = new JPanel();
    JPanel pPanelBox2 = new JPanel();
    JPanel pPanelBox3 = new JPanel();
    JPanel pPanelBox4 = new JPanel();
    JPanel pPanelBox5 = new JPanel();

    JPanel pPanelDekor = new JPanel();

    JLabel lJudul, lNamaAdmin, lNamaToko, lNamaToko1;
    JButton btnLogout, btnDataAdmin, btnDataKasir, btnDataPenerbit, btnDataBuku, btnCatatanTransaksi;

    GroupLayout gpPanelBack, gpPanelBox1, gpPanelBox2, gpPanelBox3, gpPanelBox4, gpPanelBox5, gpPanelDekor;

    public ViewHomeAdmin() {
        setTitle("Home Admin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);

        lJudul = new JLabel("WELCOME ADMIN");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 30));
        lJudul.setForeground(Color.BLACK);
        lNamaAdmin = new JLabel("ADMIN NAME");
        lNamaAdmin.setFont(new Font("COURIER NEW", Font.PLAIN, 22));
        lNamaToko = new JLabel("Attala");
        lNamaToko.setFont(new Font("COURIER NEW", Font.PLAIN, 22));
        lNamaToko1 = new JLabel("Book Store");
        lNamaToko1.setFont(new Font("COURIER NEW", Font.PLAIN, 22));

        ImageIcon logoutIcon = new ImageIcon(getClass().getResource("../images/iconLogout1.png"));
        ImageIcon dataAdminIcon = new ImageIcon(getClass().getResource("../images/buttonDataAdmin.png"));
        ImageIcon dataKasirIcon = new ImageIcon(getClass().getResource("../images/buttonDataKasir.png"));
        ImageIcon dataPenerbitIcon = new ImageIcon(getClass().getResource("../images/buttonDataSuplier.png"));
        ImageIcon dataBukuIcon = new ImageIcon(getClass().getResource("../images/buttonDataBuku.png"));
        ImageIcon dataCatatanTransaksiIcon = new ImageIcon(getClass().getResource("../images/buttonCatatanTransaksi.png"));

        btnLogout = new JButton("Logout", logoutIcon);
        btnDataAdmin = new JButton("", dataAdminIcon);
        btnDataKasir = new JButton("", dataKasirIcon);
        btnDataPenerbit = new JButton("", dataPenerbitIcon);
        btnDataBuku = new JButton("", dataBukuIcon);
        btnCatatanTransaksi = new JButton("", dataCatatanTransaksiIcon);

        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelBox1 = new GroupLayout(pPanelBox1);
        pPanelBox1.setLayout(gpPanelBox1);
        gpPanelBox2 = new GroupLayout(pPanelBox2);
        pPanelBox2.setLayout(gpPanelBox2);
        gpPanelBox3 = new GroupLayout(pPanelBox3);
        pPanelBox3.setLayout(gpPanelBox3);
        gpPanelBox4 = new GroupLayout(pPanelBox4);
        pPanelBox4.setLayout(gpPanelBox4);
        gpPanelBox5 = new GroupLayout(pPanelBox5);
        pPanelBox5.setLayout(gpPanelBox5);

        gpPanelDekor = new GroupLayout(pPanelDekor);
        pPanelDekor.setLayout(gpPanelDekor);

        add(pPanelBack);
        pPanelBack.add(pPanelDekor);
        pPanelBack.add(pPanelBox1);
        pPanelBack.add(pPanelBox2);
        pPanelBack.add(pPanelBox3);
        pPanelBack.add(pPanelBox4);
        pPanelBack.add(pPanelBox5);

        pPanelBox1.add(btnDataAdmin);
        pPanelBox2.add(btnDataKasir);
        pPanelBox3.add(btnDataPenerbit);
        pPanelBox4.add(btnDataBuku);
        pPanelBox5.add(btnCatatanTransaksi);

        pPanelBack.add(lJudul);
        pPanelBack.add(lNamaAdmin);
        pPanelBack.add(lNamaToko);
        pPanelBack.add(lNamaToko1);

        pPanelBack.add(btnLogout);

        pPanelBack.setBounds(0, 0, 785, 555);
        pPanelBack.setBackground(Color.CYAN);
        pPanelDekor.setBounds(535, 43, 220, 2);
        pPanelDekor.setBackground(Color.BLACK);

        pPanelBox1.setBounds(90, 110, 180, 180);
        pPanelBox1.setBackground(Color.WHITE);
        pPanelBox4.setBounds(190, 320, 180, 180);
        pPanelBox4.setBackground(Color.WHITE);
        pPanelBox2.setBounds(300, 110, 180, 180);
        pPanelBox2.setBackground(Color.WHITE);
        pPanelBox5.setBounds(400, 320, 180, 180);
        pPanelBox5.setBackground(Color.WHITE);
        pPanelBox3.setBounds(510, 110, 180, 180);
        pPanelBox3.setBackground(Color.WHITE);

        lJudul.setBounds(275, 60, 300, 50);
        lNamaAdmin.setBounds(540, 20, 250, 20);
        lNamaToko.setBounds(20, 20, 100, 20);
        lNamaToko1.setBounds(20, 50, 140, 20);

        btnLogout.setBounds(570, 50, 150, 40);
        btnDataAdmin.setBounds(10, 10, 160, 160);
        btnDataKasir.setBounds(10, 10, 160, 160);
        btnDataPenerbit.setBounds(10, 10, 160, 160);
        btnDataBuku.setBounds(10, 10, 160, 160);
        btnCatatanTransaksi.setBounds(10, 10, 160, 160);

    }


}
