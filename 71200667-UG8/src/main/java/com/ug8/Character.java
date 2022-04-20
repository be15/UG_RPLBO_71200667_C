package com.ug8;

public abstract class Character implements ObjectAttack {
    protected int damage;
    protected String name;
    protected int health;
    public void showCharacterInfo(){

    }
    public boolean isDie(){
        if(health <= 0){
            return True;
        }else{
            return False;
        }
    }
    public void attacked(int){

    }
}
