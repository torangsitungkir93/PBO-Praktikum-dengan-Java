 
class Buku {

        String judul;
        String penulis;

        Buku(String judul, String penulis) {
            this.judul=judul;
            this.penulis=penulis;
        }
        
        void display(){
            System.out.println("\nJudul\t: "+this.judul);
            System.out.println("Penulis\t: "+this.penulis);
        }
    }

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new Buku ("Killing Comanandatore","Haruki Murakami");
        
        buku1.display();
        
        // Menampilkan Address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        
        // Assigment Object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku2);
        
        // Karena buku 1 dan buku 2 berada pada address atau reference yang sama
        buku1.judul = "Membunuh Komandan";
        buku2.display();
        fungsi(buku2);
    }
    
    // Pasdt by Reference
    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressDataBuku);
        dataBuku.penulis = "Sakura ";
    }

}
