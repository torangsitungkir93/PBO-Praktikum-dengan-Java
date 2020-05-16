package menuKasir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import kasirDataKasir.MVCKasirDataKasir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import kasirDataBuku.MVCDataBuku;
import kasirTransaksi.MVCDataTransaksi;
import login.MVCLogin;
import login.MVCLogin2;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerKasir {

    String nomor;

    ModelKasir modelKasir;
    ViewHomeKasir viewHomeKasir;

    public ControllerKasir(ModelKasir ma, ViewHomeKasir vHomeKasir) {
        this.modelKasir = ma;
        this.viewHomeKasir = vHomeKasir;

        viewHomeKasir.btnDataKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeKasir.setVisible(false);

                new MVCKasirDataKasir();
            }
        });

        viewHomeKasir.btnTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeKasir.setVisible(false);

                new MVCDataTransaksi();
            }
        });

        viewHomeKasir.btnDataBuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeKasir.setVisible(false);

                new MVCDataBuku();
            }
        });

        viewHomeKasir.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHomeKasir.setVisible(false);

                new MVCLogin2();
            }
        });
    }

//    public void listenerHome() {
//        String data[][] = modelKasir.readKasir();
//
//        viewDataKasir.tfUsername.setText(data[0][0].toString());
//        viewDataKasir.tfUsername.setForeground(Color.red);
//        viewDataAdmin.tfUsername.setEditable(false);
//        viewDataAdmin.tfNama.setText(data[0][1].toString());
//        viewDataAdmin.tfNama.setEditable(false);
//
//        if (data[0][2].equals("L")) {
//            viewDataAdmin.r1.setSelected(true);
//        } else if (data[0][2].equals("P")) {
//            viewDataAdmin.r2.setSelected(true);
//
//        }
//
//        viewDataAdmin.tfNoTelp.setText(data[0][3].toString());
//        viewDataAdmin.tfNoTelp.setEditable(false);
//        viewDataAdmin.tfAlamat.setText(data[0][4].toString());
//        viewDataAdmin.tfAlamat.setEditable(false);
//    }
}
