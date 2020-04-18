/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class MVC {
    
    viewMain viewmain = new viewMain();
    viewBuatKontak viewbuat = new viewBuatKontak();
    viewLihatKontak viewlihat = new viewLihatKontak();
    viewUpdateKontak viewupdate = new viewUpdateKontak();
    model model = new model() ;
    controller controller = new controller (model, viewmain, viewbuat,viewlihat, viewupdate) ;
}
