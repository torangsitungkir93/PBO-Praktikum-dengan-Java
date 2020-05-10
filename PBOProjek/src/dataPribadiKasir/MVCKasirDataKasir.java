/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataPribadiKasir;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCKasirDataKasir {

        ViewKasirDataKasir viewDataKasir = new ViewKasirDataKasir();
        ViewKasirEditDataKasir viewEditKasir = new ViewKasirEditDataKasir();
        
        ModelDataKasir modelDataKasir = new ModelDataKasir();
        ControllerDataKasir controllerKasir = new ControllerDataKasir(modelDataKasir,viewDataKasir,viewEditKasir);
}
