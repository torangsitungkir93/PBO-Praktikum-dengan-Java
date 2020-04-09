package koneksidatabase;

import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewPraktikum extends JFrame {

    JLabel lNim = new JLabel("Nim  ");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel("Nama Mahasiswa ");
    JTextField tfNamaMhs = new JTextField();
    JLabel labelGender = new JLabel("Jenis Kelamin  ");
    JRadioButton rbPria = new JRadioButton("Laki - laki");
    JRadioButton rbWanita = new JRadioButton("Perempuan");
    JLabel lAlamatMhs = new JLabel("Alamat  ");
    JTextField tfAlamatMhs = new JTextField();

    JLabel labelAgama = new JLabel("Agama");
    String[] namaAgama = {"Islam", "Kristen", "Katolik", "Hindu", "Buddha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM", "Nama","Jenis Kelamin","Alamat","Agama"}; //membuat kolom dalam array

    public ViewPraktikum() {

        tableModel = new DefaultTableModel(namaKolom, 0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(655, 650);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);


        //TABEL
        add(scrollPane);
        scrollPane.setBounds(30, 205, 580, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lNim);
        lNim.setBounds(5, 5, 90, 20);
        add(tfnim);
        tfnim.setBounds(110, 5, 170, 20);
        add(lNamaMhs);
        lNamaMhs.setBounds(5, 30, 90, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(110, 30, 170, 20);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(5, 55, 90, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(110, 55, 170, 40);
        // Jenis Kelamin
        add(labelGender);
        labelGender.setBounds(5, 100, 90, 20);
        add(rbPria);
        rbPria.setBounds(106, 100, 80, 20);
        add(rbWanita);
        rbWanita.setBounds(190, 100, 100, 20);
        // Agama
        add(labelAgama);
        labelAgama.setBounds(5, 125, 170, 20);
        add(cmbAgama);
        cmbAgama.setBounds(110, 125, 170, 20);
        
        add(btnTambahPanel);
        btnTambahPanel.setBounds(20, 170, 90, 20);

        add(btnBatalPanel);
        btnBatalPanel.setBounds(130, 170, 90, 20);
    }

    public String getNim() {
        return tfnim.getText();
    }

    public String getNamaMhs() {
        return tfNamaMhs.getText();
    }

    public String getAlamatMhs() {
        return tfAlamatMhs.getText();
    }
    
    public String getAgama(){
        return (String) cmbAgama.getSelectedItem();
    }
    
    public String getJK(){
        if(rbPria.isSelected()){
            return "Laki-laki";
        }
        else{
            return "Perempuan";
        }
    }
    
}
