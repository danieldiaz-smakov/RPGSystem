package com.narxoz.rpg.character;

public abstract class Mage extends Character {
    protected Mage(String name) {
        super(name);
    }

    @Override
    public String getArchetypeName() {
        return "Mage";
    }
}