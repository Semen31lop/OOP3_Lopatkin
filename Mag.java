package Unit;

public class Mag extends Shooter {
     protected String abilities;
    public Mag(String name, int hpL, int maxHp, int lvl, int damag, int maxDamag, int armor, int speed, String abilities) {
        super(team, name, hpL, maxHp, lvl, damag, maxDamag, armor, speed);
        this.abilities=abilities;
    }
    @Override
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
        int index_damag=0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i+1; j < team.size()-1; j++) {
                if (team.get(i).hpL!=0||team.get(j).hpL!=0) {
                    if(team.get(i).hpL/team.get(i).maxHp<team.get(j).hpL/team.get(j).maxHp){
                        index_damag=i;
                    }
                }
                
            }
        }

        
    }

    void healing(){

    }
    void protection(){

    }
    void attack(){
        
    }
}
