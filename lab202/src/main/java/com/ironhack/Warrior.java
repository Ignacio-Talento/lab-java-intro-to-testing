package com.ironhack;

public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Elf convertToElf() {
        // Create a new Elf with the same health, strength, and lives
        // Default speed value set to force/2 (as an example conversion rule)
        Elf convertedElf = new Elf(getHealth(), getStrength(), getLives(), force / 2);

        return convertedElf;
    }
}
