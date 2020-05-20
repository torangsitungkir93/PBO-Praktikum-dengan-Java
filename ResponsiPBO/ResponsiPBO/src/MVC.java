
import view.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVC {
 
 // D
    ModelPerpus model = new ModelPerpus ();
 //VIEW
    ViewLogin viewLogin = new ViewLogin();
    ViewPinjam viewPinjam = new ViewPinjam();
    ViewMenu viewMenu = new ViewMenu();
    ViewAbout viewAbout = new ViewAbout();
    ViewTampil viewTampil = new ViewTampil();
 //CONTROLLER
    ControlPerpus controller = new ControlPerpus(model,viewLogin,viewPinjam,viewMenu,viewAbout,viewTampil);
}
