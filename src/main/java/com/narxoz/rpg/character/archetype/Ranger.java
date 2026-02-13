package com.narxoz.rpg.character.archetype;

public abstract class Ranger extends com.narxoz.rpg.character.Character {
    protected Ranger(String name) {
        super(name);
    }

    @Override
    public String getArchetypeName() {
        return "Ranger";
    }
}