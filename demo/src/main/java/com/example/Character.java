package com.example;

public abstract class Character{
    protected Weapon weapon;
    public Character(Weapon weapon){
        this.weapon = weapon;
    }
    public abstract String sayName();
    public String attack(){
        return weapon.attack();
    }
}
