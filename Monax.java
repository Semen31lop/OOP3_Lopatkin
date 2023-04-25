package Unit;



public class Monax extends Mag{

    public Monax(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed,
            String abilities) {
        super(name, hpL, maxHp, lvl, damag, maxDamag, armor, speed, abilities);
        
    }
    
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s, abilities-%s",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed,this.abilities );
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
