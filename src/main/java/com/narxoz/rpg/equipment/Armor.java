package com.narxoz.rpg.equipment;

public interface Armor {
    String getName();
    int getDefense();
    ArmorType getArmorType();

    default String getArmorInfo() {
        return getName() + " [" + getArmorType() + "], DEF=" + getDefense();
    }
}