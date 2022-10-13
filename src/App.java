import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int eleccion, power, weight;
        boolean mode = true;
        spaceShuttle ss;
        tripulationSpacecraft ts;
        vantMaintenance vm;
        vantResearch vr;
        String name, fuel, country;
        ArrayList<Object> listSpacecraft = new ArrayList<>();

        
        
        while (mode) {
            System.out.println("1. Add and start space shuttler.");
            System.out.println("2. Add tripulation spacecraft.");
            System.out.println("3. Add VANT or ATV spacecraft.");
            System.out.println("4. Add VANT or ATV spacecraft.");
            System.out.println("5. Exit");
            eleccion = sn.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Nave of space shuttler: ");
                    name = sn.next();
                    System.out.println("Powerpush in kg: ");
                    power = sn.nextInt();
                    System.out.println("Weight kg: ");
                    weight = sn.nextInt();
                    System.out.println("Type fuel: ");
                    fuel = sn.next();
                    System.out.println("Country: ");
                    country = sn.next();                
                    ss = new spaceShuttle(name, power, weight, fuel, country);
                    listSpacecraft.add(ss);
                    ss.objetiveMission();
                    ss.checkedForTakeoff("Clear");
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    mode = false;
                    break;

                default:
                    break;
            }
        }

    }
}
