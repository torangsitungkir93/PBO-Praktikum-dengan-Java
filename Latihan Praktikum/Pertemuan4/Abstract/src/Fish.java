
public class Fish extends Animal implements Pet {
    String name;
    
    public Fish(){
        super(0);
    }
    
    @Override
    void eat(){
        System.out.println("Ikan sedang makan");
    }
    
    public String getName(String name){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name=name;
    }
    
    @Override
    public void Play(){
        System.out.println("Ikan Sedang Bermain");
    }
    
    @Override
    public void walk(){
        System.out.println("Ikan tidak beejalan "+"tapi berenang");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
