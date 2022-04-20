package org.example;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public abstract class Character implements ObjectAttack{
    protected int damage;
    protected String name;
    protected int health;

    public Character(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public void showCharacterInfo(){
        System.out.println("Nama   : "+name);
        System.out.println("Health : "+health);
        System.out.println("Damage : "+damage);
    }
    public boolean isDie(){
        if (health >  0){
            return true;
        }else if (health <= 0){
            return false;
        }
    }
    public void abstract attacked(int health){

    }
}
