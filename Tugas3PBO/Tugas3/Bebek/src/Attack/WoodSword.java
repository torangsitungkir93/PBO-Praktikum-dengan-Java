/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attack;

/**
 *
 * @author asus
 */
public class WoodSword implements AttackBehaviour {

    private int damage;
    
    public WoodSword(){
        damage = 21;
    }
    
    @Override
    public void attack() {
        System.out.println("\tPedang kayu,attack + "+damage);
    }
}
