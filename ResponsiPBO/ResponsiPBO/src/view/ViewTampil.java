
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ViewTampil extends JFrame {

    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelTabel = new JPanel();
    JPanel pPanelForm = new JPanel();

    JLabel lJudul, lIdAngg, lNamaAngg, lIdBuku, lJudulBuku, lPeminjam;
    JTextField tfSearch, tfIdAngg, tfNamaAngg, tfIdBuku, tfJudulBuku, tfIdPeminjam;
    JButton btnHome, btnSearch, btnEdit, btnDel, btnCancel;

    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"ID Pinjam", "ID Anggota", "Nama Anggota", "ID Buku", "Judul Buku"};

    GroupLayout gpPanelTop, gpPanelBack, gpPanelTabel, gpPanelLine, gpPanelForm;

    public ViewTampil() {
        setTitle("Data Pinjam");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(false);
        setSize(800, 500);
        setLocationRelativeTo(null);

        tabelModel = new DefaultTableModel(kolom, 0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);

        lPeminjam = new JLabel("Id Peminjam");
        lIdAngg = new JLabel("Id Anggota");
        lNamaAngg = new JLabel("Nama Anggota");
        lIdBuku = new JLabel("Id Buku");
        lJudulBuku = new JLabel("Judul Buku");

        lJudul = new JLabel("DATA PINJAM");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);

        tfIdPeminjam = new JTextField();
        tfSearch = new JTextField();
        tfIdAngg = new JTextField();
        tfNamaAngg = new JTextField();
        tfIdBuku = new JTextField();
        tfJudulBuku = new JTextField();

        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/iconHome1.png"));
        ImageIcon searchIcon = new ImageIcon(getClass().getResource("/images/iconSearch.png"));
        ImageIcon editIcon = new ImageIcon(getClass().getResource("/images/iconEdit.png"));
        ImageIcon delIcon = new ImageIcon(getClass().getResource("/images/iconDel.png"));
        ImageIcon cancelIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));

        btnEdit = new JButton("Edit", editIcon);
        btnDel = new JButton("Hapus", delIcon);
        btnCancel = new JButton("Batal", cancelIcon);
        btnHome = new JButton(homeIcon);
        btnSearch = new JButton("CARI BERDASARKAN NAMA", searchIcon);

        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        gpPanelTabel = new GroupLayout(pPanelTabel);
        pPanelTabel.setLayout(gpPanelTabel);
        gpPanelForm = new GroupLayout(pPanelForm);
        pPanelForm.setLayout(gpPanelForm);

        add(pPanelTop);
        add(pPanelLine);
        add(pPanelBack);
        pPanelBack.add(pPanelTabel);
        pPanelBack.add(pPanelForm);
        pPanelTabel.add(scrollPane);
        pPanelTabel.add(tfSearch);
        pPanelTabel.add(btnSearch);

        pPanelTop.setBounds(0, 0, 800, 80);
        pPanelTop.setBackground(Color.GRAY);
        pPanelLine.setBounds(0, 80, 800, 5);
        pPanelLine.setBackground(Color.DARK_GRAY);
        pPanelBack.setBounds(0, 85, 800, 400);
        pPanelBack.setBackground(Color.BLUE);

        pPanelTabel.setBounds(270, 10, 500, 345);
        pPanelTabel.setBackground(Color.WHITE);
        pPanelForm.setBounds(10, 10, 250, 345);
        pPanelForm.setBackground(Color.WHITE);

        scrollPane.setBounds(10, 30, 480, 275);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pPanelTop.add(lJudul);
        pPanelTop.add(btnHome);
        pPanelForm.add(btnEdit);
        pPanelForm.add(btnDel);
        pPanelForm.add(btnCancel);
        pPanelForm.add(lIdAngg);
        pPanelForm.add(lPeminjam);
        pPanelForm.add(lNamaAngg);
        pPanelForm.add(lIdBuku);
        pPanelForm.add(lJudulBuku);
        pPanelForm.add(tfIdAngg);
        pPanelForm.add(tfNamaAngg);
        pPanelForm.add(tfIdBuku);
        pPanelForm.add(tfJudulBuku);
        pPanelForm.add(tfIdPeminjam);
        
        lPeminjam.setBounds(10, 30, 100, 20);
        lIdAngg.setBounds(10, 60, 100, 20);
        lNamaAngg.setBounds(10, 90, 100, 20);
        lIdBuku.setBounds(10, 120, 100, 20);
        lJudulBuku.setBounds(10, 150, 100, 20);

        tfIdPeminjam.setBounds(105, 30, 130, 20);
        tfIdPeminjam.setEditable(false);
        tfIdAngg.setBounds(105, 60, 130, 20);
        tfNamaAngg.setBounds(105, 90, 130, 20);
        tfIdBuku.setBounds(105, 120, 130, 20);
        tfJudulBuku.setBounds(105, 150, 130, 20);

        lJudul.setBounds(300, 20, 370, 40);
        btnHome.setBounds(20, 20, 50, 40);

//        tfSearch.setBounds(240, 10, 250, 30);
//        btnSearch.setBounds(10, 10, 220, 30);
        btnEdit.setBounds(20, 230, 100, 40);
        btnDel.setBounds(130, 230, 100, 40);
        btnCancel.setBounds(70, 280, 100, 40);

    }

    public String getSearch() {
        return tfSearch.getText();
    }

    public String getIdAnggota() {
        return tfIdAngg.getText();
    }

    public String getIdPeminjam() {
        return tfIdPeminjam.getText();
    }

    public String getNama() {
        return tfNamaAngg.getText();
    }

    public String getIdBuku() {
        return tfIdBuku.getText();
    }

    public String getJudul() {
        return tfJudulBuku.getText();
    }

    public static void main(String[] args) {
        new ViewTampil();
    }
}
