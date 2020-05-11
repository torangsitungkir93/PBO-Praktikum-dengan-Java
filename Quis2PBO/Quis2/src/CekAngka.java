/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class CekAngka {

    public boolean isNumberOnly(int input) {
        if(input%1==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isNilaiTrue(int input) {
        if (input <= 100 && input >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
