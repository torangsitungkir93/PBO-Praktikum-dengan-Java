package dataPribadiKasir;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewKasirDataKasir extends JFrame {
    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelForm = new JPanel();
    
    JLabel lJudul, lId, lUsername, lPass, lNama, lJk, lNoTelp, lAlamat, lJudul1, lId1, lUsername1, lPass1, lNama1, lJk1, lNoTelp1, lAlamat1;
//    JTextField tfSearch, tfId, tfUsername, tfPass, tfNama, tfJk, tfNoTelp, tfAlamat;
    JButton btnReturn, btnEdit, btnCancel;
    
    
    GroupLayout gpPanelTop, gpPanelBack, gpPanelLine, gpPanelForm;
    
    public ViewKasirDataKasir() {
        setTitle("Data Kasir");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(false);
        setSize(400,500);
        setLocationRelativeTo(null);
        
        lId = new JLabel("Id User");
        lUsername = new JLabel("Username");
        lPass = new JLabel("Password");
        lNama = new JLabel("Nama User");
        lJk = new JLabel("Jenis Kelamin");
        lNoTelp = new JLabel("No Telpon");
        lAlamat = new JLabel("Alamat");
        
        lId1 = new JLabel("2");
        lUsername1 = new JLabel("rfqywhy");
        lPass1 = new JLabel("condongcatur");
        lNama1 = new JLabel("Rifqy Wahoo");
        lJk1 = new JLabel("Laki laki");
        lNoTelp1 = new JLabel("086996694444");
        lAlamat1 = new JLabel("Jl. Galangpaut No 13 Blok 666");
        
        lJudul = new JLabel("DATA KASIR");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);
        
//        tfId = new JTextField();
//        tfUsername = new JTextField();
//        tfPass = new JTextField();
//        tfNama = new JTextField();
//        tfJk = new JTextField();
//        tfNoTelp = new JTextField();
//        tfAlamat = new JTextField();
        
        ImageIcon returnIcon = new ImageIcon(getClass().getResource("/images/iconReturn.png"));
        ImageIcon editIcon = new ImageIcon(getClass().getResource("/images/iconEdit.png"));
        ImageIcon cancelIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));
        
        btnEdit = new JButton("Edit", editIcon);
        btnCancel = new JButton("Batal", cancelIcon);
        btnReturn = new JButton("Kembali", returnIcon);
        
        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        gpPanelForm = new GroupLayout(pPanelForm);
        pPanelForm.setLayout(gpPanelForm);
        
        add(pPanelTop);
        add(pPanelLine);
        add(pPanelBack);
        pPanelBack.add(pPanelForm);
        
        pPanelTop.setBounds(0, 0, 800, 80);
        pPanelTop.setBackground(Color.GRAY);
        pPanelLine.setBounds(0, 80, 800, 5);
        pPanelLine.setBackground(Color.DARK_GRAY);
        pPanelBack.setBounds(0, 85, 800, 400);
        pPanelBack.setBackground(Color.CYAN);
        
        pPanelForm.setBounds(20, 20, 340, 290);
        pPanelForm.setBackground(Color.WHITE);
        
        pPanelTop.add(lJudul);
        pPanelTop.add(btnReturn);
        pPanelBack.add(btnEdit);
        pPanelBack.add(btnCancel);
        pPanelForm.add(lId);
        pPanelForm.add(lUsername);
        pPanelForm.add(lPass);
        pPanelForm.add(lNama);
        pPanelForm.add(lJk);
        pPanelForm.add(lNoTelp);
        pPanelForm.add(lAlamat);
        pPanelForm.add(lId1);
        pPanelForm.add(lUsername1);
        pPanelForm.add(lPass1);
        pPanelForm.add(lNama1);
        pPanelForm.add(lJk1);
        pPanelForm.add(lNoTelp1);
        pPanelForm.add(lAlamat1);
//        pPanelForm.add(tfId);
//        pPanelForm.add(tfUsername);
//        pPanelForm.add(tfPass);
//        pPanelForm.add(tfNama);
//        pPanelForm.add(tfJk);
//        pPanelForm.add(tfNoTelp);
//        pPanelForm.add(tfAlamat);
        
        lId.setBounds(10, 10, 100, 20);
        lUsername.setBounds(10, 50, 100, 20);
        lPass.setBounds(10, 90, 100, 20);
        lNama.setBounds(10, 130, 100, 20);
        lJk.setBounds(10, 170, 100, 20);
        lNoTelp.setBounds(10, 210, 100, 20);
        lAlamat.setBounds(10, 250, 100, 20);
        
        lId1.setBounds(120, 10, 200, 20);
        lUsername1.setBounds(120, 50, 200, 20);
        lPass1.setBounds(120, 90, 200, 20);
        lNama1.setBounds(120, 130, 200, 20);
        lJk1.setBounds(120, 170, 200, 20);
        lNoTelp1.setBounds(120, 210, 200, 20);
        lAlamat1.setBounds(120, 250, 200, 20);
//        tfId.setBounds(100, 10, 100, 20);
//        tfUsername.setBounds(100, 50, 100, 20);
//        tfPass.setBounds(100, 90, 100, 20);
//        tfNama.setBounds(100, 130, 100, 20);
//        tfJk.setBounds(100, 170, 100, 20);
//        tfNoTelp.setBounds(100, 210, 100, 20);
//        tfAlamat.setBounds(100, 250, 100, 20);
        
        lJudul.setBounds(80, 40, 370, 40);
        btnReturn.setBounds(130, 10, 120, 30);
        
        btnEdit.setBounds(100, 325, 170, 30);
//        btnCancel.setBounds(590, 330, 170, 30);

    }
    
    public static void main(String[] args) {
        new ViewKasirDataKasir();
    }
}
