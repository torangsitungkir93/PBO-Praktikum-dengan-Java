/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuAdmin;
import menuAdmin.*;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDashboardAdmin {

        ViewHomeAdmin viewHomeAdmin = new ViewHomeAdmin();
        ViewDataAdmin viewDataAdmin = new ViewDataAdmin();
        
        ModelAdmin modelAdmin = new ModelAdmin();
        ControllerAdmin controllerAdmin = new ControllerAdmin(modelAdmin, viewHomeAdmin,viewDataAdmin);
}
