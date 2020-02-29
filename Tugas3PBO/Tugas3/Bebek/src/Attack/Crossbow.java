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
public class Crossbow implements AttackBehaviour{
    
    private int damage;
    
    public Crossbow(){
        damage = 20;
    }
    
    public Crossbow(int damage){
        this.damage = damage;
    }
    
    @Override
    public void attack(){
        System.out.println("\tPanah,attack + "+damage);
    }
}
