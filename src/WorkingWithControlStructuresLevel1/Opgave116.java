package WorkingWithControlStructuresLevel1;

public class Opgave116 { //bruh man skal bare copy
    public void main (String[] args) {

        int score = 87;
        String grade;

        if ( score >= 90) {
            grade = "A";
            System.out.println("Grade er: " + grade);
        } else if (score>= 80) {
            grade = "B";
            System.out.println("Grade er: " + grade);
        } else if (score>= 70) {
            grade = "C";
            System.out.println("Grade er: " + grade);
        } else if (score >= 60) {
            grade = "D";
            System.out.println("Grade er: " + grade);
        } else {
            System.out.println("failed");
        }

    }
}
