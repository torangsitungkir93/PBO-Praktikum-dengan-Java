
import Fly.FlyBehaviour;
import Sound.SoundBehaviour;
import Attack.AttackBehaviour;
import Defense.DefenseBehaviour;

public class Duck {

    private FlyBehaviour flyBehaviour;
    private SoundBehaviour soundBehaviour;
    private AttackBehaviour attackBehaviour;
    private DefenseBehaviour defenseBehaviour;

    public Duck( FlyBehaviour flyBehaviour,
            SoundBehaviour soundBehaviour,
            AttackBehaviour attackBehaviour,
            DefenseBehaviour defenseBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.soundBehaviour = soundBehaviour;
        this.attackBehaviour = attackBehaviour;
        this.defenseBehaviour = defenseBehaviour;
    }
    
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public void setAttackBehaviour(AttackBehaviour attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
    }

    public void setDefenseBehaviour(DefenseBehaviour defenseBehaviour) {
        this.defenseBehaviour = defenseBehaviour;
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void sound() {
        soundBehaviour.sound();
    }

    public void attack() {
        attackBehaviour.attack();
    }

    public void defense() {
        defenseBehaviour.defense();
    }
}
