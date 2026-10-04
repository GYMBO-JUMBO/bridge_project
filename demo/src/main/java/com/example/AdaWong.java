package com.example;

public class AdaWong extends Character{
    public AdaWong(Weapon weapon){
        super(weapon);
    }
    @Override 
    public String sayName(){
        return "Ada Wong is here.";
    }
}
