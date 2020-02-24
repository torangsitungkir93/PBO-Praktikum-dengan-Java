
/**
 *
 * @author torangto
 */
public class Main {

    public static void main(String[] args) {
       Fish f = new Fish();
       Cat c = new Cat("Fluffy");
       Animal a = new Fish();
       Animal e = new Spider();
       Pet p = new Cat();
       
       f.Play();
       c.Play();
       
       e.eat();
       e.walk();
       
       a.walk();
    }
    
}
