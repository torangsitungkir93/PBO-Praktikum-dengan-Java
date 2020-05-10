package menuAdmin;

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

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerAdmin {

    String nomor;

    ModelAdmin modelAdmin;
    ViewHomeAdmin viewHomeAdmin;
    ViewDataKasir viewDataKasir;
    ViewDataAdmin viewDataAdmin;
    ViewDataSuplier viewDataSuplier;
    ViewDataBuku viewDataBuku;
    ViewCatatanTransaksi viewCatatanTransaksi;

    public ControllerAdmin(ModelAdmin ma, ViewHomeAdmin vHomeAdmin,ViewDataKasir vKasir,ViewDataAdmin vAdmin
                            ,ViewDataSuplier vSuplier,ViewDataBuku vBuku,ViewCatatanTransaksi vTransaksi) {
        this.modelAdmin = ma;
        this.viewHomeAdmin = vHomeAdmin;
        this.viewDataKasir = vKasir;
        this.viewDataAdmin = vAdmin;
        this.viewDataSuplier = vSuplier;
        this.viewDataBuku = vBuku;
        this.viewCatatanTransaksi = vTransaksi;
        
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
                viewDataKasir.setVisible(true);
            }
        });
        
        viewHomeAdmin.btnDataPenerbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                viewDataSuplier.setVisible(true);
            }
        });
        
        viewHomeAdmin.btnDataBuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                viewDataBuku.setVisible(true);
            }
        });
        
        viewHomeAdmin.btnCatatanTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeAdmin.setVisible(false);
                viewCatatanTransaksi.setVisible(true);
            }
        });
    }
}
