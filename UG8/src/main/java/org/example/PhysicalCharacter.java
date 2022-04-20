package org.example;

public abstract class PhysicalCharacter extends Character{
    private int armor;

    public PhysicalCharacter(String name, int health, int damage, int armor){
        super(name, health, damage + armor);
    }
    @Override
    public void showCharacterInfo(){
        super.showCharacterInfo();
    }
    @Override
    public void attacked(int health){
        return health = damage - armor;
    }
}
