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

//        if (ma.getBanyakData() != 0) {
//            String dataNamaSuplier[][] = ma.readSuplier();
//            vSuplier.tabel.setModel((new JTable(dataNamaSuplier, vSuplier.kolom)).getModel());
//            listenerViewData();
//            listenerHome();
//        } else {
//            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
//        }
//
//        // Tombol di Menu Home;
//        viewDataKasir.btnReturn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                viewDataKasir.setVisible(false);
//                new MVCDashboardAdmin();
//            }
//        });
//
//        viewDataSuplier.btnEdit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int id = viewDataSuplier.getIdInt();
//                String nama = viewDataSuplier.getNama();
//                String no_hp = viewDataSuplier.getNOHP();
//                String alamat = viewDataSuplier.getAlamat();
//
//                modelDataSuplier.updateSuplier(id, nama, no_hp, alamat);
//                resetFormSuplier();
//                listenerViewData();
//                listenerHome();
//            }
//        });
//
//        viewDataSuplier.btnAdd.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String nama = viewDataSuplier.getNama();
//                String no_hp = viewDataSuplier.getNOHP();
//                String alamat = viewDataSuplier.getAlamat();
//
//                modelDataSuplier.insertDataSuplier(nama, no_hp, alamat);
//                resetFormSuplier();
//                listenerViewData();
//                listenerHome();
//            }
//        });
//
//        viewDataSuplier.btnCancel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                resetFormSuplier();
//                listenerHome();
//                listenerViewData();
//            }
//        });
//
//        viewDataSuplier.btnDel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int id = viewDataSuplier.getIdInt();
//
//                modelDataSuplier.deleteSuplier(id);
//                listenerViewData();
//                listenerHome();
//            }
//        });
//
//        viewDataSuplier.btnSearch.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String cari = viewDataSuplier.getSearch();
//
//                listenerViewData();
//                String dataNamaSuplier[][] = modelDataSuplier.searchSuplier(cari);
//                vSuplier.tabel.setModel((new JTable(dataNamaSuplier, vSuplier.kolom)).getModel());
//
//            }
//        });
//
//    }
//
//    public void resetFormSuplier() {
//        viewDataSuplier.tfId.setText("");
//        viewDataSuplier.tfNama.setText("");
//        viewDataSuplier.tfNoTelp.setText("");
//        viewDataSuplier.tfAlamat.setText("");
//        viewDataSuplier.tfSearch.setText("");
//    }
//
//    public void listenerHome() {
//        String data[][] = modelDataSuplier.readSuplier();
//        viewDataSuplier.tabel.setModel(new JTable(data, viewDataSuplier.kolom).getModel());
//    }
//
//    public void listenerViewData() {
//        String data[][] = modelDataSuplier.readSuplier();
//        viewDataSuplier.tfId.setEditable(false);
//        viewDataSuplier.tfId.setForeground(Color.red);
//        viewDataSuplier.btnCancel.setEnabled(false);
//        viewDataSuplier.btnDel.setEnabled(false);
//        viewDataSuplier.btnEdit.setEnabled(false);
//
//        viewDataSuplier.tabel.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                super.mousePressed(e);
//                int row = viewDataSuplier.tabel.getSelectedRow();
//                int col = viewDataSuplier.tabel.getSelectedColumn();
//
//                nomor = data[row][1];
//
////                String data[][] = modelDataSuplier.readSatuSuplier(nomor);
//                viewDataSuplier.tfId.setText(data[row][0].toString());
//                viewDataSuplier.tfNama.setText(data[row][1].toString());
//                viewDataSuplier.tfNoTelp.setText(data[row][2].toString());
//                viewDataSuplier.tfAlamat.setText(data[row][3].toString());
//
//                viewDataSuplier.btnEdit.setEnabled(true);
//                viewDataSuplier.btnDel.setEnabled(true);
//                viewDataSuplier.btnCancel.setEnabled(true);
//
//            }
//        });

    }
}
