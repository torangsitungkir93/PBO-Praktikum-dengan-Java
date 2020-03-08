
import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class swing extends JFrame {

    JLabel labelJudul = new JLabel("Form Peminatan Kelompok Study");
    JTextField fieldNama = new JTextField(16);
    JLabel labelNama = new JLabel("Nama");
    JTextField fieldNim = new JTextField(9);
    JLabel labelNim = new JLabel("NIM");
    JTextField fieldAlamat = new JTextField(255);
    JLabel labelAlamat = new JLabel("Alamat");
    JLabel labelGender = new JLabel("Jenis kelamin");
    JRadioButton rbPria = new JRadioButton("Laki - laki");
    JRadioButton rbWanita = new JRadioButton("Perempuan");

    JLabel labelAgama = new JLabel("Agama");
    String[] namaAgama = {"Islam", "Kristen", "Katolik", "Hindu", "Buddha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel labelKelStudy = new JLabel("Kelompok Study");
    JCheckBox cbLinux = new JCheckBox("Linux");
    JCheckBox cbITC = new JCheckBox("ITC");
    JCheckBox cbMultimedia = new JCheckBox("Multimedia");
    JCheckBox cbRobotik = new JCheckBox("Robotik");

    JButton btnConfirm = new JButton("Confirm");
    JButton btnCancel = new JButton("Cancel");

    public swing() {
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(800, 600);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        add(labelJudul);
        add(labelNim);
        add(fieldNim);
        add(labelNama);
        add(fieldNama);
        add(labelAgama);
        add(cmbAgama);
        add(labelAlamat);
        add(fieldAlamat);
        add(labelGender);
        add(rbPria);
        add(rbWanita);
        add(labelKelStudy);
        add(cbLinux);
        add(cbITC);
        add(cbMultimedia);
        add(cbRobotik);
        add(btnConfirm);
        add(btnCancel);

        labelJudul.setBounds(250, 25, 400, 30);
        labelJudul.setFont(new java.awt.Font("Times New Roman", 0, 20));
        labelNim.setBounds(250, 100, 120, 20);
        fieldNim.setBounds(370, 100, 150, 20);
        labelNama.setBounds(250, 130, 120, 20);
        fieldNama.setBounds(370, 130, 150, 20);
        labelAgama.setBounds(250, 160, 150, 20);
        cmbAgama.setBounds(370, 160, 150, 20);
        labelAlamat.setBounds(250, 190, 120, 20);
        fieldAlamat.setBounds(370, 190, 150, 80);
        labelGender.setBounds(250, 270, 120, 20);
        rbPria.setBounds(370, 270, 120, 20);
        rbWanita.setBounds(500, 270, 120, 20);
        labelKelStudy.setBounds(250, 290, 120, 20);
        cbLinux.setBounds(370, 290, 120, 20);
        cbITC.setBounds(500, 290, 120, 20);
        cbMultimedia.setBounds(370, 310, 120, 20);
        cbRobotik.setBounds(500, 310, 120, 20);
        btnConfirm.setBounds(250, 360, 120, 20);
        btnCancel.setBounds(420, 360, 120, 20);
    }

}
