
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airplane planes = new Airplane();
        Flight flights = new Flight();
        
        TextUI ui = new TextUI(reader, planes, flights);
        ui.start();
        
        
    }
}
