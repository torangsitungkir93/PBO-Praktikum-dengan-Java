package dataKasir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import menuAdmin.*;
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
public class ControllerDataKasir {

    String nomor;

    ModelDataKasir modelDataKasir;
    ViewDataKasir viewDataKasir;

    public ControllerDataKasir(ModelDataKasir ma, ViewDataKasir vKasir) {
        this.modelDataKasir = ma;
        this.viewDataKasir = vKasir;
        vKasir.setVisible(true);

        if (ma.getBanyakData() != 0) {
            String dataNamaSuplier[][] = ma.readKasir();
            vKasir.tabel.setModel((new JTable(dataNamaSuplier, vKasir.kolom)).getModel());
            listenerViewData();
            listenerHome();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        // Tombol di Menu Home;
        viewDataKasir.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataKasir.setVisible(false);
                new MVCDashboardAdmin();
            }
        });
//
        viewDataKasir.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = viewDataKasir.getUsername();
                String nama = viewDataKasir.getNama();
                String no_hp = viewDataKasir.getNoTelp();
                String alamat = viewDataKasir.getAlamat();
                String gender = viewDataKasir.getJK();

                modelDataKasir.updateKasir(id, nama,gender, no_hp, alamat);
                resetFormKasir();
                listenerViewData();
                listenerHome();
            }
        });

        viewDataKasir.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = viewDataKasir.getUsername();
                String nama = viewDataKasir.getNama();
                String no_hp = viewDataKasir.getNoTelp();
                String alamat = viewDataKasir.getAlamat();
                String gender = viewDataKasir.getJK();

                modelDataKasir.insertDataKasir(id, nama,gender, no_hp, alamat);
                resetFormKasir();
                listenerViewData();
                listenerHome();
            }
        });

        viewDataKasir.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resetFormKasir();
                listenerHome();
                listenerViewData();
            }
        });

        viewDataKasir.btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = viewDataKasir.getUsername();

                modelDataKasir.deleteKasir(id);
                listenerViewData();
                listenerHome();
            }
        });

        viewDataKasir.btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = viewDataKasir.getSearch();

                listenerViewData();
                String dataNamaSuplier[][] = modelDataKasir.searchKasir(cari);
                vKasir.tabel.setModel((new JTable(dataNamaSuplier, vKasir.kolom)).getModel());
            }
        });
//
    }
//
    public void resetFormKasir() {
        viewDataKasir.tfUsername.setText("");
        viewDataKasir.tfUsername.setEditable(true);
        viewDataKasir.tfNama.setText("");
        viewDataKasir.tfNoTelp.setText("");
        viewDataKasir.tfAlamat.setText("");
        viewDataKasir.tfSearch.setText("");
    }

    public void listenerHome() {
        String data[][] = modelDataKasir.readKasir();
        viewDataKasir.tabel.setModel(new JTable(data, viewDataKasir.kolom).getModel());
    }

    public void listenerViewData() {
        String data[][] = modelDataKasir.readKasir();
        viewDataKasir.btnCancel.setEnabled(false);
        viewDataKasir.btnDel.setEnabled(false);
        viewDataKasir.btnEdit.setEnabled(false);

        viewDataKasir.tabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewDataKasir.tabel.getSelectedRow();
                int col = viewDataKasir.tabel.getSelectedColumn();

                nomor = data[row][1];

//                String data[][] = modelDataSuplier.readSatuSuplier(nomor);
                viewDataKasir.tfUsername.setText(data[row][0].toString());
                viewDataKasir.tfUsername.setForeground(Color.red);
                viewDataKasir.tfUsername.setEditable(false);
                viewDataKasir.tfNama.setText(data[row][1].toString());
                
                if(data[row][2].equals("L")){
                    viewDataKasir.r1.setSelected(true);
                }else if(data[row][2].equals("P")){
                    viewDataKasir.r2.setSelected(true);
                }
                
                viewDataKasir.tfNoTelp.setText(data[row][3].toString());
                viewDataKasir.tfAlamat.setText(data[row][4].toString());

                viewDataKasir.btnEdit.setEnabled(true);
                viewDataKasir.btnDel.setEnabled(true);
                viewDataKasir.btnCancel.setEnabled(true);

            }
        });

    }
}
