package WorkingWithControlStructuresLevel1;

public class Opgave121 {
    public void main (String[] args) {
        String command = "start";

        if (command.equals("start")) {
            System.out.println("starting");
        }

        if (command.equals("stop")) {
            System.out.println("Stopping");
        }

        if (command.equals("pause")) {
            System.out.println("pausing ");
        }else {
            System.out.println("unknown command");
        }




    }
}
