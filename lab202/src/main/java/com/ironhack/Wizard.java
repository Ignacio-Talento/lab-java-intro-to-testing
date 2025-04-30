package com.ironhack;

public class Wizard extends Player {
    private String spell;

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Elf convertToElf() {
        // Create a new Elf with the same health, strength, and lives
        // Default speed value based on spell length (as an example conversion rule)
        Elf convertedElf = new Elf(getHealth(), getStrength(), getLives(), spell.length() * 2);

        return convertedElf;
    }
}
