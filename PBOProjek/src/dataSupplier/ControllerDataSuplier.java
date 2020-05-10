package dataSupplier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dataKasir.*;
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
public class ControllerDataSuplier {

    String nomor;

    ModelDataSuplier modelDataSuplier;
    ViewDataSuplier viewDataSuplier;

    public ControllerDataSuplier(ModelDataSuplier ma, ViewDataSuplier vSuplier) {
        this.modelDataSuplier = ma;
        this.viewDataSuplier = vSuplier;
        vSuplier.setVisible(true);

             // Tombol di Menu Home;
        viewDataSuplier.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataSuplier.setVisible(false);
                new MVCDashboardAdmin();
            }
        });

//       viewHome.btnUbahPanel.addActionListener(new ActionListener() {
//           @Override
//            public void actionPerformed(ActionEvent e) {
//                viewEdit.setVisible(true);
//                setFormEdit(nomor);
//                viewHome.setVisible(false);
//           }
//       });

    }
}
