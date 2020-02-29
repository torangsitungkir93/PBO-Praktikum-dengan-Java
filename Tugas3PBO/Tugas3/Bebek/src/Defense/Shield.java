/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Defense;

/**
 *
 * @author asus
 */
public class Shield implements DefenseBehaviour{
    private int defense;
    
    public Shield(){
        defense = 200;
    }
    
    @Override
    public void defense(){
        System.out.println("\tTameng lengkap,defense +"+defense);
    }
}
