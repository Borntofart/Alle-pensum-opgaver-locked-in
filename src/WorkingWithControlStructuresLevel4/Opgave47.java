package WorkingWithControlStructuresLevel4;

public class Opgave47 {
    public void main (String[] args) {
    int number =12345;
    int count = 0;

    while (number >0) {
        count++;
        number = number / 10;
    }
        System.out.println("Digits " + count);


    }
}
