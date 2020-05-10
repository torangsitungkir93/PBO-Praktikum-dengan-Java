package dataSupplier;

import menuAdmin.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ViewDataSuplier extends JFrame {

    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelTabel = new JPanel();
    JPanel pPanelForm = new JPanel();

    JLabel lJudul, lId, lNama, lNoTelp, lAlamat, lIsiId;
    JTextField tfSearch, tfId, tfNama, tfNoTelp, tfAlamat;
    JButton btnReturn, btnSearch, btnAdd, btnEdit, btnDel, btnCancel;

    JRadioButton r1 = new JRadioButton("Laki-Laki");
    JRadioButton r2 = new JRadioButton("Perempuan");

    ButtonGroup bg = new ButtonGroup();

    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"ID Suplier", "Nama", "No Telp", "Alamat"};

    GroupLayout gpPanelTop, gpPanelBack, gpPanelTabel, gpPanelLine, gpPanelForm;

    public ViewDataSuplier() {
        setTitle("Data Suplier");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(false);
        setSize(800, 500);
        setLocationRelativeTo(null);

        tabelModel = new DefaultTableModel(kolom, 0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);

        lId = new JLabel("Id Suplier");
        lNama = new JLabel("Nama");
        lNoTelp = new JLabel("No Telp");
        lAlamat = new JLabel("Alamat");;

        lJudul = new JLabel("DATA SUPLIER");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);

        tfSearch = new JTextField();
        tfId = new JTextField();
        tfNama = new JTextField();
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
        btnSearch = new JButton("CARI BERDASARKAN NAMA", searchIcon);

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
        pPanelBack.setBackground(Color.ORANGE);

        pPanelTabel.setBounds(240, 10, 530, 340);
        pPanelTabel.setBackground(Color.WHITE);
        pPanelForm.setBounds(10, 10, 240, 340);
        pPanelForm.setBackground(Color.WHITE);

        scrollPane.setBounds(10, 50, 510, 280);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pPanelTop.add(lJudul);
        pPanelTop.add(btnReturn);
        pPanelForm.add(btnAdd);
        pPanelForm.add(btnEdit);
        pPanelForm.add(btnDel);
        pPanelForm.add(btnCancel);
        pPanelForm.add(lId);
        pPanelForm.add(lNama);
        pPanelForm.add(lNoTelp);
        pPanelForm.add(lAlamat);
        pPanelForm.add(tfId);
        pPanelForm.add(tfNama);
        pPanelForm.add(tfNoTelp);
        pPanelForm.add(tfAlamat);

        lId.setBounds(10, 10, 100, 20);
        lNama.setBounds(10, 50, 100, 20);
        lNoTelp.setBounds(10, 90, 100, 20);
        lAlamat.setBounds(10, 130, 100, 20);
        tfId.setBounds(100, 10, 100, 20);
        tfNama.setBounds(100, 50, 130, 20);
        tfNoTelp.setBounds(100, 90, 130, 20);
        tfAlamat.setBounds(100, 130, 130, 20);

        lJudul.setBounds(280, 20, 370, 40);
        btnReturn.setBounds(20, 20, 120, 40);

        tfSearch.setBounds(270, 10, 250, 30);
        btnSearch.setBounds(10, 10, 250, 30);

        btnAdd.setBounds(7, 200, 110, 30);
        btnEdit.setBounds(123, 200, 110, 30);
        btnDel.setBounds(7, 237, 110, 30);
        btnCancel.setBounds(123, 237, 110, 30);
//        btnAdd.setBounds(20, 330, 170, 30);
//        btnEdit.setBounds(210, 330, 170, 30);
//        btnDel.setBounds(400, 330, 170, 30);
//        btnCancel.setBounds(590, 330, 170, 30);

    }

    public int getIdInt() {
        int num = Integer.parseInt(tfId.getText());
        return num;
    }

    public String getIdString() {
        return tfId.getText();
    }

    public String getNama() {
        return tfNama.getText();
    }

    public String getSearch() {
        return tfSearch.getText();
    }

    public String getNOHP() {
        return tfNoTelp.getText();
    }

    public String getAlamat() {
        return tfAlamat.getText();
    }

//        lId = new JLabel("Id Suplier");
//        lNama = new JLabel("Nama");
//        lNoTelp = new JLabel("No Telp");
//        lAlamat = new JLabel("Alamat");;
//        
//        lJudul = new JLabel("DATA SUPLIER");
//        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
//        lJudul.setForeground(Color.WHITE);
//        
//        tfSearch = new JTextField();
//        tfId = new JTextField();
//        tfNama = new JTextField();
//        tfNoTelp = new JTextField();
//        tfAlamat = new JTextField();
}
