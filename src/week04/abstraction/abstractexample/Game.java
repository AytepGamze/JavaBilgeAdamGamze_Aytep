package week04.abstraction.abstractexample;

public class Game {
     public static void main(String[] args) {

    Enemy goblin= new Goblin();
    Enemy zombie= new Zombie();
        System.out.println(zombie.health);
        goblin.attack();
        zombie.attack();
        zombie.takeDamage(20);
        zombie.takeDamage(30);
        zombie.takeDamage(60);
}
}
