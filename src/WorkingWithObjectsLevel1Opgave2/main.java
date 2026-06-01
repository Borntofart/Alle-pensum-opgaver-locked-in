package WorkingWithObjectsLevel1Opgave2;

public class main {
    public void main (String[] args) {

        item item = new item( "Sword", 150, 2);
        item potion = new item ("Potion", 50, 1);

        System.out.println(item.name );
        System.out.println(potion.name);

        int total = item.price + potion.price;

        System.out.println(total);


    }
}
