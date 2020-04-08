
package koneksidatabase;

import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewPraktikum extends JFrame {
    
    JLabel lNim = new JLabel("Nim : ");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel ("Nama Mahasiswa : ");
    JTextField tfNamaMhs = new JTextField();
    JLabel lAlamatMhs = new JLabel ("Alamat Mahasiswa : ");
    JTextField tfAlamatMhs = new JTextField();
    
    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");
      
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM","Nama","Alamat"}; //membuat kolom dalam array
        
    public ViewPraktikum(){
            
        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

            
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600, 500);
        
        //TABEL
        add(scrollPane);
        scrollPane.setBounds(20, 145, 480, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            
            add(lNim);
        lNim.setBounds(5, 5, 90, 20);
            add(tfnim);
            tfnim.setBounds(110, 5, 120, 20);
        add(lNamaMhs);
        lNamaMhs.setBounds(5, 30, 90, 20);
            add(tfNamaMhs);
            tfNamaMhs.setBounds(110, 30, 120, 20);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(5, 55, 90, 20);
            add(tfAlamatMhs);
            tfAlamatMhs.setBounds(110, 55, 120, 20);
        
        add(btnTambahPanel);
        btnTambahPanel.setBounds(20, 105, 90, 20);
        
        add(btnBatalPanel);
        btnBatalPanel.setBounds(130, 105, 90, 20);
}
        public String getNim(){
            return tfnim.getText();
        }
        
        public String getNamaMhs(){
            return tfNamaMhs.getText();
        }
        
        public String getAlamatMhs(){
            return tfAlamatMhs.getText();
        }
}

