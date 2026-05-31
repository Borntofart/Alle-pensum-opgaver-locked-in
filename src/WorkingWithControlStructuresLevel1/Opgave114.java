package WorkingWithControlStructuresLevel1;

public class Opgave114 {
    public void main (String[] args) {

        int temp = 22;
        if ( temp < 0) {
            System.out.println("Freez");
        } else if (temp < 15) {
            System.out.println("Cold");
        } else if (temp < 25) {
            System.out.println("Comfy");
        } else if (temp >= 25) {
            System.out.println("Hot");
        }


    }
}
