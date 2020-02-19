package BangunRuang;

/**
 *
 * @author asus
 */
public class Segitiga {

    private double sisi1;
    private double sisi2;
    private double tinggi;
    private double alas;

    public Segitiga(double sisi1, double sisi2, double alas, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    protected double luasSegitiga(){
        float luas;
        luas = (float) (this.alas * tinggi / 2);
        return luas;
    }
    
    protected double kelilingSegitiga(){
        float kel;
        kel = (float) (this.sisi1 + this.sisi2 + this.alas);
        return kel;
    }

    public double getLuasSegitiga() {
        return this.luasSegitiga();
    }

    public double getKelilingSegitiga() {
        return this.kelilingSegitiga();
    }

    public void showData() {
        System.out.println("\tAlas\t\t: " + this.alas);
        System.out.println("\tTinggi Segitiga\t: " + this.tinggi);
    }

}
