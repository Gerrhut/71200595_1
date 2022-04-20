package org.example;

public abstract class MagicCharacter extends Character{
    private int mana;

    public MagicCharacter(String name, int health, int damage, int armor){

    }
    public void attacked(int health){
        int Hitunghealth = health-damage;
        health = Hitunghealth;
    }
    public void showCharacter(){

    }
}
