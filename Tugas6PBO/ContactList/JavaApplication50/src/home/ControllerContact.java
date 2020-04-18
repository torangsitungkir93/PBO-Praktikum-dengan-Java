/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerContact {

    String nomor;

    ModelContact modelKontak;
    ViewHome viewHome;
    ViewData viewData;
    ViewTambah viewTambah;
    ViewEdit viewEdit;
    ShowAllData viewShowAllData;

    public ControllerContact(ModelContact mc, ViewHome vh, ViewData vd, ViewTambah vt, ViewEdit ve, ShowAllData vsad) {
        this.modelKontak = mc;
        this.viewHome = vh;
        this.viewData = vd;
        this.viewTambah = vt;
        this.viewEdit = ve;
        this.viewShowAllData = vsad;

        if (mc.getBanyakData() != 0) {
            String dataNamaKontak[][] = mc.readNamaKontak();
            vh.tabel.setModel((new JTable(dataNamaKontak, vh.namaKolom)).getModel());
            listenerViewData();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        // Tombol di Menu Home
        viewHome.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTambah.setVisible(true);
                viewHome.setVisible(false);

            }
        });

        viewHome.btnUbahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEdit.setVisible(true);
                setFormEdit(nomor);
                viewHome.setVisible(false);
            }
        });

        viewHome.btnLihatPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewData.setVisible(true);
                viewHome.setVisible(false);
                setFormView(nomor);
            }
        });

        viewHome.btnTampilPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewShowAllData.setVisible(true);
                viewHome.setVisible(false);
                if (mc.getBanyakData() != 0) {
                    String dataKontak[][] = mc.readKontak();
                    vsad.tabel.setModel((new JTable(dataKontak, vsad.namaKolom)).getModel());

                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Ada");
                }
            }
        });

        // Untuk Tombol Kembali kemenu utama
        viewEdit.btnHomePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEdit.setVisible(false);
                viewHome.setVisible(true);
                listenerViewData();
            }
        });
        viewTambah.btnHomePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTambah.setVisible(false);
                viewHome.setVisible(true);
                listenerViewData();
            }
        });
        viewData.btnHomePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewData.setVisible(false);
                viewHome.setVisible(true);
                listenerViewData();
            }
        });
        viewShowAllData.btnHomePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewShowAllData.setVisible(false);
                viewHome.setVisible(true);
                listenerViewData();
            }
        });

        // Untuk Form Tambah
        viewTambah.btnSimpanPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewTambah.getNama();
                String hp = viewTambah.getNoHP();
                String umur = viewTambah.getUmur();
                String email = viewTambah.getEmail();
                String note = viewTambah.getNoHP();

                modelKontak.insertKontak(nama, hp, umur, email, note);
                resetFormTambah();
                listenerHome();
            }
        });

        viewTambah.btnResetPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFormTambah();
            }
        });

        // Untuk Form Edit
        viewEdit.btnSimpanPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewEdit.getNama();
                String hp = viewEdit.getNoHP();
                String umur = viewEdit.getUmur();
                String email = viewEdit.getEmail();
                String note = viewEdit.getNoHP();

                modelKontak.updateKontak(nama, hp, umur, email, note);
                resetFormEdit();
                listenerHome();
            }
        });
        
         viewHome.btnHapusPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus Kontak " + nomor + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                
                if (input == 0) {
                    modelKontak.deleteKontak(nomor);
                    String dataKontak[][] = modelKontak.readKontak();
                    viewHome.tabel.setModel(new JTable(dataKontak, viewHome.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
       

        viewTambah.btnResetPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFormEdit();
            }
        });

    }

    public void resetFormTambah() {
        viewTambah.tNama.setText("");
        viewTambah.tNohp.setText("");
        viewTambah.tUmur.setText("");
        viewTambah.tEmail.setText("");
        viewTambah.tNote.setText("");
    }

    public void resetFormEdit() {
        viewEdit.tNama.setText("");
        viewEdit.tNohp.setText("");
        viewEdit.tUmur.setText("");
        viewEdit.tEmail.setText("");
        viewEdit.tNote.setText("");
    }

    public void listenerHome() {
        String data[][] = modelKontak.readKontak();
        viewHome.tabel.setModel(new JTable(data, viewHome.namaKolom).getModel());
    }

    public void listenerViewData() {
        String data[][] = modelKontak.readKontak();

        viewHome.btnUbahPanel.setEnabled(false);
        viewHome.btnHapusPanel.setEnabled(false);
        viewHome.btnLihatPanel.setEnabled(false);

        viewHome.tabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewHome.tabel.getSelectedRow();
                int col = viewHome.tabel.getSelectedColumn();

                nomor = data[row][1];

                viewHome.btnUbahPanel.setEnabled(true);
                viewHome.btnHapusPanel.setEnabled(true);
                viewHome.btnLihatPanel.setEnabled(true);

            }
        });
    }

   public void setFormEdit(String hp) {
        String data[][] = modelKontak.readSatuKontak(hp);
        viewEdit.tNama.setText(data[0][0].toString());
        viewEdit.tNohp.setText(data[0][1].toString());
        viewEdit.tUmur.setText(data[0][2].toString());
        viewEdit.tEmail.setText(data[0][3].toString());
        viewEdit.tNote.setText(data[0][4].toString());
    }
   public void setFormView(String hp) {
        String data[][] = modelKontak.readSatuKontak(hp);
        viewData.tNama.setText(data[0][0].toString());
        viewData.tNohp.setText(data[0][1].toString());
        viewData.tUmur.setText(data[0][2].toString());
        viewData.tEmail.setText(data[0][3].toString());
        viewData.tNote.setText(data[0][4].toString());
    }

}
