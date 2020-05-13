package dataCatatanTransaksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import menuAdmin.MVCDashboardAdmin;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerCatatanTransaksi {

    String nomor;

    ModelCatatanTransaksi modelTransaksi;
    ViewDataCatatanTransaksi viewDataTransaksi;

    public ControllerCatatanTransaksi(ModelCatatanTransaksi ma, ViewDataCatatanTransaksi vDataTransaksi) {
        this.modelTransaksi = ma;
        this.viewDataTransaksi = vDataTransaksi;
        viewDataTransaksi.setVisible(true);

        if (ma.getBanyakData() != 0) {
            String dataNamaSuplier[][] = ma.readTransaksi();
            viewDataTransaksi.tabel.setModel((new JTable(dataNamaSuplier, viewDataTransaksi.kolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        // Tombol di Menu Home;
        viewDataTransaksi.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataTransaksi.setVisible(false);
                new MVCDashboardAdmin();
            }
        });

        viewDataTransaksi.btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = viewDataTransaksi.getSearch();

                String dataTransaksi[][] = modelTransaksi.searchTransaksi(cari);
                System.out.println("CEK DULU : "+cari);
                vDataTransaksi.tabel.setModel((new JTable(dataTransaksi, vDataTransaksi.kolom)).getModel());

            }
        });

    }

    public void listenerHome() {
        String data[][] = modelTransaksi.readTransaksi();
        viewDataTransaksi.tabel.setModel(new JTable(data, viewDataTransaksi.kolom).getModel());
    }

}
