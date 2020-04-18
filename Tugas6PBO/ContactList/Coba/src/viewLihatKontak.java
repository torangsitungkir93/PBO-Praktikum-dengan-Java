
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class viewLihatKontak extends JFrame{
    

    JPanel ppanel= new JPanel();
    JPanel ppaneldalam = new JPanel();
    JLabel ljudul, lmenupilihan,lnama,lno_hp,lumur,lemail,lnamaisi,lno_hpisi,lumurisi,lemailisi,lid;
    JTextField tfsearch;
    Font fjudul,fmenupilihan;
    JTable tabel ;
    JButton btntambah , btnkembali, btnhapus, btnupdate,btnrefresh,btnsearch;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane; 
    Object namaKolom [] =  {"nama","no_hp","umur","email",""} ; 
    GroupLayout gppanel,gppaneldalam;
    
    public viewLihatKontak () {
            fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
            fmenupilihan = new Font("Tahoma", Font.BOLD + Font.CENTER_BASELINE, 17);
            ljudul = new JLabel("LIST KONTAK"); ljudul.setFont(fjudul);
            lnama = new JLabel("Nama    :");
            lumur = new JLabel("Umur    :");
            lemail = new JLabel("Email    :");
            lno_hp = new JLabel("No_HP  :");
            lid = new JLabel();
            lnamaisi = new JLabel();
            lumurisi = new JLabel();
            lemailisi = new JLabel();
            lno_hpisi = new JLabel();
            tabelModel = new DefaultTableModel(namaKolom,0);
            tabel = new JTable(tabelModel);    
            scrollPane = new JScrollPane(tabel);
            btnsearch = new JButton("Cari");
            tfsearch = new JTextField();
            btntambah = new JButton("Tambah");
            btnkembali = new JButton("Kembali"); 
            btnhapus = new JButton("Hapus"); 
            btnupdate = new JButton("Update");
            btnrefresh = new JButton("Refresh");
            ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            gppanel = new GroupLayout(ppanel);
            ppanel.setLayout(gppanel);
            ppaneldalam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detailed", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
            gppaneldalam = new GroupLayout(ppaneldalam);
            ppaneldalam.setLayout(gppaneldalam);
            lmenupilihan = new JLabel("MENU PILIHAN"); lmenupilihan.setFont(fmenupilihan);
            
            setTitle("Data Barang");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(false);
            setLayout(null);
            setSize(900,600);
            setLocationRelativeTo(null);
            
            add(ppanel);
            ppanel.add(lmenupilihan);
            ppanel.add(btntambah);
            ppanel.add(btnkembali);
            ppanel.add(btnhapus);
            ppanel.add(btnupdate);
            ppanel.add(btnrefresh);
            ppanel.add(ppaneldalam);
            ppaneldalam.add(lnama);
            ppaneldalam.add(lumur);
            ppaneldalam.add(lemail);
            ppaneldalam.add(lno_hp);
            ppaneldalam.add(lnamaisi);
            ppaneldalam.add(lumurisi);
            ppaneldalam.add(lno_hpisi);
            ppaneldalam.add(lemailisi);
            add(ljudul);
            add(scrollPane);
            add(btnsearch);
            add(tfsearch);
      
            ppanel.setBounds(540,50,330,480);
            ppaneldalam.setBounds(30,70,275,200);
            lmenupilihan.setBounds(115,30,170,20);
            btntambah.setBounds(170,400,100,30);
            btnkembali.setBounds(70,400,100,30);
            btnhapus.setBounds(170,340,100,30);
            btnupdate.setBounds(70,340,100,30);
            btnrefresh.setBounds(120,280,100,20);
            ljudul.setBounds(220,20,160,20);
            
            scrollPane.setBounds(50,100,470,430);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            tfsearch.setBounds(50,60,370,20);
            btnsearch.setBounds(420,60,100,20);
            
            lnama.setBounds(20,50,80,20);
            lno_hp.setBounds(20,80,80,20);
            lumur.setBounds(20,110,80,20);
            lemail.setBounds(20,140,80,20);
            lnamaisi.setBounds(80,50,200,20);
            lno_hpisi.setBounds(80,80,200,20);
            lumurisi.setBounds(80,110,200,20);
            lemailisi.setBounds(80,140,200,20);
            btnhapus.setEnabled(false);
            btnupdate.setEnabled(false);
            
            
    }
}
