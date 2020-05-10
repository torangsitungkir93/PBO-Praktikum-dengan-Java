/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuKasir;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDashboardKasir {

        ViewHomeKasir viewHomeKasir = new ViewHomeKasir();
        ModelKasir modelKasir = new ModelKasir();
        ControllerKasir controllerKasir = new ControllerKasir(modelKasir, viewHomeKasir);
}
