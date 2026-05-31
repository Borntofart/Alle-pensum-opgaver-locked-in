package WorkingWithControlStructuresLevel1;

public class Opgave119 {
    public void main (String[] args) {
        String correctPassword = "123";


        String attempt1 = "wrong";

        if (attempt1.equals(correctPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        String attempt2 = "Secret123";
        if (attempt2.equals(correctPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        String attempt3 = "123";
        if (attempt3.equals(correctPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }


    }
}
