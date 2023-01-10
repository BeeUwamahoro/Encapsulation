package com.company;

public class InhancedPlayer {
// Encapsulation is used to change data in one class without affecting the other class
    private String name;
    private int health=200;
    private String weaponofChoice;

    public InhancedPlayer(String name, int health, String weaponofChoice) {
        this.name = name;
        if (health > 0 && health <=200){
            this.health = health;
        }
        this.weaponofChoice = weaponofChoice;
    }
    public void loseHealth(int damage){
        this.health = this.health-damage;
        if (this.health <=0){
            System.out.println("player knocked out"); // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }
}
