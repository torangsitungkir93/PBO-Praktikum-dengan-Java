/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSupplier;
import dataKasir.*;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class MVCDataSuplier {

        ViewDataSuplier viewDataSuplier = new ViewDataSuplier();
        
        ModelDataSuplier modelDataSuplier = new ModelDataSuplier();
        ControllerDataSuplier controllerSuplier = new ControllerDataSuplier(modelDataSuplier,viewDataSuplier);
}
