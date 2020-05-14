/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCLogin2 {
    public MVCLogin2() {
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setVisible(true);
        ModelLogin modelLogin = new ModelLogin();
        new ControllerLogin(modelLogin,viewLogin);
    }
}
