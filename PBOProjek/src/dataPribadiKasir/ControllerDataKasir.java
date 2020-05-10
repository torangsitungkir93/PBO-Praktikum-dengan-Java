package dataPribadiKasir;

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
import menuKasir.MVCDashboardKasir;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerDataKasir {

    String nomor;

    ModelDataKasir modelDataKasir;
    ViewKasirDataKasir viewDataKasir;
    ViewKasirEditDataKasir viewEditKasir;

    public ControllerDataKasir(ModelDataKasir ma, ViewKasirDataKasir vKasir, ViewKasirEditDataKasir vEditKasir) {
        this.modelDataKasir = ma;
        this.viewDataKasir = vKasir;
        this.viewEditKasir = vEditKasir;
        vKasir.setVisible(true);

        // Tombol di Menu Home;
        viewDataKasir.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataKasir.setVisible(false);
                new MVCDashboardKasir();
            }
        });

        viewDataKasir.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataKasir.setVisible(false);
                viewEditKasir.setVisible(true);
            }
        });

        viewEditKasir.btnReturn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditKasir.setVisible(false);
                viewDataKasir.setVisible(true);
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
