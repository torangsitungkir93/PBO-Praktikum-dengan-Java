
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class viewBuatKontak extends JFrame {
    Font fjudul,fkata;
    JLabel ljudul,lnama, lnomor_hp,lumur,lemail,lsamadengan1,lsamadengan2,lsamadengan3;
    JTextField tfnama, tfnomor_hp, tfumur, tfemail ; 
    JButton btntambah,btnbatal;
    
       public viewBuatKontak () {
           setSize(300,375);
           setVisible(false);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLayout(null);
           setLocationRelativeTo(null);
           setTitle("TAMBAH KONTAK");
           
           fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
           fkata= new Font("Italic", Font.ITALIC,14);
           ljudul = new JLabel("BUAT KONTAK");  ljudul.setFont(fjudul);
           lsamadengan1 = new JLabel("==========================================");
           lsamadengan2 = new JLabel("==========================================");
           lsamadengan3 = new JLabel("==========================================");
           lnama = new JLabel("Nama"); lnama.setFont(fkata);
           lnomor_hp = new JLabel("Nomor HP"); lnomor_hp.setFont(fkata);
           lumur = new JLabel("Umur"); lumur.setFont(fkata);
           lemail = new JLabel("Email"); lemail.setFont(fkata);
           tfnama = new JTextField();
           tfnomor_hp = new JTextField();
           tfumur = new JTextField();
           tfemail = new JTextField();
           btnbatal = new JButton("Batal");
           btntambah = new JButton("Buat");
           
           add(ljudul);
           add(lsamadengan1);
           add(lsamadengan2);
           add(lsamadengan3);
           add(lnama);
           add(lnomor_hp);
           add(lumur);
           add(lemail);
           add(tfnama);
           add(tfnomor_hp);
           add(tfumur);
           add(tfemail);
           add(btnbatal);
           add(btntambah);
           
           lsamadengan1.setBounds(0,25,300,5);
           lsamadengan2.setBounds(0,60,300,5);
           ljudul.setBounds(65,30,200,30);
           lnama.setBounds(30,100,80,20);
           tfnama.setBounds(100,100,150,20);
           lnomor_hp.setBounds(30,130,80,20);
           tfnomor_hp.setBounds(100,130,150,20);
           lumur.setBounds(30,160,80,20);
           tfumur.setBounds(100,160,150,20);
           lemail.setBounds(30,190,80,20);
           tfemail.setBounds(100,190,150,20);
           btntambah.setBounds(150,230,100,30);
           btnbatal.setBounds(30,230,100,30);
           lsamadengan3.setBounds(0,280,300,5);
           
           
           
       }
}
