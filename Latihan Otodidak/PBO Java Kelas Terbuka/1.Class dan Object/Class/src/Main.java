/**
 *
 * @author torangto
 */

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        // Instansiasi / Membuat object
        Mahasiswa mahasiswa1 =new Mahasiswa();
        Mahasiswa mahasiswa2 =new Mahasiswa();
        
        System.out.println("========= Tampilan Mahasiswa 1");
        
        mahasiswa1.nama= "Torangto Situngkir";
        mahasiswa1.NIM="123180122";
        mahasiswa1.jurusan="Teknik Informatika";
        mahasiswa1.IPK=4.0;
        mahasiswa1.umur=17;
        
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        System.out.println("========= Tampilan Mahasiswa 2");
        
        mahasiswa2.nama= "Bill Gates";
        mahasiswa2.NIM="123180199";
        mahasiswa2.jurusan="Teknik Industri";
        mahasiswa2.IPK=4.0;
        mahasiswa2.umur=19;
        
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
    
}
