package BangunRuang;

/**
 *
 * @author asus
 */
public class LimasSegitiga extends Segitiga {

    private double sisiTegak;
    private String jmlSisi;

    public LimasSegitiga(double sisi1, double sisi2, double alas, double tinggi, double sisiTegak) {
        super(sisi1, sisi2, alas, tinggi);
        this.sisiTegak = sisiTegak;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\tLuas Alas Limas : " + super.getLuasSegitiga());
        System.out.println("\tSisi Tegak Limas : " + this.sisiTegak);
        System.out.println("\tLuas Limas\t: " + this.getLuasLimas());
        System.out.println("\tVolume Limas\t: " + this.getVolumeLimas());
    }

    // Angkapannya limas Segitiga  sama sisi
    // Rumus : luas alas * 3 kali luas alas segitiga sisi tegaknya
    public double getLuasSisiTegak() {
        return 3 * super.getLuasSegitiga();
    }

    public void setSisiTegak(double sisiTegak) {
        this.sisiTegak = sisiTegak;
    }
    
    // Overloading
    public void setSisiTegak(String jumlahSisiTegak) {
        this.jmlSisi = jumlahSisiTegak;
    }

    public double getLuasLimas() {
        return super.getLuasSegitiga() + this.getLuasSisiTegak();
    }

    public double getVolumeLimas() {
        return 1.0 / 3 * super.getLuasSegitiga() * this.sisiTegak;
    }
}
