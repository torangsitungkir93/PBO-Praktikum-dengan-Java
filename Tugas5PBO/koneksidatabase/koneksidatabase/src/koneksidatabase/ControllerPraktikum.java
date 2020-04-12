package koneksidatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerPraktikum {

    ModelPraktikum modelpraktikum;
    ViewPraktikum viewpraktikum;

    public ControllerPraktikum(ModelPraktikum modelpraktikum, ViewPraktikum viewpraktikum) {
        this.modelpraktikum = modelpraktikum;
        this.viewpraktikum = viewpraktikum;

        if (modelpraktikum.getBanyakData() != 0) {
            String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
            viewpraktikum.tabel.setModel((new JTable(dataMahasiswa, viewpraktikum.namaKolom)).getModel());
            listenerTabel();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        viewpraktikum.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                String jk = viewpraktikum.getJK();
                String agama = viewpraktikum.getAgama();

                modelpraktikum.insertMahasiswa(nim, nama, alamat, jk, agama);

                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewpraktikum.btnUbahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                String jk = viewpraktikum.getJK();
                String agama = viewpraktikum.getAgama();

                modelpraktikum.updateMahasiswa(nim, nama, alamat, jk, agama);
                
                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewpraktikum.btnHapusPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                String jk = viewpraktikum.getJK();
                String agama = viewpraktikum.getAgama();

                modelpraktikum.deleteMahasiswa(nim);
                
                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                resetForm();
                listenerTabel();
            }
        });
        
        viewpraktikum.btnBatalPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
                
                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
    }

    public void listenerTabel() {
        String data[][] = modelpraktikum.readMahasiswa();
        String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
        viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
        viewpraktikum.tabel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewpraktikum.tabel.getSelectedRow();
                int col = viewpraktikum.tabel.getSelectedColumn();

                viewpraktikum.tfnim.setText(data[row][0].toString());
                viewpraktikum.tfnim.setEnabled(false);
                viewpraktikum.tfNamaMhs.setText(data[row][1].toString());
                if (data[row][2].toString().equals("Perempuan")) {
                    viewpraktikum.rbWanita.setSelected(true);
                    viewpraktikum.rbPria.setSelected(false);
                } else if (data[row][2].toString().equals("Laki-laki")) {
                    viewpraktikum.rbPria.setSelected(true);
                    viewpraktikum.rbWanita.setSelected(false);
                }
                viewpraktikum.tfAlamatMhs.setText(data[row][3].toString());
                viewpraktikum.cmbAgama.setSelectedItem(data[row][4]);
            }
        });
    }
    
    public void resetForm(){
        viewpraktikum.tfnim.setText("");
        viewpraktikum.tfnim.setEnabled(true);
        viewpraktikum.tfNamaMhs.setText("");
        viewpraktikum.rbPria.setSelected(false);
        viewpraktikum.rbWanita.setSelected(false);
        viewpraktikum.tfAlamatMhs.setText("");
        viewpraktikum.cmbAgama.setSelectedItem("--Pilih--");
    }

}
