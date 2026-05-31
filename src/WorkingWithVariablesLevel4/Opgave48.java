package WorkingWithVariablesLevel4;

public class Opgave48 {
    public void main (String[] args) {
    double[] prices = {15.50, 22.00, 8.75};

    double firstprice = prices[0];
    double secondPrice = prices[1];
    double sumFirstTwo = firstprice + secondPrice;

        System.out.println("Sum first two: " + sumFirstTwo);

        for (double p :prices) {
            System.out.println(p);
        }

    }
}
