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
public class Shirt implements DefenseBehaviour {
    
    private int defense;
    
    public Shirt(){
        defense = 80;
    }
    
    @Override
    public void defense(){
        System.out.println("\tBaju Kaos,defense +"+defense);
    }
}
