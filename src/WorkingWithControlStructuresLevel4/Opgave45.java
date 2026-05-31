package WorkingWithControlStructuresLevel4;

public class Opgave45 {
    public void main (String[] args) {

        int count = 0;
        int i = 1;
        while ( i <= 20) {
            if (i % 2 ==0) {
                count++;
            }
            i++;
        }
        System.out.println("Even numbers: " + count);

    }
}
