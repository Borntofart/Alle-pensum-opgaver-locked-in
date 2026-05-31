package WorkingWithControlStructuresLevel3;

public class Opgave34 {
    public void main (String[] args) {
        String command = "start";

        switch (command) {
            case "start":
                System.out.println("start");
                break;
            case "stop":
                System.out.println("stop");
                break;
            case "pause":
                System.out.println("pausing");
                break;
        }
    }
}
