

class Player{
    String name; // default (Bisa di baca dan ditulis)
    public int exp; // Public,akan sama dengan default
    private int health; // Private,hanya akan bisa dibaca dan ditulis dalam class saja
    
    Player (String name,int exp,int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }
    
    // Default Modifier Access
    void display(){
        tambahExp(); // Contoh mengakses method Private
        System.out.println("\nName\t: "+this.name);
        System.out.println("exp\t: "+this.exp);
        System.out.println("health\t :"+this.health);
    }
    
    public void setNama(String namaBaru){
        this.name=namaBaru;
    }
    
    // Private
    private void tambahExp(){
        this.exp +=100;
    }
    
}

public class Main {
 
    public static void main(String[] args) {
        
        // Default
        Player player1 = new Player("Marni",0,100);
        System.out.println(player1.name); // Membaca Data
        player1.name = "Surti"; // Menulis data
        System.out.println(player1.name); // Membaca Data
        
        // Public
        System.out.println(player1.exp); // Membaca Data
        player1.exp = 100; // Menulis data
        System.out.println(player1.exp); // Membaca Data
        
        //Private (Tidak Visible disini)
//        System.out.println(player1.health); // Membaca Data
//        player1.health = 100; // Menulis data
//        System.out.println(player1.health); // Membaca Data
    
        // Method Default
        player1.display();
        
        //Public Method
        player1.setNama("Tejo");
        player1.display();
        
        //Private
        // player1.tambahExp();
    }
    
    
}
