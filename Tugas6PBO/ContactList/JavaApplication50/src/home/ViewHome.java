package home;

import java.awt.Color;
import java.awt.Font;
import static java.awt.SystemColor.window;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ViewHome extends JFrame {
    JLabel lJudulBesar = new JLabel("Database Kontak");
    JLabel lJudul1 = new JLabel("Pilih nama ");
    JLabel lJudul2 = new JLabel("Pilih Aksi  ");

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Lihat");
    JButton btnHapusPanel = new JButton("Hapus");
    JButton btnUbahPanel = new JButton("Edit");
    JButton btnLihatPanel = new JButton("Lihat");
    JButton btnTampilPanel = new JButton("Tampilan Semua Data");
    
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"Nama","No HP"}; //membuat kolom dalam array
    
    public ViewHome(){
        tableModel = new DefaultTableModel(0, 0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Database Kontak");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(380, 550);
        setLocationRelativeTo(null);
        
        //TABEL
        add(scrollPane);
        scrollPane.setBounds(15, 125, 335, 250);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    
        // Bagian Judul
        add(lJudulBesar);
        lJudulBesar.setBounds(95, 20, 200, 20);
        lJudulBesar.setFont(new java.awt.Font("Times New Roman", 0, 25));
        add(lJudul1);
        lJudul1.setBounds(15, 105, 90, 20);
        add(lJudul2);
        lJudul2.setBounds(15, 385, 90, 20);
        // Kumpulan Tombol
        add(btnTambahPanel);
        btnTambahPanel.setBounds(15, 410, 80, 25);
        add(btnUbahPanel);
        btnUbahPanel.setBounds(100, 410, 80, 25);
        add(btnHapusPanel);
        btnHapusPanel.setBounds(185, 410, 80, 25);
        btnHapusPanel.setForeground(Color.RED);
        add(btnLihatPanel);
        btnLihatPanel.setBounds(270, 410, 80, 25);
        
        add(btnTampilPanel);
        btnTampilPanel.setBounds(92, 450, 180, 25);
       
    }

}
