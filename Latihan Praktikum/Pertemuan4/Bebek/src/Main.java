
import Bicara.*;
import Terbang.*;



public class Main {
    public static void main(String[] args) {
        Duck SuperDuck = new Duck(new RocketFly(),new ToaSound());
        System.out.println("Super bebek behaviour : ");
        SuperDuck.fly();
        SuperDuck.sound();
        
        System.out.println("");
        System.out.println("Noob Duck Behaviour ");
        Duck bebekcacat = new Duck(new WingFly(),new NormalSound());
        bebekcacat.fly();
        bebekcacat.sound();
        
        System.out.println("");
        System.out.println("Beginner Duck Behaviour ");
        Duck beginner = new Duck(new PlaneFly(),new NormalSound());
        beginner.fly();
        beginner.sound();
        
        System.out.println("");
        System.out.println("Super Duck Behaviour ");
        SuperDuck.setFlyBehaviour(new PlaneFly());
        beginner.fly();
        beginner.sound();
    }
    
}
