package WorkingWithVariablesLevel4;

public class Opgave429 {
    public void main (String[] args) {

        String[] products = {"Kort", "Laptop" , "Sengelan"};
        double[] price = {15.50,22.50,100};

        double cheap = price [0];
        double expensive = price [2];
        System.out.println("Cheapest " + cheap +  " " + products[0]);
        System.out.println("Expensive " + expensive + " " + products[2]);


    }
}
