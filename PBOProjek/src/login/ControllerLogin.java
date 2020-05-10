package login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import login.ViewLogin;
import menuAdmin.MVCDashboardAdmin;
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
public class ControllerLogin{

    String nomor;

    ModelLogin modelLogin;
    ViewLogin viewLogin;

    public ControllerLogin(ModelLogin ma, ViewLogin vl) {
        this.modelLogin = ma;
        this.viewLogin = vl;
        viewLogin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewLogin.getUsername();
                String password = viewLogin.getPassword();

                modelLogin.cekLogin(username, password);
            }
        });
    }
}
