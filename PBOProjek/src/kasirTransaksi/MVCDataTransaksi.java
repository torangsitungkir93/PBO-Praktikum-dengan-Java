/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirTransaksi;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDataTransaksi {

        ViewKasirDataTransaksi viewDataTransaksi = new ViewKasirDataTransaksi();
        
        ModelDataTransaksi modelDataTransaksi = new ModelDataTransaksi();
        ControllerDataTransaksi controllerTransaksi = new ControllerDataTransaksi(modelDataTransaksi,viewDataTransaksi);
}
