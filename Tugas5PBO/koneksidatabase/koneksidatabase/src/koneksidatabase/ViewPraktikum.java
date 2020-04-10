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
    JLabel lJudul = new JLabel("Data Mahasiswa");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel("Nama Mahasiswa ");
    JTextField tfNamaMhs = new JTextField();
    JLabel labelGender = new JLabel("Jenis Kelamin  ");
    JRadioButton rbPria = new JRadioButton("Laki - laki");
    JRadioButton rbWanita = new JRadioButton("Perempuan");
    JLabel lAlamatMhs = new JLabel("Alamat  ");
    JTextField tfAlamatMhs = new JTextField();

    JLabel labelAgama = new JLabel("Agama");
    String[] namaAgama = {"--Pilih--", "Islam", "Kristen", "Katolik", "Hindu", "Buddha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");
    JButton btnUbahPanel = new JButton("Ubah");
    JButton btnHapusPanel = new JButton("Hapus");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM", "Nama", "Jenis Kelamin", "Alamat", "Agama"}; //membuat kolom dalam array

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
        scrollPane.setBounds(30, 235, 580, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lJudul);
        lJudul.setBounds(95, 5, 200, 20);
        lJudul.setFont(new java.awt.Font("Times New Roman", 0, 25));
        add(lNim);
        lNim.setBounds(35, 35, 90, 20);
        add(tfnim);
        tfnim.setBounds(140, 35, 170, 20);
        add(lNamaMhs);
        lNamaMhs.setBounds(35, 60, 90, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(140, 60, 170, 20);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(35, 85, 90, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(140, 85, 170, 40);
        // Jenis Kelamin
        add(labelGender);
        labelGender.setBounds(35, 130, 90, 20);
        add(rbPria);
        rbPria.setBounds(136, 130, 80, 20);
        add(rbWanita);
        rbWanita.setBounds(220, 130, 100, 20);
        // Agama
        add(labelAgama);
        labelAgama.setBounds(35, 155, 170, 20);
        add(cmbAgama);
        cmbAgama.setBounds(140, 155, 170, 20);
        // Kumpulan Tombol
        add(btnTambahPanel);
        btnTambahPanel.setBounds(30, 200, 90, 25);
        add(btnUbahPanel);
        btnUbahPanel.setBounds(130, 200, 90, 25);
        add(btnHapusPanel);
        btnHapusPanel.setBounds(230, 200, 90, 25);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(330, 200, 90, 25);
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

    public String getAgama() {
        if (cmbAgama.getSelectedItem().equals("--Pilih--")) {
            return "";
        } else {
            return (String) cmbAgama.getSelectedItem();
        }
    }

    public String getJK() {
        if (rbPria.isSelected()) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

}
