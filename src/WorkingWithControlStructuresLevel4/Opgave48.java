package WorkingWithControlStructuresLevel4;

public class Opgave48 {
    public void main (String[] arg) {

        int i = 10;
        int count = 0;

        while (i >= 1) {

            count++;
            i--;
            System.out.println(i);
        }

        System.out.println("Numbers counted down from are " + count);

    }
}
