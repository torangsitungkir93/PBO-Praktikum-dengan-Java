
//Class polos tanpa constructor
class Polos {
    String dataString;
    int dataInteger=0;
}
//Class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    
    Mahasiswa(String inputNama,String inputNim,String inputJurusan){
        nama=inputNama;
        NIM=inputNim;
        jurusan=inputJurusan;
        
        System.out.println("Mahasiswa : "+nama);
        System.out.println("NIM       : "+NIM);
        System.out.println("Jurusan   : "+jurusan);
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Torangto Situngkir","123180122","Teknik Informatika\n");
        Mahasiswa mahasiswa2 = new Mahasiswa("Axel Fransiskus","123180129","Teknik Industri");
        
//        Polos objectPolos=new Polos();
//        objectPolos.dataString="polos";
//        objectPolos.dataInteger=0;
    }

}
