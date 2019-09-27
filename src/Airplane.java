
import java.util.ArrayList;
import java.util.HashMap;



/**
 *
 * @author ivan.trajanovski
 */
public class Airplane {
    
    private HashMap<String, Integer> planes;

    public Airplane() {
        this.planes = new HashMap<String, Integer>();
    }
    
    public void add(String ID, int cap) {
        this.planes.put(ID, cap);
    }

    public String get(String id) {
        return id + " (" + this.planes.get(id) + " ppl)";
    }
    
    

    @Override
    public String toString() {
        String n = "";
        
        for(String i : this.planes.keySet()) {
            n += i + " (" + this.planes.get(i) + " ppl)\n";
        }
        return n;
    }
            
    
    
}
