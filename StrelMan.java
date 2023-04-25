package Unit;

public class StrelMan extends Crossbowman{

    public StrelMan(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed,
            int arrows, int accuracy) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed,  arrows, accuracy);
        
    }
    @Override
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
       
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s, arrows-%s , accuracy-%s",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed,this.arrows,this.accuracy );
    }
    @Override
    public void spep() {
        
        super.spep();
    }

    void healing(){

    }
    void protection(){

    }
    void attack(){
        
    }
    
}
