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

        if (ma.getBanyakData() != 0) {
            String dataNamaSuplier[][] = ma.readBuku();
            viewDataBuku.tabel.setModel((new JTable(dataNamaSuplier, viewDataBuku.kolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        // Tombol di Menu Home;
        viewDataBuku.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataBuku.setVisible(false);
                new MVCDashboardKasir();
            }
        });

        viewDataBuku.btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listenerHome();
                viewDataBuku.setVisible(true);
            }
        });
    }

    public void listenerHome() {
        String data[][] = modelDataBuku.readBuku();
        viewDataBuku.tabel.setModel(new JTable(data, viewDataBuku.kolom).getModel());
    }
}
