package WorkingWithControlStructuresLevel4;

public class Opgave46 {
    public void main (String[] arg) {

        int count = 0;
        int i = 1;

        while (i <= 30) {
            if (i % 3 == 0) {
                count ++;
            }
            i++;
        }
        System.out.println(count);
    }
}
