package WorkingWithVariablesLevel4;

public class Opgave430 {
    public void main (String[] args) {
    String[] names = {"Anna", "Bob", "Carl", "Diana", "Eva"};
    int[] age = {28, 35, 42, 30, 38};
    int[] lønKR = { 45000, 52000, 58000, 48000, 51000};
    boolean[] fuldtid = {true, true, false, true, true};


    double averageSalary = (lønKR[0] + lønKR[1] + lønKR[2]) /3;
    double totalSalary = lønKR[0] + lønKR[1] + lønKR[2] + lønKR[3] + lønKR [4];




        System.out.println("Antal medarbejder: " + names.length);
        System.out.println("første navn: " + names[0] + " Sidste navn: " + names.length);
        System.out.println("gennemsnit første 3: " + averageSalary);
        System.out.println("Total salary: " + totalSalary);


    }
}
