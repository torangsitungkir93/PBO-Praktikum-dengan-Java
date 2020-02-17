package Segitiga;

/**
 *
 * @author asus
 */
public class PrismaSegitiga extends Segitiga {

    private double sisiTegak;
    private String jmlSisi;

    public PrismaSegitiga(double sisi1, double sisi2, double alas, double tinggi, double sisiTegak) {
        super(sisi1, sisi2, alas, tinggi);
        this.sisiTegak = sisiTegak;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\tLuas Alas Prisma : " + super.getLuasSegitiga());
        System.out.println("\tSisi Tegak Prisma : " + this.sisiTegak);
        System.out.println("\tLuas Prisma\t: " + this.getLuasPrisma());
        System.out.println("\tVolume Prisma\t: " + this.getVolumePrisma());
    }

    public void setSisiTegak(double sisiTegak) {
        this.sisiTegak = sisiTegak;
    }

    // Overloading
    public void setSisiTegak(String jumlahSisiTegak) {
        this.jmlSisi = jumlahSisiTegak;
    }

    public double getLuasPrisma() {
        return 2 * super.getLuasSegitiga() + (this.sisiTegak * super.getKelilingSegitiga());
    }

    public double getVolumePrisma() {
        return super.getLuasSegitiga() * this.sisiTegak;
    }

}
