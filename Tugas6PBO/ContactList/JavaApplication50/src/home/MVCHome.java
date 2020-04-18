/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCHome {
    ViewHome viewHome = new ViewHome();
    ViewData viewData = new ViewData();
    ViewTambah viewTambah= new ViewTambah();
    ViewEdit viewEdit= new ViewEdit();
    ShowAllData viewShowAllData= new ShowAllData();
    ModelContact modelContact = new ModelContact();
    ControllerContact controllerContact = new ControllerContact(modelContact,viewHome,viewData,viewTambah,viewEdit,viewShowAllData);
}
