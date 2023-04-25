package Unit;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(team, name, 0, 120, 2, 40, 100, 2, 2);
      
    }
    
    public String toString() {
        
        return name;
    }
    @Override
    public String getInfo() {
        return String.format("%s,name-%s , armor-%s , damag- %s , hpL-%s , lvl-%s , maxDamag-%s , maxHp-%s , spped-%s,",
        this.getClass().getName(),this.name, this.armor, this.damag,this.hpL,this.lvl,this.maxDamag,this.maxHp,this.speed );
    }


    void healing(){

    }
    void protection(){

    }
    void attack(){
        
    }
}
