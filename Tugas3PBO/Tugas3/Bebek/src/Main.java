
import Fly.*;
import Sound.*;
import Attack.*;
import Defense.*;



public class Main {
    public static void main(String[] args) {
        Duck superDuck = new Duck(new RocketFly(),new ToaSound(),new IronSword(),new Shield());
        System.out.println("Kekuatan Bebek Super  ");
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        superDuck.defense();
        
        System.out.println("");
        System.out.println("Kekuatan Bebek Biasa  ");
        Duck bebekBiasa = new Duck(new PlaneFly(),new NormalSound(),new Crossbow(),new IronArmor());
        bebekBiasa.fly();
        bebekBiasa.sound();
        bebekBiasa.attack();
        bebekBiasa.defense();
        
        System.out.println("");
        System.out.println("Kekuatan Anak Bebek  ");
        Duck anakBebek = new Duck(new WingFly(),new NormalSound(),new WoodSword(),new Shirt());
        anakBebek.fly();
        anakBebek.sound();
        anakBebek.attack();
        anakBebek.defense();
    }
    
}
