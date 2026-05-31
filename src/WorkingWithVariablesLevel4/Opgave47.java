package WorkingWithVariablesLevel4;

public class Opgave47 {
    public void main (String[] args) {

        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        String firstElement = colors[1];
        String fourthElement = colors[3];

        System.out.println(firstElement);
        System.out.println(fourthElement);

        for (String c : colors) {
            System.out.println(c);
        }
    }
}
