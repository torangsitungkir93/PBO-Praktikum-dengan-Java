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

    
    public float diameter(){
        this.diameter=this.rad*2;
        return this.diameter;
    }
    
    protected float luasLingkaran(){
        float luas;
        luas = this.pi * this.rad * this.rad;
        return luas;
    }
    
    protected float kelilingLingkaran(){
       float keliling;
       keliling = 2 * this.pi * this.rad;
       return keliling;
    }
    
    public float getDiameter() {
        return this.diameter;
    }

    public float getLuasLingkaran() {
        return this.luasLingkaran();
    }

    public float getKelilingLingkaran() {
        return this.kelilingLingkaran();
    }
}
