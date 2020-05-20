import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewPinjam extends JFrame {

    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox = new JPanel();

    JLabel lJudul, lIdAngg, lNamaAngg, lIdBuku, lJudulBuku;
    JTextField tfIdAngg, tfNamaAngg, tfIdBuku, tfJudulBuku;

    JButton btnHome, btnAdd, btnCancel,btnTampil;

    GroupLayout gpPanelBack, gpPanelBox;

    public ViewPinjam() {
        setTitle("Pinjam Buku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(false);
        setSize(400, 500);
        setLocationRelativeTo(null);

        lJudul = new JLabel("Pinjam Buku");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 25));
        lJudul.setForeground(Color.BLACK);
        
        lIdAngg = new JLabel("ID Anggota");
        lIdAngg.setFont(new Font("COURIER NEW", Font.PLAIN, 18));
        lNamaAngg = new JLabel("Nama Anggota");
        lNamaAngg.setFont(new Font("COURIER NEW", Font.PLAIN, 18));
        lIdBuku = new JLabel("ID Buku");
        lIdBuku.setFont(new Font("COURIER NEW", Font.PLAIN, 18));
        lJudulBuku = new JLabel("Judul Buku");
        lJudulBuku.setFont(new Font("COURIER NEW", Font.PLAIN, 18));
        
        tfIdAngg = new JTextField();
        tfNamaAngg = new JTextField();
        tfIdBuku = new JTextField();
        tfJudulBuku = new JTextField();

        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/iconHome1.png"));
        ImageIcon addIcon = new ImageIcon(getClass().getResource("/images/iconAdd.png"));
        ImageIcon cancelIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));

        btnHome = new JButton(homeIcon);
        btnAdd = new JButton("Tambah", addIcon);
        btnCancel = new JButton("Batal", cancelIcon);
        btnTampil = new JButton("Tampil");

        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelBox = new GroupLayout(pPanelBox);
        pPanelBox.setLayout(gpPanelBox);

        add(pPanelBack);
        pPanelBack.add(pPanelBox);

        pPanelBack.setBounds(0, 0, 400, 500);
        pPanelBack.setBackground(Color.BLUE);
        pPanelBox.setBounds(15, 15, 350, 420);
        pPanelBox.setBackground(Color.WHITE);

        pPanelBox.add(lJudul);
        pPanelBox.add(lIdAngg);
        pPanelBox.add(lNamaAngg);
        pPanelBox.add(lIdBuku);
        pPanelBox.add(lJudulBuku);
        pPanelBox.add(tfIdAngg);
        pPanelBox.add(tfNamaAngg);
        pPanelBox.add(tfIdBuku);
        pPanelBox.add(tfJudulBuku);
        pPanelBox.add(btnHome);
        pPanelBox.add(btnAdd);
        pPanelBox.add(btnCancel);
        pPanelBox.add(btnTampil);

        lJudul.setBounds(95, 30, 300, 40);

        lIdAngg.setBounds(13, 100, 180, 40);
        lNamaAngg.setBounds(13, 140, 180, 40);
        lIdBuku.setBounds(13, 180, 180, 40);
        lJudulBuku.setBounds(13, 220, 180, 40);
        
        tfIdAngg.setBounds(153, 105, 180, 30);
        tfNamaAngg.setBounds(153, 145, 180, 30);
        tfIdBuku.setBounds(153, 185, 180, 30);
        tfJudulBuku.setBounds(153, 225, 180, 30);

        btnHome.setBounds(10, 10, 50, 30);
        btnAdd.setBounds(50, 320, 120, 30);
        btnCancel.setBounds(180, 320, 120, 30);
        btnTampil.setBounds(110, 370, 120, 30);
    }

    public String getIdAnggota() {
        return tfIdAngg.getText();
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
        new ViewPinjam();
    }
}
