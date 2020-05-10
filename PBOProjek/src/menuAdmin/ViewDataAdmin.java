package menuAdmin;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ViewDataAdmin extends JFrame {
    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelTabel = new JPanel();
    JPanel pPanelForm = new JPanel();
    
    JLabel lJudul, lId, lUsername, lPass, lNama, lJk, lNoTelp, lAlamat;
    JTextField tfSearch, tfId, tfUsername, tfPass, tfNama, tfJk, tfNoTelp, tfAlamat;
    JButton btnReturn, btnSearch, btnAdd, btnEdit, btnDel, btnCancel;
    
    JRadioButton r1 = new JRadioButton("Laki-Laki");  
    JRadioButton r2 = new JRadioButton("Perempuan");
    
    ButtonGroup bg = new ButtonGroup();
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"ID Admin", "Username", "Password", "Nama Admin", "Jenis Kelamin", "No Telp", "Alamat"};
    
    GroupLayout gpPanelTop, gpPanelBack, gpPanelTabel, gpPanelLine, gpPanelForm;
    
    public ViewDataAdmin() {
        setTitle("Data Admin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(false);
        setSize(800,500);
        setLocationRelativeTo(null);
        
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        
        lId = new JLabel("Id Admin");
        lUsername = new JLabel("Username");
        lPass = new JLabel("Password");
        lNama = new JLabel("Nama Admin");
        lJk = new JLabel("Jenis Kelamin");
        lNoTelp = new JLabel("No Telpon");
        lAlamat = new JLabel("Alamat");
        
        lJudul = new JLabel("DATA ADMIN");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);
        
        tfSearch = new JTextField();
        tfId = new JTextField();
        tfUsername = new JTextField();
        tfPass = new JTextField();
        tfNama = new JTextField();
//        tfJk = new JTextField();
        tfNoTelp = new JTextField();
        tfAlamat = new JTextField();
        
        ImageIcon returnIcon = new ImageIcon(getClass().getResource("/images/iconReturn.png"));
        ImageIcon searchIcon = new ImageIcon(getClass().getResource("/images/iconSearch.png"));
        ImageIcon addIcon = new ImageIcon(getClass().getResource("/images/iconAdd.png"));
        ImageIcon editIcon = new ImageIcon(getClass().getResource("/images/iconEdit.png"));
        ImageIcon delIcon = new ImageIcon(getClass().getResource("/images/iconDel.png"));
        ImageIcon cancelIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));
        
        btnAdd = new JButton("Tambah", addIcon);
        btnEdit = new JButton("Edit", editIcon);
        btnDel = new JButton("Hapus", delIcon);
        btnCancel = new JButton("Batal", cancelIcon);
        btnReturn = new JButton("Kembali", returnIcon);
        btnSearch = new JButton("CARI BERDASARKAN USERNAME", searchIcon);
        
        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        gpPanelTabel = new GroupLayout(pPanelTabel);
        pPanelTabel.setLayout(gpPanelTabel);
        gpPanelForm = new GroupLayout(pPanelForm);
        pPanelForm.setLayout(gpPanelForm);
        
        bg.add(r1);
        bg.add(r2);
        
        add(pPanelTop);
        add(pPanelLine);
        add(pPanelBack);
        pPanelBack.add(pPanelTabel);
        pPanelBack.add(pPanelForm);
        pPanelTabel.add(scrollPane);
        pPanelTabel.add(tfSearch);
        pPanelTabel.add(btnSearch);
        
        pPanelTop.setBounds(0, 0, 800, 80);
        pPanelTop.setBackground(Color.GRAY);
        pPanelLine.setBounds(0, 80, 800, 5);
        pPanelLine.setBackground(Color.DARK_GRAY);
        pPanelBack.setBounds(0, 85, 800, 400);
        pPanelBack.setBackground(Color.RED);
        
        pPanelTabel.setBounds(10, 10, 530, 310);
        pPanelTabel.setBackground(Color.WHITE);
        pPanelForm.setBounds(550, 10, 220, 310);
        pPanelForm.setBackground(Color.WHITE);
        
        scrollPane.setBounds(10, 50, 510, 240);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        pPanelTop.add(lJudul);
        pPanelTop.add(btnReturn);
        pPanelBack.add(btnAdd);
        pPanelBack.add(btnEdit);
        pPanelBack.add(btnDel);
        pPanelBack.add(btnCancel);
        pPanelForm.add(lId);
        pPanelForm.add(lUsername);
        pPanelForm.add(lPass);
        pPanelForm.add(lNama);
        pPanelForm.add(lJk);
        pPanelForm.add(lNoTelp);
        pPanelForm.add(lAlamat);
        pPanelForm.add(tfId);
        pPanelForm.add(tfUsername);
        pPanelForm.add(tfPass);
        pPanelForm.add(tfNama);
//        pPanelForm.add(tfJk);
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
//        tfId.setBounds(100, 10, 100, 20);
        tfUsername.setBounds(100, 50, 100, 20);
        tfPass.setBounds(100, 90, 100, 20);
        tfNama.setBounds(100, 130, 100, 20);
//        tfJk.setBounds(100, 170, 100, 20);
        r1.setBounds(100, 160, 100, 20);
        r1.setBackground(Color.WHITE);
        r2.setBounds(100, 180, 100, 20);
        r2.setBackground(Color.WHITE);
        tfNoTelp.setBounds(100, 210, 100, 20);
        tfAlamat.setBounds(100, 250, 100, 20);
        
        lJudul.setBounds(280, 20, 370, 40);
        btnReturn.setBounds(20, 20, 120, 40);

        tfSearch.setBounds(270, 10, 250, 30);
        btnSearch.setBounds(10, 10, 250, 30);
        
        btnAdd.setBounds(20, 330, 170, 30);
        btnEdit.setBounds(210, 330, 170, 30);
        btnDel.setBounds(400, 330, 170, 30);
        btnCancel.setBounds(590, 330, 170, 30);

    }
    
}
