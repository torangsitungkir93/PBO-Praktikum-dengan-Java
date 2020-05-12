package kasirDataKasir;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewKasirEditDataKasir extends JFrame {
    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelForm = new JPanel();
    
    JLabel lJudul, lId, lUsername, lPass, lNama, lJk, lNoTelp, lAlamat;
    JTextField tfSearch, tfUsername, tfPass, tfNama, tfNoTelp, tfAlamat;
    JButton btnReturn, btnSave, btnCancel;
    
    JRadioButton r1 = new JRadioButton("Laki-Laki");  
    JRadioButton r2 = new JRadioButton("Perempuan");
    
    ButtonGroup bg = new ButtonGroup();
    
    GroupLayout gpPanelTop, gpPanelBack, gpPanelLine, gpPanelForm;
    
    public ViewKasirEditDataKasir() {
        setTitle("Edit Data Kasir");
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
        
        lJudul = new JLabel("EDIT DATA KASIR");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);
        
        tfUsername = new JTextField();
        tfPass = new JTextField();
        tfNama = new JTextField();
        tfNoTelp = new JTextField();
        tfAlamat = new JTextField();
        
        ImageIcon returnIcon = new ImageIcon(getClass().getResource("/images/iconReturn.png"));
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/iconSave.png"));
        ImageIcon cancelIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));
        
        btnSave = new JButton("Simpan", saveIcon);
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
        
        bg.add(r1);
        bg.add(r2);
        
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
        pPanelBack.add(btnSave);
        pPanelBack.add(btnCancel);
        pPanelForm.add(lId);
        pPanelForm.add(lUsername);
        pPanelForm.add(lPass);
        pPanelForm.add(lNama);
        pPanelForm.add(lJk);
        pPanelForm.add(lNoTelp);
        pPanelForm.add(lAlamat);
        
        pPanelForm.add(tfUsername);
        pPanelForm.add(tfPass);
        pPanelForm.add(tfNama);
        pPanelForm.add(tfNoTelp);
        pPanelForm.add(tfAlamat);
        pPanelForm.add(r1);
        pPanelForm.add(r2);
        
        lId.setBounds(10, 10, 100, 20);
        lUsername.setBounds(10, 50, 100, 20);
        lPass.setBounds(10, 90, 100, 20);
        lNama.setBounds(10, 130, 100, 20);
        lJk.setBounds(10, 170, 100, 20);
        lNoTelp.setBounds(10, 210, 100, 20);
        lAlamat.setBounds(10, 250, 100, 20);
        
        tfUsername.setBounds(120, 50, 200, 20);
        tfPass.setBounds(120, 90, 200, 20);
        tfNama.setBounds(120, 130, 200, 20);
        r1.setBounds(120, 170, 100, 20);
        r1.setBackground(Color.WHITE);
        r2.setBounds(220, 170, 100, 20);
        r2.setBackground(Color.WHITE);
        tfNoTelp.setBounds(120, 210, 200, 20);
        tfAlamat.setBounds(120, 250, 200, 20);
        
        lJudul.setBounds(35, 40, 370, 40);
        btnReturn.setBounds(130, 10, 120, 30);
        
        btnSave.setBounds(40, 325, 140, 30);
        btnCancel.setBounds(200, 325, 140, 30);

    }
    
    public String getUsername () {
        return tfUsername.getText();
    }
    public String getPassword () {
        return tfPass.getText();
    }
    public String getNama () {
        return tfNama.getText();
    }
    public String getJK () {
        if (r1.isSelected()) {
            return "L";
        }
        else if (r2.isSelected()) {
            return "P";
        }
        else {
            return "";
        }
    }
    public String getNoTelp () {
        return tfNoTelp.getText();
    }
    public String getAlamat () {
        return tfAlamat.getText();
    }
    
    public static void main(String[] args) {
        new ViewKasirEditDataKasir();
    }
}
