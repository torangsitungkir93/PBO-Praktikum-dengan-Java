import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class viewMain extends JFrame{
    Font fjudul;
    JLabel  ljudul,lcopyright;
    JButton btnbuatKontak,btnlihatKontak,btnexit;
    
    public viewMain () { 
        
           setLayout(null);
           setVisible(true);
           setSize(300,350);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setBackground(new java.awt.Color(204,204,204));
           setTitle("MENU UTAMA");
           
           fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
           ljudul = new JLabel("KONTAK HP");
           ljudul.setFont(fjudul);
           lcopyright = new JLabel("@Copyright 2020");
           btnbuatKontak = new JButton("Buat Kontak");
           btnlihatKontak = new JButton("Lihat Kontak");
           btnexit = new JButton("Exit");
           
           add(ljudul);
           add(lcopyright);
           add(btnbuatKontak);
           add(btnexit);
           add(btnlihatKontak);
           
           ljudul.setBounds(80,50,160,20);
           lcopyright.setBounds(10,290,150,20);
           btnbuatKontak.setBounds(50,100,190,30);
           btnlihatKontak.setBounds(50,150,190,30);
           btnexit.setBounds(50,200,190,30);
    }
    
}
