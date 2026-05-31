package WorkingWithControlStructuresLevel3;

public class Opgave311 {
    public void main (String[] args) {
        char grade = 'C';


        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("good");
                break;
            case 'C':
            case 'D':
                System.out.println("poor");
                break;
            case 'F':
                System.out.println("FAILED");
                break;

        }

    }
}
