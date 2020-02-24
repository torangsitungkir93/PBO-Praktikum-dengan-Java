
import Terbang.*;
import Bicara.*;

public class Duck {
    private FlyBehaviour flyBehaviour;
    private SoundBehaviour soundBehaviour;
    
    public Duck (FlyBehaviour flyBehaviour,
                    SoundBehaviour soundBehaviour){
     this.flyBehaviour = flyBehaviour;
     this.soundBehaviour = soundBehaviour;
     
    }
    
    public void setFlyBehaviour (FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    
    public void setSoundBehaviour(SoundBehaviour soundBehaviour){
        this.soundBehaviour = soundBehaviour;
    }
    
    public void fly(){
        flyBehaviour.fly();
    }
    
    public void sound(){
        soundBehaviour.sound();
    }
}
