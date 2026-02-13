package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.character.*;
import com.narxoz.rpg.factory.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment Demo ===\n");

        var paladinCreator = new PaladinCreator();
        var necroCreator = new NecromancerCreator();
        var bowmanCreator = new BowManCreator();

        var medieval = new MedievalEquipmentFactory();
        var magic = new MagicEquipmentFactory();
        var ranger = new RangerEquipmentFactory();

        // 1) разные типы персонажей
        var paladin = paladinCreator.create("Uther", medieval);
        printCharacter(paladin, medieval.getThemeName());

        var necro = necroCreator.create("Morbias", magic);
        printCharacter(necro, magic.getThemeName());

        var bowman = bowmanCreator.create("Robin", ranger);
        printCharacter(bowman, ranger.getThemeName());

        // 2) один и тот же тип персонажа с другой темой (демонстрация гибкости)
        var paladinAlt = paladinCreator.create("Uther (Alt Theme)", magic);
        printCharacter(paladinAlt, magic.getThemeName());
    }

    private static void printCharacter(Character c, String theme) {
        System.out.println("----------------------------------");
        System.out.println("Theme: " + theme);
        System.out.println(c.getStats());
        System.out.println("Weapon: " + (c.getWeapon() == null ? "None" : c.getWeapon().getWeaponInfo()));
        System.out.println("Armor: " + (c.getArmor() == null ? "None" : c.getArmor().getArmorInfo()));
        System.out.println("Ability: " + c.useSpecialAbility());
        System.out.println();
    }
}