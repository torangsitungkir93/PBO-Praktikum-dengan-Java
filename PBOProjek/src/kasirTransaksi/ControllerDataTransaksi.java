package kasirTransaksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import menuKasir.MVCDashboardKasir;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerDataTransaksi {

    String nomor;

    ModelDataTransaksi modelDataTransaksi;
    ViewKasirDataTransaksi viewDataTransaksi;

    public ControllerDataTransaksi(ModelDataTransaksi ma, ViewKasirDataTransaksi vTransaksi) {
        this.modelDataTransaksi = ma;
        this.viewDataTransaksi = vTransaksi;
        viewDataTransaksi.setVisible(true);
        this.viewDataTransaksi.tfTanggal.setText(getTanggal());
        this.viewDataTransaksi.tfTanggal.setForeground(Color.red);
        this.viewDataTransaksi.tfTanggal.setEditable(false);
        listenerAwal();

        // Tombol di Menu Home;
        viewDataTransaksi.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataTransaksi.setVisible(false);
                new MVCDashboardKasir();
            }
        });

        viewDataTransaksi.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = viewDataTransaksi.tfId.getText();
                String pembeli = viewDataTransaksi.tfNama.getText();
                String jumlah = viewDataTransaksi.tfJumlah.getText();

                modelDataTransaksi.ambilDataPending(id, pembeli, jumlah);
                String dataTable[][] = ma.getDataTable();
                viewDataTransaksi.tabel.setModel((new JTable(dataTable, viewDataTransaksi.kolom)).getModel());
                if (modelDataTransaksi.cekStatus() == 1) {
                    listenerStatus1();
                    listenerForm();
                }
            }
        });

        viewDataTransaksi.btnCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bayar = viewDataTransaksi.tfCash.getText();
                viewDataTransaksi.tfKembalian.setText(modelDataTransaksi.cekKembalian(bayar));
                if (modelDataTransaksi.cekStatus() == 2) {
                    viewDataTransaksi.btnSave.setEnabled(true);
                } else {
                    viewDataTransaksi.btnSave.setEnabled(false);
                }
            }
        });

        viewDataTransaksi.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataTransaksi.setVisible(false);
                new MVCDataTransaksi();
            }
        });

        viewDataTransaksi.btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data[][] = modelDataTransaksi.getDataHome();
                String tanggal = viewDataTransaksi.tfTanggal.getText();
//                (tanggal,data[0][3],data[0][4],data[0][6],data[0][2],data[0][5])
                modelDataTransaksi.insertDataTransaksi(tanggal, data[0][3], data[0][4], data[0][6], data[0][2], data[0][5]);
                viewDataTransaksi.setVisible(false);
                new MVCDataTransaksi();
            }
        });

    }

    public void listenerAwal() {
        viewDataTransaksi.btnCancel.setEnabled(false);
        viewDataTransaksi.btnSave.setEnabled(false);
        viewDataTransaksi.tfTotal.setEditable(false);
        viewDataTransaksi.tfJudulB.setEditable(false);
        viewDataTransaksi.tfSubtotal.setEditable(false);
        viewDataTransaksi.tfHarga.setEditable(false);
        viewDataTransaksi.tfTotal.setEditable(false);
        viewDataTransaksi.btnCek.setEnabled(false);
    }

    public void listenerStatus1() {
        viewDataTransaksi.btnCancel.setEnabled(true);
        viewDataTransaksi.btnCek.setEnabled(true);
        viewDataTransaksi.btnSave.setEnabled(false);
        viewDataTransaksi.tfTotal.setEditable(false);
        viewDataTransaksi.tfJudulB.setEditable(false);
        viewDataTransaksi.tfSubtotal.setEditable(false);
        viewDataTransaksi.tfHarga.setEditable(false);
        viewDataTransaksi.tfTotal.setEditable(false);
    }

    public void resetSemua() {
        listenerAwal();
        viewDataTransaksi.tfId.setText("");
        viewDataTransaksi.tfJudulB.setText("");
        viewDataTransaksi.tfHarga.setText("");
        viewDataTransaksi.tfNama.setText("");
        viewDataTransaksi.tfTotal.setText("");
        viewDataTransaksi.tfTotal.setText("");
        viewDataTransaksi.tfSubtotal.setText("");
        viewDataTransaksi.tfJumlah.setText("");
        String dataTable[][] = null;
        viewDataTransaksi.tabel.setModel((new JTable(dataTable, viewDataTransaksi.kolom)).getModel());
    }

    public String getTanggal() {
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        return (s.format(ys));
    }

    public void listenerForm() {
        // judul, String harga, String stok,String id,String pembeli,String subTotal,String jumlah
        String data[][] = modelDataTransaksi.getDataHome();

        viewDataTransaksi.tfId.setText(data[0][4].toString());
        viewDataTransaksi.tfJudulB.setText(data[0][0].toString());
        viewDataTransaksi.tfHarga.setText(data[0][1].toString());
        viewDataTransaksi.tfNama.setText(data[0][3].toString());
        viewDataTransaksi.tfTotal.setText(data[0][5].toString());
        viewDataTransaksi.tfTotal.setForeground(Color.red);
        viewDataTransaksi.tfSubtotal.setText(data[0][5].toString());
        viewDataTransaksi.tfJumlah.setText(data[0][6].toString());
    }

}
