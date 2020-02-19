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
    
    private float luasBola(){
        float luas;
        luas = 4 * super.getLuasLingkaran();
        return luas;
    }
    
    private float volBola(){
        float volume;
        volume = (float) (4 / 3.0 * super.pi * super.rad * super.rad * super.rad);
        return volume;
    }

    public float getLuasBola() {
        return this.luasBola();
    }

    public float getVolBola() {
        return this.volBola();
    }

}
