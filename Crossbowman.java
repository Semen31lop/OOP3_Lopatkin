package Unit;

public class Crossbowman extends Shooter {
    protected int arrows;
    protected  int accuracy;
  
    public Crossbowman(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed, int arrows,int accuracy) {
        super(team, name, hpL, maxHp, lvl, damag, maxDamag, armor, speed);
        this.arrows=armor;
        this.accuracy=accuracy;
        
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
