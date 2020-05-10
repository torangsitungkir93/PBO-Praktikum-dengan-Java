package menuAdmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dataBuku.MVCDataBuku;
import dataCatatanTransaksi.MVCDataCatatanTransaksi;
import dataKasir.MVCDataKasir;
import dataSupplier.MVCDataSuplier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import login.MVCLogin;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerAdmin {

    String nomor;

    ModelAdmin modelAdmin;
    ViewHomeAdmin viewHomeAdmin;
    ViewDataAdmin viewDataAdmin;

    public ControllerAdmin(ModelAdmin ma, ViewHomeAdmin vHomeAdmin, ViewDataAdmin vAdmin) {
        this.modelAdmin = ma;
        this.viewHomeAdmin = vHomeAdmin;
        this.viewDataAdmin = vAdmin;
        viewHomeAdmin.btnDataAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                viewDataAdmin.setVisible(true);
            }
        });

        viewHomeAdmin.btnDataKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                new MVCDataKasir();
            }
        });

        viewHomeAdmin.btnDataPenerbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                new MVCDataSuplier();
            }
        });

        viewHomeAdmin.btnDataBuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                new MVCDataBuku();
            }
        });

        viewHomeAdmin.btnCatatanTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                new MVCDataCatatanTransaksi();
            }
        });

        viewHomeAdmin.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);

                MVCLogin login = new MVCLogin();
            }
        });
    }
}
