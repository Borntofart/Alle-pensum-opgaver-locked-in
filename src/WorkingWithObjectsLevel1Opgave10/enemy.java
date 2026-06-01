package WorkingWithObjectsLevel1Opgave10;

public class enemy {
    String name;
    int health;
    int damage;

    public enemy (String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    void printEnemy(enemy e) {
        System.out.println("name " + name);
        System.out.println("health " + health);
        System.out.println("damage " +damage);
    }

    void takedamage(enemy e, int damage){
        e.health = e.health -damage;
    }


}
