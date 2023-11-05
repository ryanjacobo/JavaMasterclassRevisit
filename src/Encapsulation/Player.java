package Encapsulation;

public class Player {
    // encapsulation is setting the fields to private instead of public
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health<=0){
            this.health = 1;
        }else if(health > 100){
            this.health = 100;
        }else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public Player(String name){
        this(name, 100, "Baseball bat");
    }
    public void loseHealth(int damage){
        health -= damage;
        if(health <= 0){
            System.out.println("Player died.");
        }
    }

    public int getHealth(){
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void restoreHealth(int heal){
        health += heal;
        if(health>100){
            System.out.println("Playered restored to 100%");
            health = 100;
        }
    }
}
