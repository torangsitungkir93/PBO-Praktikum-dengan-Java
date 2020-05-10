package menuKasir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dataPribadiKasir.MVCKasirDataKasir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import kasirDataBuku.MVCDataBuku;
import login.Main;

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
                
                new Main();
            }
        });
    }
}
