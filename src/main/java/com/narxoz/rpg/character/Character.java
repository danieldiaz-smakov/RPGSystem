package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class Character {
    protected String name;

    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected int dexterity;

    protected Weapon weapon;
    protected Armor armor;

    protected Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalDamage() {
        return weapon == null ? 0 : weapon.getDamage();
    }

    public int getTotalDefense() {
        return armor == null ? 0 : armor.getDefense();
    }

    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getStats() {
        return ""
                + "Name: " + name + "\n"
                + "Class: " + getClassName() + " (" + getArchetypeName() + ")\n"
                + "HP: " + health + ", Mana: " + mana + "\n"
                + "STR: " + strength + ", INT: " + intelligence + ", DEX: " + dexterity + "\n"
                + "DMG: " + getTotalDamage() + ", DEF: " + getTotalDefense();
    }

    public abstract String getClassName();
    public abstract String getArchetypeName();
    public abstract String useSpecialAbility();
}
