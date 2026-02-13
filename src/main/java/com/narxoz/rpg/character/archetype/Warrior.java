package com.narxoz.rpg.character.archetype;

public abstract class Warrior extends com.narxoz.rpg.character.Character {
    protected Warrior(String name) {
        super(name);
    }

    @Override
    public String getArchetypeName() {
        return "Warrior";
    }
}