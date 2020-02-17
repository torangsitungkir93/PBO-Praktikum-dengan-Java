package BangunRuang;

/**
 *
 * @author asus
 */
public class Bola extends Lingkaran {

    public Bola(float rad) {
        super(rad);
    }

    void setRadius(float rad) {
        super.rad = rad;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.

        System.out.println("\tLuas Bola   : " + this.getLuasBola());
        System.out.println("\tVolume Bola : " + this.getVolBola());
    }

    public float getLuasBola() {
        return 4 * super.getLuasLingkaran();
    }

    public float getVolBola() {
        return (float) (4 / 3.0 * super.pi * super.rad * super.rad * super.rad);
    }

}
