package com.company;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = " bee";
//        player.health = 20;
//        player.weapon = " sword";
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println("remaing health = " + player.healthRemaining());
//         damage = 25;
//        player.loseHealth(damage);
//
//        System.out.println("remaing health = " + player.healthRemaining() + " and the weapon used is" + player.weapon);
        InhancedPlayer player = new InhancedPlayer("bea", 240, " gun");
        System.out.println( " initial health is "+ player.getHealth());


    }
}
