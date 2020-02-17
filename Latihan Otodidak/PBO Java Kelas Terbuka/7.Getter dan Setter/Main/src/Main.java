
class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate2;
    
    public Data(){
        this.intPublic =0;
        this.intPrivate =0;
    }
    
    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate2);
    }
    
    // Getter
    public int getIntPrivate(){
        return this.intPrivate;
    }
    
    // Setter 
    public void setDoublePrivate(double value){
        this.doublePrivate2=value;
    }
}


class Lingkaran {
    private double diameter;

    Lingkaran(double diameter){
       this.diameter=diameter;
    }
    
    // Setter
    public void setJari(double jari2){
        this.diameter = jari2*2;
    }
    
    // Getter 
    public double getJari2(){
        return this.diameter/2;
    }
    
    // Getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}

public class Main {

    
    public static void main(String[] args) {
        Data object = new Data();
        // Public
        
        // Read and Write dengan menggunakan Public
        object.intPublic = 10; // Write
        System.out.println(object.intPublic); //Read
        
        // Read Only (Kita bisa menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("Getter : "+angka);
        
        // Write only (Kita hanya bisa menulis saja)
        object.setDoublePrivate(0.05);
        object.display();
        
        // Gabungkan Read dan Write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println(object2.getJari2());
        object2.setJari(14);
        System.out.println(object2.getJari2());
        System.out.println("Luas : "+object2.getLuas());
    }
    
}
