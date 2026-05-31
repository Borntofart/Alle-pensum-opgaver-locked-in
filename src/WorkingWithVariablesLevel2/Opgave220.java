package WorkingWithVariablesLevel2;

public class Opgave220 {
    public void main (String[] args) {
        double pris = 200.0;
        double rabatprocent = 15.0;
        double rabatBeløb = pris * (rabatprocent / 100.0);

        System.out.println(rabatBeløb);

        double endeligPris= pris - rabatBeløb;
        System.out.println(endeligPris);

    }
}
