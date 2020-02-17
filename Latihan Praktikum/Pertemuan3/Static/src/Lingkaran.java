
public class Lingkaran {
   private double rad;
   public double luas;
   public double pi =3.14;
    
   public double setRadius(double value){
       this.rad = value;
       return this.rad;
   }
   
   public void getLuas(){
       double rad = this.rad;
       this.luas = pi*rad*rad;
   }
}
