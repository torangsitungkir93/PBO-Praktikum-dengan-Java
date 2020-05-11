package dataBuku;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ViewDataBuku extends JFrame {
    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelTabel = new JPanel();
    JPanel pPanelForm = new JPanel();
    
    JLabel lJudul, lId, lJudulB, lKategori, lPenerbit, lISBN, lSuplier, lTahun, lHarga, lStok;
    JTextField tfSearch, tfId, tfJudulB, tfKategori, tfPenerbit, tfISBN, tfSuplier, tfTahun, tfHarga, tfStok;
    JButton btnReturn, btnSearch, btnAdd, btnEdit, btnDel, btnCancel;
    
    JRadioButton r1 = new JRadioButton("Laki-Laki");  
    JRadioButton r2 = new JRadioButton("Perempuan");
    
    ButtonGroup bg = new ButtonGroup();
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"Judul", "Kategori", "Penerbit", "ISBN", "Suplier", "Tahun", "Harga", "Stok"};
    
    GroupLayout gpPanelTop, gpPanelBack, gpPanelTabel, gpPanelLine, gpPanelForm;
    
    public ViewDataBuku() {
        setTitle("Data Buku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(800,500);
        setLocationRelativeTo(null);
        
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        
//        lId = new JLabel("Id Buku");
        lJudulB = new JLabel("Judul");
        lKategori = new JLabel("Kategori");
        lPenerbit = new JLabel("Penerbit");
        lISBN = new JLabel("ISBN");
        lSuplier = new JLabel("Suplier");
        lTahun = new JLabel("Tahun Terbit");
        lHarga = new JLabel("Harga");
        lStok = new JLabel("Stok");
        
        lJudul = new JLabel("DATA BUKU");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);
        
        tfSearch = new JTextField();
//        tfId = new JTextField();
        tfJudulB = new JTextField();
        tfKategori = new JTextField();
        tfPenerbit = new JTextField();
        tfISBN = new JTextField();
        tfSuplier = new JTextField();
        tfTahun = new JTextField();
        tfHarga = new JTextField();
        tfStok = new JTextField();
        
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
        btnSearch = new JButton("CARI BERDASARKAN JUDUL", searchIcon);
        
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
        pPanelBack.setBackground(Color.GREEN);
        
        pPanelTabel.setBounds(240, 10, 530, 310);
        pPanelTabel.setBackground(Color.WHITE);
        pPanelForm.setBounds(10, 10, 220, 310);
        pPanelForm.setBackground(Color.WHITE);
        
        scrollPane.setBounds(10, 50, 510, 240);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        pPanelTop.add(lJudul);
        pPanelTop.add(btnReturn);
        pPanelBack.add(btnAdd);
        pPanelBack.add(btnEdit);
        pPanelBack.add(btnDel);
        pPanelBack.add(btnCancel);
//        pPanelForm.add(lId);
        pPanelForm.add(lJudulB);
        pPanelForm.add(lKategori);
        pPanelForm.add(lPenerbit);
        pPanelForm.add(lISBN);
        pPanelForm.add(lSuplier);
        pPanelForm.add(lTahun);
        pPanelForm.add(lHarga);
        pPanelForm.add(lStok);
//        pPanelForm.add(tfId);
        pPanelForm.add(tfJudulB);
        pPanelForm.add(tfKategori);
        pPanelForm.add(tfPenerbit);
        pPanelForm.add(tfISBN);
        pPanelForm.add(tfSuplier);
        pPanelForm.add(tfTahun);
        pPanelForm.add(tfHarga);
        pPanelForm.add(tfStok);
        
//        lId.setBounds(10, 10, 100, 20);
        lJudulB.setBounds(10, 40, 100, 20);
        lKategori.setBounds(10, 70, 100, 20);
        lPenerbit.setBounds(10, 100, 100, 20);
        lISBN.setBounds(10, 130, 100, 20);
        lSuplier.setBounds(10, 160, 100, 20);
        lTahun.setBounds(10, 190, 100, 20);
        lHarga.setBounds(10, 220, 100, 20);
        lStok.setBounds(10, 250, 100, 20);
//        tfId.setBounds(100, 10, 100, 20);
        tfJudulB.setBounds(100, 40, 100, 20);
        tfKategori.setBounds(100, 70, 100, 20);
        tfPenerbit.setBounds(100, 100, 100, 20);
        tfISBN.setBounds(100, 130, 100, 20);
        tfSuplier.setBounds(100, 160, 100, 20);
        tfTahun.setBounds(100, 190, 100, 20);
        tfHarga.setBounds(100, 220, 100, 20);
        tfStok.setBounds(100, 250, 100, 20);
        
        lJudul.setBounds(320, 20, 370, 40);
        btnReturn.setBounds(20, 20, 120, 40);

        tfSearch.setBounds(270, 10, 250, 30);
        btnSearch.setBounds(10, 10, 250, 30);
        
        btnAdd.setBounds(20, 330, 170, 30);
        btnEdit.setBounds(210, 330, 170, 30);
        btnDel.setBounds(400, 330, 170, 30);
        btnCancel.setBounds(590, 330, 170, 30);

    }
    
    public String getSearch () {
        return tfSearch.getText();
    }
    public String getJudulB () {
        return tfJudulB.getText();
    }
    public String getKategori () {
        return tfKategori.getText();
    }
    public String getPenerbit () {
        return tfPenerbit.getText();
    }
    public String getISBN () {
        return tfISBN.getText();
    }
    public String getSuplier () {
        return tfSuplier.getText();
    }
    public String getTahun () {
        return tfTahun.getText();
    }
    public String getHarga () {
        return tfHarga.getText();
    }
    public String getStok () {
        return tfStok.getText();
    }
    
    public static void main(String[] args) {
        new ViewDataBuku();
    }
}
