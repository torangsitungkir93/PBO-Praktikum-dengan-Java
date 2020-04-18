/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.awt.Font;
import static java.awt.SystemColor.window;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ViewTambah extends JFrame {
    JLabel lJudulBesar = new JLabel("Menu tambah Data");
    JButton btnSimpanPanel = new JButton("Simpan");
    JButton btnHomePanel = new JButton(" <<< Kembali");
    JButton btnResetPanel = new JButton("Reset");
    JLabel lNama = new JLabel("Nama ");
    JTextField tNama = new JTextField();
    JLabel lNohp = new JLabel("No HP ");
    JTextField tNohp = new JTextField();
    JLabel lUmur = new JLabel("Umur ");
    JTextField tUmur = new JTextField();
    JLabel lEmail = new JLabel("Email ");
    JTextField tEmail = new JTextField();
    JLabel lNote = new JLabel("Note ");
    JTextField tNote = new JTextField();
    
    public ViewTambah(){
        setTitle("Tambah Kontak");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(245, 360);
        setLocationRelativeTo(null);
        
         // Bagian Judul
        add(lJudulBesar);
        lJudulBesar.setBounds(60, 10, 200, 20);
        lJudulBesar.setFont(new java.awt.Font("Times New Roman", 0, 20));
        // Bagian Form
        add(lNama);
        lNama.setBounds(15, 45, 90, 20);
        add(tNama);
        tNama.setBounds(85, 45, 130, 20);
        add(lNohp);
        lNohp.setBounds(15, 75, 90, 20);
        add(tNohp);
        tNohp.setBounds(85, 75, 130, 20);
        add(lUmur);
        lUmur.setBounds(15, 105, 90, 20);
        add(tUmur);
        tUmur.setBounds(85, 105, 130, 20);
        add(lEmail);
        lEmail.setBounds(15, 135, 90, 20);
        add(tEmail);
        tEmail.setBounds(85, 135, 130, 20);
        add(lNote);
        lNote.setBounds(15, 175, 90, 20);
        add(tNote);
        tNote.setBounds(85, 165, 130, 70);
        
        add(btnSimpanPanel);
        btnSimpanPanel.setBounds(50, 285, 80, 25);
        add(btnResetPanel);
        btnResetPanel.setBounds(135, 285, 80, 25);
        add(btnHomePanel);
        btnHomePanel.setBounds(85, 245, 130, 20);  
    }
    
    public String getNama() {
        return tNama.getText();
    }

    public String getNoHP() {
        return tNohp.getText();
    }

    public String getUmur() {
        return tUmur.getText();
    }
    
    public String getEmail() {
        return tEmail.getText();
    }
    
    public String getNote() {
        return tUmur.getText();
    }
    
}
