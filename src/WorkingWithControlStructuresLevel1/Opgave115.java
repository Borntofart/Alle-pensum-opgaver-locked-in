package WorkingWithControlStructuresLevel1;

public class Opgave115 {
    public void main (String[] args) {

        int age = 25;

        if (age <12) {
            System.out.println("50 kr");
        } else if (age <18) {
            System.out.println("75 kr");
        } else if (age < 65) {
            System.out.println("100 kr");
        } else if (age >= 65) {
            System.out.println("60 kr");
        }

    }
}
