package WorkingWithVariablesLevel4;

public class Opgave427 {
    public void main (String[] args) {
        int[] grade = {85, 92, 78, 88};

        int sum = grade[0] + grade[1] + grade[2] + grade[3];

        double average = sum / 4;
        System.out.println("Numbers of exams " + grade.length);
        System.out.println(average);

    }
}
