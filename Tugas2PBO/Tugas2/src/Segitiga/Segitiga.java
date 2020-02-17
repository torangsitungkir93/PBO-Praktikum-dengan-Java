package Segitiga;

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

    public double getLuasSegitiga() {
        return this.alas * tinggi / 2;
    }

    public double getKelilingSegitiga() {
        return this.sisi1 + this.sisi2 + this.alas;
    }

    public void showData() {
        System.out.println("\tAlas\t\t: " + this.alas);
        System.out.println("\tTinggi Segitiga\t: " + this.tinggi);
    }

}
