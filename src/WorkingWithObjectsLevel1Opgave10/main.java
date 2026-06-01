package WorkingWithObjectsLevel1Opgave10;

public class main {
    public void main (String[] args) {
        enemy enemy = new enemy("orc", 20, 20);

        System.out.println(enemy.health);

        enemy.takedamage(enemy,20);

        System.out.println(enemy.health);


    }
}
