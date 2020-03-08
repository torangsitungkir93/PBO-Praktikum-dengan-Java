

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class swing extends JFrame {
    JLabel ljudul = new JLabel("INPUT DATA DIRI");
    JTextField fnama = new JTextField(10);
     JLabel lnama = new JLabel("Nama");
     JLabel lnim = new JLabel("NIM");
     JLabel ljk = new JLabel("Jenis kelamin");
     JRadioButton rbpria = new JRadioButton("Laki - laki");
     JRadioButton rbwanita = new JRadioButton("Perempuan");
     
     JLabel lagama = new JLabel("Agama");
     String [] namaAgama = {"islam", "kristen", "katolik" , "hindu" , "budha"};
     JComboBox cmbAgama = new JComboBox(namaAgama);
     
     JLabel lhobby = new JLabel("Hobby");
     JCheckBox cbBola = new JCheckBox("Sepak Bola");
     JCheckBox cbBasket = new JCheckBox("Basket");
     JCheckBox cbBuluTangkis = new JCheckBox("Bulu Tangkis");
    
    JButton btnConfirm = new JButton( "Confirm");
    
    public swing () {
        setTitle("Data Diri");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600,400);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbpria); 
        group.add(rbwanita);
        
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lnim);
        add(ljk);
        add(rbpria);
        add(rbwanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbBasket);
        add(cbBola);
        add(cbBuluTangkis);
        add(btnConfirm);
        
        ljudul.setBounds(200,25,200,30);
        ljudul.setFont(new java.awt.Font("Times New Roman",0,24));
        lnama.setBounds(50,100,120,20);
        fnama.setBounds(170,100,150,20);
        ljk.setBounds(50,130,120,20);
        rbpria.setBounds(170,130,120,20);
        rbwanita.setBounds(300,130,120,20);
        lagama.setBounds(50,160,120,20);
        cmbAgama.setBounds(170,160,120,20);
        lhobby.setBounds(50,190,120,20);
        cbBasket.setBounds(300,190,120,20);
        cbBola.setBounds(430,190,120,20);
        cbBuluTangkis.setBounds(170,190,120,20);
        btnConfirm.setBounds(170,250,120,20);
 
    }
    
}
