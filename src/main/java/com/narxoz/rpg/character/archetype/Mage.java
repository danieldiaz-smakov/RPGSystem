package com.narxoz.rpg.character.archetype;

public abstract class Mage extends com.narxoz.rpg.character.Character {
    protected Mage(String name) {
        super(name);
    }

    @Override
    public String getArchetypeName() {
        return "Mage";
    }
}