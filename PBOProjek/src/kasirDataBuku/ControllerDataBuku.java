package kasirDataBuku;

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
public class ControllerDataBuku {

    String nomor;

    ModelDataBuku modelDataBuku;
    ViewKasirDataBuku viewDataBuku;

    public ControllerDataBuku(ModelDataBuku ma, ViewKasirDataBuku vBuku) {
        this.modelDataBuku = ma;
        this.viewDataBuku = vBuku;
        viewDataBuku.setVisible(true);

             // Tombol di Menu Home;
        viewDataBuku.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataBuku.setVisible(false);
                new MVCDashboardKasir();
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
