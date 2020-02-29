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
public class IronSword implements AttackBehaviour{

    private int damage;
    
    public IronSword(){
        damage = 30;
    }
    
    @Override
    public void attack(){
        System.out.println("\tPanah,attack + "+damage);
    }
}
