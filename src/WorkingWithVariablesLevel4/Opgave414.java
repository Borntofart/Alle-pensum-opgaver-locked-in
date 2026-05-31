package WorkingWithVariablesLevel4;

public class Opgave414 {
    public void main (String[] args) {
        double[] prices = {15.50, 22.00, 8.75, 12.50};
        double total = 0.0;


        for (double p : prices) {
            total = total + p;
            System.out.println(total);

        }

    }
}
