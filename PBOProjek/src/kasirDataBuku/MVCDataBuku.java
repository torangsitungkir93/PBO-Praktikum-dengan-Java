/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirDataBuku;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDataBuku {

        ViewKasirDataBuku viewDataBuku = new ViewKasirDataBuku();
        
        ModelDataBuku modelDataBuku = new ModelDataBuku();
        ControllerDataBuku controllerBuku = new ControllerDataBuku(modelDataBuku,viewDataBuku);
}
