package BangunRuang;

public class Tabung extends Lingkaran {

    private float tinggi;

    public Tabung(float rad, float tinggi) {
        super(rad);
        this.tinggi = tinggi;
    }

    void setRadius(float rad) {
        super.rad = rad;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\tTinggi Tabung : " + this.tinggi);
        System.out.println("\tLuas Selimut  : " + this.getLuasSelimut());
        System.out.println("\tLuas Tabung   : " + this.getLuasTabung());
        System.out.println("\tVolume Tabung : " + this.getVolTabung());
    }

    public float getLuasSelimut() {
        return super.getKelilingLingkaran() * this.tinggi;
    }

    public float getLuasTabung() {
        return 2 * super.getLuasLingkaran() + this.getLuasSelimut();
    }

    public float getVolTabung() {
        return super.getLuasLingkaran() * this.tinggi;
    }

}
