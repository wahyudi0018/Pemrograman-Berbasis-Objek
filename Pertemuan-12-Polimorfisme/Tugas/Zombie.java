package Tugas;

public class Zombie implements Destroyable {
    protected int health, level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        health += 1;
    }

    public void destroyed() {
        health -= 1;
    }

    public String getZombieInfo() {
        String info = "";
        info += "Health = " + health + " \n";
        info += "Level = " + level + " \n";
        return info;
    }
}
