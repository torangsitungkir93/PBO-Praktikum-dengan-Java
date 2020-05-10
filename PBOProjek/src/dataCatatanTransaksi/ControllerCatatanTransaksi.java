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

             // Tombol di Menu Home;
        viewDataTransaksi.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataTransaksi.setVisible(false);
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
