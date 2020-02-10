
    //Player
    class Player{
        String name;
        double health;
        int level;
        //object member
        Weapon weapon;
        Armor armor;
        
        Player(String name,double health){
            this.name=name;
            this.health=health;
        }
        
        void attack(Player  opponent){
            double attackPower = this.weapon.attackPower;
            System.out.println(this.name+" attacking " + opponent.name + " with power : "+attackPower);
            opponent.defence(attackPower);
        }
        
        void defence(Double attackPower){
            
            //Akan mengambil damage
            double damage;
            if(this.armor.defencePower<attackPower){
                damage = attackPower - this.armor.defencePower;
            } else{
                damage = 0;
            }
            
            this.health-=damage;
            
            System.out.println(this.name+" gets damage "+damage);
        }
        
        void equipWeapon(Weapon weapon){
            this.weapon = weapon;
        }
        
        void equipArmor(Armor armor){
            this.armor = armor;
        }
        
        void display(){
            System.out.println("\nName   : "+this.name);
            System.out.println("Health : "+this.health + " hp");
            this.weapon.display();
            this.armor.display();
        }
        
    }

    //Senjata
    class Weapon{
        double attackPower;
        String name;
        
        Weapon (String name,double attackPower){
            this.name = name;
            this.attackPower=attackPower;
        }
        
        void display(){
            System.out.println("Weapon : "+this.name+" ,attack : " +this.attackPower);
        }
        
    }
    
    //Armor
    class Armor{
        double defencePower;
        String name;
        
        Armor (String name,double defencePower){
            this.name=name;
            this.defencePower=defencePower;
        }
        
         void display(){
            System.out.println("Weapon : "+this.name+" ,defence : " +this.defencePower);
        }
    }
    
    
public class Main {
    
    public static void main(String[] args) {
       // Membuat Object player
       Player player1 = new Player("Torangto",100);
       Player player2 = new Player("Axel",80);
       
       
       //Membuat object weapon
       Weapon pedang = new Weapon("Pedang",15);
       Weapon ketapel = new Weapon("Ketapel",5);
       
       //Membuat object armor
       Armor bajuBesi = new Armor("Baju Besi",10);
       Armor kaos = new Armor("Kaos",3);
       
       // eqiup senjata dan armor player  1
       player1.equipWeapon(pedang);
       player1.equipArmor(bajuBesi);
       player1.display();
       
       // eqiup senjata dan armor player  1
       player2.equipWeapon(ketapel);
       player2.equipArmor(kaos);
       player2.display();
       
       System.out.println("\nPERTEMPURAN");
       System.out.println("\nEpisode - 1\n");
       player1.attack(player2);
       player1.display();
       player2.display();
       System.out.println("\nEpisode - 2\n");
       player2.attack(player1);
       player1.display();
       player2.display();
       
    }
    
}
