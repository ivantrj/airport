
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ivan.trajanovski
 */
public class Flight {
    
    private ArrayList<String> flights;

    public Flight() {
        this.flights = new ArrayList<String>();
    }
    
    public void add(String entry) {
        this.flights.add(entry);
    }

    @Override
    public String toString() {
        String buffer = "";
        
        for(String i : this.flights) {
            buffer += i + "\n";
        }
        return buffer;
    }
    
    
    
}
