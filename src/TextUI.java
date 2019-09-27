
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivan.trajanovski
 */
public class TextUI {
    
    private Scanner reader;
    private Airplane planes;
    private Flight flights;

    public TextUI(Scanner reader, Airplane plane, Flight flights) {
        this.reader = reader;
        this.planes = plane;
        this.flights = flights;
    }
    
    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            
            String a = reader.nextLine();
            
            if(a.equals("x")) {
                
                System.out.println("Flight service");
                System.out.println("------------");
                System.out.println("Choose operation: ");
                System.out.println("[1] Print planes");
                System.out.println("[2] Print flights");
                System.out.println("[3] Print plane info");
                System.out.println("[x] Quit");
                System.out.print("> ");
                
                String aa = reader.nextLine();
                
                if(aa.equals("x")) {
                    break;
                } else if(aa.equals("1")) {
                    System.out.println(this.planes);
                } else if(aa.equals("2")) {
                    System.out.println(this.flights);
                } else if(aa.equals("3")) {
                    System.out.println("Give plane ID: ");
                    String com = reader.nextLine();
                    
                    System.out.println(this.planes.get(com));
                }
                
            } else if(a.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.print("Give plane capacity: ");
                int cap = Integer.parseInt(this.reader.nextLine());
                this.planes.add(id, cap);
                
           } else if(a.equals("2")) {
                System.out.println("Give plane ID: ");
                String planeId = this.reader.nextLine();
                System.out.println("Give departure airport code: ");
                String depCode = this.reader.nextLine();
                
                System.out.println("Give destination airport code:");
                String desCode = this.reader.nextLine();
                
                String construct = "(" + depCode + "-" + desCode + ")";
                
                this.flights.add(planeId + " " + construct);
           }
            
        }
    }
    
}
