/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataKasir;
import menuAdmin.*;
import menuAdmin.*;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDataKasir {

        ViewDataKasir viewDataKasir = new ViewDataKasir();
        
        ModelDataKasir modelDataKasir = new ModelDataKasir();
        ControllerDataKasir controllerKasir = new ControllerDataKasir(modelDataKasir,viewDataKasir);
}
