package kasirTransaksi;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ViewKasirDataTransaksi extends JFrame {
    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    
    JLabel lJudul, lId, lTanggal, lNama, lJudulB, lHarga, lJumlah, lSubtotal, lTotal, lCash, lKembalian;
    JTextField tfId, tfTanggal, tfNama, tfJudulB, tfHarga, tfJumlah, tfSubtotal, tfTotal, tfCash, tfKembalian;
    JButton btnReturn, btnAdd, btnSave, btnCancel,btnCek;
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"Judul Buku", "Harga", "Jumlah", "Sub Total"};
    
    GroupLayout gpPanelTop, gpPanelBack, gpPanelLine;
    
    public ViewKasirDataTransaksi() {
        setTitle("Transaksi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(800,600);
        setLocationRelativeTo(null);
        
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        
        
        
        lId = new JLabel("Id Buku");
        lTanggal = new JLabel("Tanggal");
        lNama = new JLabel("Pembeli");
        lJudulB = new JLabel("Judul Buku");
        lHarga = new JLabel("Harga Jual");
        lJumlah = new JLabel("Jumlah");
        lSubtotal = new JLabel("Sub Total");
        lTotal = new JLabel("Total Pembelian (Rp)");
        lCash = new JLabel("Cash");
        lKembalian = new JLabel("Kembalian");
        
        lJudul = new JLabel("TRANSAKSI");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);
        
        tfId = new JTextField();
        tfTanggal = new JTextField();
        tfNama = new JTextField();
        tfJudulB = new JTextField();
        tfHarga = new JTextField();
        tfJumlah = new JTextField();
        tfSubtotal = new JTextField();
        tfTotal = new JTextField();
        tfCash = new JTextField();
        tfKembalian = new JTextField();
        
        ImageIcon returnIcon = new ImageIcon(getClass().getResource("/images/iconReturn.png"));
        ImageIcon addIcon = new ImageIcon(getClass().getResource("/images/iconAdd.png"));
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/iconSave.png"));
        ImageIcon cancelIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));
        
        btnAdd = new JButton("Tambah", addIcon);
        btnSave = new JButton("Simpan", saveIcon);
        btnCancel = new JButton("Batal", cancelIcon);
        btnReturn = new JButton("Kembali", returnIcon);
        btnCek = new JButton("Cek");
        
        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        
        add(pPanelTop);
        add(pPanelLine);
        add(pPanelBack);
        pPanelBack.add(scrollPane);
        
        pPanelTop.setBounds(0, 0, 800, 80);
        pPanelTop.setBackground(Color.GRAY);
        pPanelLine.setBounds(0, 80, 800, 5);
        pPanelLine.setBackground(Color.DARK_GRAY);
        pPanelBack.setBounds(0, 85, 800, 500);
        pPanelBack.setBackground(Color.LIGHT_GRAY);
        
        scrollPane.setBounds(70, 180, 630, 140);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        pPanelTop.add(lJudul);
        pPanelTop.add(btnReturn);
        pPanelBack.add(btnAdd);
        pPanelBack.add(btnSave);
        pPanelBack.add(btnCancel);
        pPanelBack.add(btnCek);
        
        pPanelBack.add(lId);
        pPanelBack.add(lTanggal);
        pPanelBack.add(lNama);
        pPanelBack.add(lJudulB);
        pPanelBack.add(lHarga);
        pPanelBack.add(lJumlah);
        pPanelBack.add(lSubtotal);
        pPanelBack.add(lTotal);
        pPanelBack.add(lCash);
        pPanelBack.add(lKembalian);

        pPanelBack.add(tfId);
        pPanelBack.add(tfTanggal);
        pPanelBack.add(tfNama);
        pPanelBack.add(tfJudulB);
        pPanelBack.add(tfHarga);
        pPanelBack.add(tfJumlah);
        pPanelBack.add(tfSubtotal);
        pPanelBack.add(tfTotal);
        pPanelBack.add(tfCash);
        pPanelBack.add(tfKembalian);
        
        lId.setBounds(10, 10, 100, 20);
        lTanggal.setBounds(10, 40, 100, 20);
        lNama.setBounds(10, 70, 100, 20);
        lCash.setBounds(10, 370, 100, 20);
        lKembalian.setBounds(10, 400, 100, 20);
        
        lJudulB.setBounds(70, 130, 100, 20);
        lHarga.setBounds(220, 130, 100, 20);
        lJumlah.setBounds(370, 130, 100, 20);
        lSubtotal.setBounds(440, 130, 100, 20);
        
        lTotal.setBounds(600, 5, 150, 20);
        
//        -------------------------------------------
        
        tfId.setBounds(80, 10, 150, 20);
        tfTanggal.setBounds(80, 40, 150, 20);
        tfNama.setBounds(80, 70, 150, 20);
        tfCash.setBounds(80, 370, 150, 20);
        tfKembalian.setBounds(80, 400, 150, 20);
        
        tfJudulB.setBounds(70, 150, 130, 20);
        tfHarga.setBounds(220, 150, 130, 20);
        tfJumlah.setBounds(370, 150, 50, 20);
        tfSubtotal.setBounds(440, 150, 130, 20);
        
        tfTotal.setBounds(300, 30, 430, 60);
        
        lJudul.setBounds(320, 20, 370, 40);
        btnReturn.setBounds(20, 20, 120, 40);
        
        btnAdd.setBounds(590, 140, 110, 30);
        btnCancel.setBounds(590, 100, 110, 30);
        btnSave.setBounds(240, 395, 110, 30);
        btnCek.setBounds(240, 355, 110, 30);

    }
    
//    public String getSearch () {
//        return tfSearch.getText();
//    }
//    public String getJudulB () {
//        return tfJudulB.getText();
//    }
//    public String getKategori () {
//        return tfKategori.getText();
//    }
//    public String getPenerbit () {
//        return tfPenerbit.getText();
//    }
//    public String getISBN () {
//        return tfISBN.getText();
//    }
//    public String getSuplier () {
//        return tfSuplier.getText();
//    }
//    public String getTahun () {
//        return tfTahun.getText();
//    }
//    public String getHarga () {
//        return tfHarga.getText();
//    }
//    public String getStok () {
//        return tfStok.getText();
//    }
    
}
