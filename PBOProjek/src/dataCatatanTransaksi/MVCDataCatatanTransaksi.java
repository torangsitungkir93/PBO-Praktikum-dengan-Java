/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataCatatanTransaksi;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDataCatatanTransaksi {

        ViewDataCatatanTransaksi viewDataCatatanTransaksi = new ViewDataCatatanTransaksi();
        
        ModelCatatanTransaksi modelDataCatatanTransaksi = new ModelCatatanTransaksi();
        ControllerCatatanTransaksi controllerCatatanTransaksi = new ControllerCatatanTransaksi(modelDataCatatanTransaksi,viewDataCatatanTransaksi);
}
