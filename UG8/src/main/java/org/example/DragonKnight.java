package org.example;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    private int dragonFormAttack;

    public DragonKnight(){
        String name = "Dragon Knight";
        int health = 1800;
        int damage = 95;
        int armor = 50;
    }

    public void skill(){

    }

    public void attack(Character){
        if (dragonFormAttack > 0 ){
            LegionCommaner()
        }
    }
}
