package com.narxoz.rpg.character.archetype;

public abstract class Warrior extends Character {
    protected Warrior(String name) {
        super(name);
    }

    @Override
    public String getArchetypeName() {
        return "Warrior";
    }
}