package WorkingWithControlStructuresLevel3;

public class Opgave38 {
    public void main (String[] args) {

        String operation ="add";
        int a = 10;
        int b = 5;

        int result;

        switch (operation) {
            case "add":
                result = a + b;
                System.out.println(result);
                break;
            case "substract":
                System.out.println(a-b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case "divide":
                System.out.println(a/b);
                break;
        }



    }
}
