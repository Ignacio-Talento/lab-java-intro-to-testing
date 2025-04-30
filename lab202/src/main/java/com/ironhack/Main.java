package com.ironhack;

public class Main {
    public static void main(String[] args) {

        OddIntegers oddIntegers = new OddIntegers();

        System.out.println("Odd integers up to 1: " + oddIntegers.getOddIntegers(1));
        System.out.println("Odd integers up to 2: " + oddIntegers.getOddIntegers(2));
        System.out.println("Odd integers up to 10: " + oddIntegers.getOddIntegers(10));
        System.out.println("Odd integers up to 0: " + oddIntegers.getOddIntegers(0));
        System.out.println("Odd integers up to -5: " + oddIntegers.getOddIntegers(-5));

        KeywordChecker checker = new KeywordChecker();

        String[] testStrings = {
                "Don't break my heart",
                "I love to breakdance",
                "if you continue to break the rules, return home",
                "",
                "Hello World",
                "BREAK is not a keyword, but break is",
                "break is a keyword, but BREAK is not",
                "final answer is this",
                "this is my final",
                "void, and other keywords!"
        };

        for (String str : testStrings) {
            System.out.println("\"" + str + "\" contains Java keyword: " + checker.containsJavaKeyword(str));
        }

        // Create instances of each player type
        Warrior warrior = new Warrior(120, 25, 3, 80);
        Elf elf = new Elf(90, 15, 4, 50);
        Wizard wizard = new Wizard(70, 30, 2, "Fireball");

        System.out.println("=== INITIAL PLAYER STATS ===");
        System.out.println("Warrior: Health=" + warrior.getHealth() + ", Strength=" + warrior.getStrength() +
                ", Lives=" + warrior.getLives() + ", Force=" + warrior.getForce());
        System.out.println("Elf: Health=" + elf.getHealth() + ", Strength=" + elf.getStrength() +
                ", Lives=" + elf.getLives() + ", Speed=" + elf.getSpeed());
        System.out.println("Wizard: Health=" + wizard.getHealth() + ", Strength=" + wizard.getStrength() +
                ", Lives=" + wizard.getLives() + ", Spell=" + wizard.getSpell());

        // Convert Warrior to Elf
        Elf warriorElf = warrior.convertToElf();
        System.out.println("\n=== WARRIOR CONVERTED TO ELF ===");
        System.out.println("Elf (ex-Warrior): Health=" + warriorElf.getHealth() + ", Strength=" + warriorElf.getStrength() +
                ", Lives=" + warriorElf.getLives() + ", Speed=" + warriorElf.getSpeed());

        // Convert Wizard to Elf
        Elf wizardElf = wizard.convertToElf();
        System.out.println("\n=== WIZARD CONVERTED TO ELF ===");
        System.out.println("Elf (ex-Wizard): Health=" + wizardElf.getHealth() + ", Strength=" + wizardElf.getStrength() +
                ", Lives=" + wizardElf.getLives() + ", Speed=" + wizardElf.getSpeed());

        // Demonstrate combat
        System.out.println("\n=== BATTLE DEMONSTRATION ===");
        System.out.println("Wizard attacks Warrior:");
        wizard.attack(warrior);
        System.out.println("Warrior health after attack: " + warrior.getHealth());

        System.out.println("\nWarrior attacks Elf:");
        warrior.attack(elf);
        System.out.println("Elf health after attack: " + elf.getHealth());
        
    }
}