/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ShowAllData extends JFrame{
    
    JLabel lJudul = new JLabel("Data Kontak");
    JButton btnHomePanel = new JButton(" <<< Kembali");
    
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"Nama", "No HP", "Umur", "Email", "Note"}; //membuat kolom dalam array
    
    public ShowAllData(){
        tableModel = new DefaultTableModel(namaKolom, 0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        setTitle("Data Kontak");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(570, 450);
        setLocationRelativeTo(null);
        
        add (lJudul);
        
        lJudul.setBounds(220, 10, 200, 20);
        lJudul.setFont(new java.awt.Font("Times New Roman", 0, 20));
        //TABEL
        add(scrollPane);
        scrollPane.setBounds(30, 45, 500, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(btnHomePanel);
        btnHomePanel.setBounds(390, 350, 130, 20);  
      
    }
}
