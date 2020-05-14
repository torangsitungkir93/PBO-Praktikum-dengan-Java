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
import login.*;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerAdmin {

    String nomor;

    ModelAdmin modelAdmin;
    ViewHomeAdmin viewHomeAdmin;
    ViewDataAdmin viewDataAdmin;
    ViewEditDataAdmin viewEditDataAdmin;

    public ControllerAdmin(ModelAdmin ma, ViewHomeAdmin vHomeAdmin, ViewDataAdmin vAdmin, ViewEditDataAdmin vEAdmin) {
        this.modelAdmin = ma;
        this.viewHomeAdmin = vHomeAdmin;
        this.viewDataAdmin = vAdmin;
        this.viewEditDataAdmin = vEAdmin;

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
                new MVCLogin2();
                viewHomeAdmin.setVisible(false);
            }
        });

        // Untuk Data Admin
        viewDataAdmin.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(true);
                viewDataAdmin.setVisible(false);
            }
        });

        viewEditDataAdmin.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataAdmin.setVisible(true);
                viewEditDataAdmin.setVisible(false);
            }
        });

        viewDataAdmin.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataAdmin.setVisible(false);
                viewEditDataAdmin.setVisible(true);
            }
        });
    }
}
