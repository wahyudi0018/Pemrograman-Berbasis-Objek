package Tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += health * 0.3;
        } else if (level == 2) {
            health += health * 0.4;
        } else if (level == 3) {
            health += health * 0.5;
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data = \n";
        info += super.getZombieInfo();
        return info;
    }
}
