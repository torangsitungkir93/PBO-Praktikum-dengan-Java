class Mahasiswa {
        // Data Member
        String nama;
        String nim;
        
        //Constructor
        Mahasiswa (String nama,String nim){
            this.nama =nama;
            this.nim=nim;
        }
        
        //Method tanpa return dan tanpa parameter
        void show(){
            System.out.println("Nama : "+this.nama);
            System.out.println("NIM  : "+this.nim);
        }
        // Method tanpa return dengan parameter
        void setNama(String nama){
            this.nama = nama;
        }
        //Method dengan return tapi tidak memiliki parameter
        String getNama(){
            return this.nama;
        }
        String getNim(){
            return this.nim;
        }
        //Method dengan return dan dengan parameter
        String sayHi(String message){
            return message + "juga,nama saya "+this.nama;
        }
    }

class Dosen{
    String nama;
    
    Dosen(String nama){
        this.nama=nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Torangto Situngkir","123180122");
        //Method
        mahasiswa1.show();
        mahasiswa1.setNama("Axel Frans");
        mahasiswa1.show();
        
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());
        
        String data = mahasiswa1.sayHi("hai");
        System.out.println(data);
        
        Dosen dosen1 = new Dosen("ayam Goreng");
        String nama = dosen1.nama;
        System.out.println(nama);
    }
    
}
