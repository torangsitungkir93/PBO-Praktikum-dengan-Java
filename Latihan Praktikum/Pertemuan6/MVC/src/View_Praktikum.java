/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import javax.swing.*;


class View_Praktikum extends JFrame{
    JPanel panel = new JPanel();
    JLabel lNama = new JLabel("Nama : ");
    JTextField tfNama = new JTextField();
    JLabel lNim = new JLabel("NIM : ");
    JTextField tfNim = new JTextField();
    JLabel lAlamat = new JLabel("Alamat : ");
    JTextField tfAlamat = new JTextField();
    
    JButton btnTambah = new JButton("Tambah");
    JButton btnCancel = new JButton("Cancel");
    JButton btnHapus = new JButton("Hapus");
    JButton btnEdit = new JButton("Edit");
    
    public View_Praktikum(){
        setTitle("Praktikum");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
        
        JLabel label = new JLabel("Perpus");
        panel.add(label);
        label.setBounds(250,20,300,20);
        
        add(panel);
        panel.setBounds(10,10,755,525);
        panel.setLayout(null);
        
        panel.add(lNama);
        lNama.setBounds(250,100,90,20);
        panel.add(tfNama);
        tfNama.setBounds(350,100,90,20);
        panel.add(lNim);
        lNim.setBounds(250,130,90,20);
        panel.add(tfNim);
        tfNim.setBounds(350,130,90,20);
        panel.add(lAlamat);
        lAlamat.setBounds(250,160,90,20);
        panel.add(tfAlamat);
        tfAlamat.setBounds(350,160,90,20);
        
        
        panel.add(btnTambah);
        btnTambah.setBounds(200,200,90,20);
        panel.add(btnCancel);
        btnCancel.setBounds(300,200,90,20);
        panel.add(btnHapus);
        btnHapus.setBounds(400,200,90,20); 
        panel.add(btnEdit);
        btnEdit.setBounds(500,200,90,20);
        
        btnCancel.setEnabled(false);
        btnHapus.setEnabled(false);
    }
}
