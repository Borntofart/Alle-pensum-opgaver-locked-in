package WorkingWithVariablesLevel2;

public class Opgave213 {
    public void main (String[] args) {
        int pizzaStykker = 15;
        int antalPersoner = 4;

        int stykkerPerPerson = pizzaStykker / antalPersoner;

        System.out.println(stykkerPerPerson);

        int stykkerTilOver=pizzaStykker%antalPersoner;
        System.out.println(stykkerTilOver);


    }
}
