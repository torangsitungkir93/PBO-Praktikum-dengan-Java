package BangunRuang;

/**
 *
 * @author Torangto Situngkir
 */
public class Lingkaran {

    protected float pi;
    public float rad;
    private float diameter;

    public Lingkaran(float rad) {
        this.pi = (float) 3.14;
        this.rad = rad;
    }

    public void showData() {
        System.out.println("\tJari Jari : " + this.rad);
        System.out.println("\tDiameter  : " + this.getDiameter());
    }

    public float getDiameter() {
        return this.diameter = this.rad * 2;
    }

    public float getLuasLingkaran() {
        return this.pi * this.rad * this.rad;
    }

    public float getKelilingLingkaran() {
        return 2 * this.pi * this.rad;
    }

}
