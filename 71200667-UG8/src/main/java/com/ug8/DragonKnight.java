package com.ug8;

public abstract class DragonKnight extends PhysicalCharacter implements NoTargetSkill {
    public DragonKnight();
    private int dragonFormAttack;

    @Override
    public void skill() {
        return dragonFormAttack(2);
    }
    public void attack(Character){
        if(dragonFormAttack > 0)
            return damage + 90;
    }
}
