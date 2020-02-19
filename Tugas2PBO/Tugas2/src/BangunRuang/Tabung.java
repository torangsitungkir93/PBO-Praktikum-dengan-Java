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

    public float luasSelimut(){
        float luas;
        luas = super.getKelilingLingkaran() * this.tinggi;
        return luas;
    }
    
    public float luasTabung(){
        float luas;
        luas = 2 * super.getLuasLingkaran() + this.getLuasSelimut();
        return luas;
    }
    
    public float volTabung(){
        float vol;
        vol = 2 * super.getLuasLingkaran() + this.getLuasSelimut();
        return vol;
    }
    
    public float getLuasSelimut() {
        return this.luasSelimut();
    }

    public float getLuasTabung() {
        return this.luasTabung();
    }

    public float getVolTabung() {
        return this.volTabung();
    }

}
