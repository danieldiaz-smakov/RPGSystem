package com.narxoz.rpg.equipment;

public interface Weapon {
    String getName();
    int getDamage();
    WeaponType getWeaponType();

    default String getWeaponInfo() {
        return getName() + " [" + getWeaponType() + "], DMG=" + getDamage();
    }
}
