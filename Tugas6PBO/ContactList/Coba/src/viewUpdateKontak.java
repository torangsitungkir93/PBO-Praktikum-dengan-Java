import javax.swing.*;
import java.awt.*;

public class viewUpdateKontak extends JFrame {
    Font fjudul ;
    JLabel ljudul, lnama, lnomor_hp, lumur, lemail, lsamadengan1,lsamadengan2;
    JTextField tfnama, tfnomor_hp , tfumur , tfemail; 
    JButton btnedit, btnkembali ; 
    
    public viewUpdateKontak () { 
        fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        ljudul = new JLabel("EDIT KONTAK"); ljudul.setFont(fjudul);
        lsamadengan1 = new JLabel("=================================================================");
        lsamadengan2 = new JLabel("=================================================================");
        lnama = new JLabel("Nama");
        lnomor_hp = new JLabel("Nomor HP");
        lumur = new JLabel("Umur");
        lemail = new JLabel("Email");
        tfnama = new JTextField();
        tfnomor_hp = new JTextField();
        tfumur = new JTextField();
        tfemail = new JTextField();
        btnedit = new JButton("Edit");
        btnkembali = new JButton("Kembali");
        
        setTitle("Data Barang");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(360,360);
        setLocationRelativeTo(null);
        
        add(lsamadengan1);
        lsamadengan1.setBounds(0,40,360,5);
        add(lsamadengan2);
        lsamadengan2.setBounds(0,80,360,5);
        add(ljudul);
        ljudul.setBounds(100,50,200,20);
        add(lnama);
        lnama.setBounds(20,110,60,20);
        add(tfnama);
        tfnama.setBounds(100,110,200,20);
        add(lnomor_hp);
        lnomor_hp.setBounds(20,140,60,20);
        add(tfnomor_hp);
        tfnomor_hp.setBounds(100,140,200,20);
        add(lumur);
        lumur.setBounds(20,170,60,20);
        add(tfumur);
        tfumur.setBounds(100,170,200,20);
        add(lemail);
        lemail.setBounds(20,200,60,20);
        add(tfemail);
        tfemail.setBounds(100,200,200,20);
        
        add(btnkembali);
        btnkembali.setBounds(80,250,100,30);
        add(btnedit);
        btnedit.setBounds(180,250,100,30);
        
        
    }
}
