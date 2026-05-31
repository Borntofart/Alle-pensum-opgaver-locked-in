package WorkingWithControlStructuresLevel1;

public class Opgave113 {
    public void main (String[] args) {

        int age = 10;

        if ( age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("teen");
        } else if (age < 65) {
            System.out.println("adult");
        } else if (age >= 65) {
            System.out.println("senior");
        }

    }
}
