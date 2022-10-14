import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int eleccion, power, weight, capacity;
        boolean mode = true;
        spaceShuttle ss;
        tripulationSpacecraft ts;
        vantMaintenance vm;
        vantResearch vr;
        String name, fuel, country, tscname, weather;
        ArrayList<Object> listSpacecraft = new ArrayList<>();

        while (mode) {
            System.out.println("1. Add and launch space shuttler.");
            System.out.println("2. Add tripulation spacecraft.");
            System.out.println("3. Add ATV maintenance spacecraft.");
            System.out.println("4. Add VANT or ATV spacecraft.");
            System.out.println("5. List all Spacecraft");
            System.out.println("6. Exit");
            eleccion = sn.nextInt();

            switch (eleccion) {
                case 1:
                    tscname = "Space Shuttler.";
                    System.out.println("Name of " + tscname);
                    name = sn.next();
                    System.out.print("Powerpush in kg: ");
                    power = sn.nextInt();
                    System.out.print("Weight kg: ");
                    weight = sn.nextInt();
                    System.out.print("Type fuel: ");
                    fuel = sn.next();
                    System.out.print("Country: ");
                    country = sn.next();
                    ss = new spaceShuttle(name, power, weight, fuel, country);
                    listSpacecraft.add(ss);
                    ss.objetiveMission();
                    System.out.print("Weather is clear? Y/N");
                    weather = sn.next();
                    ss.checkedForTakeoff(weather);
                    break;
                    
                case 2:
                    tscname = "tripulation Spacecraft.";
                    System.out.print("Name of "+tscname);
                    name = sn.next();
                    System.out.print("Powerpush in kg: ");
                    power = sn.nextInt();
                    System.out.print("Weight kg: ");
                    weight = sn.nextInt();
                    System.out.print("Type fuel: ");
                    fuel = sn.next();
                    System.out.print("Country: ");
                    country = sn.next();
                    ts = new tripulationSpacecraft(name, power, weight, fuel, country);
                    System.out.print("Capacity: ");
                    capacity = sn.nextInt();
                    ts.setCapacity(capacity);
                    listSpacecraft.add(ts);
                    ts.objetiveMission();
                    System.out.print("Weather is clear? Y/N: ");
                    weather = sn.next();
                    ts.checkedForTakeoff(weather);
                    break;
                case 3:
                    tscname = "maintenance Spacecraft.";
                    System.out.print("Name of " + tscname);
                    name = sn.next();
                    System.out.print("Powerpush in kg: ");
                    power = sn.nextInt();
                    System.out.print("Weight kg: ");
                    weight = sn.nextInt();
                    System.out.print("Type fuel: ");
                    fuel = sn.next();
                    System.out.print("Country: ");
                    country = sn.next();
                    vm = new vantMaintenance(name, power, weight, fuel, country);
                    System.out.print("Capacity: ");
                    capacity = sn.nextInt();
                    listSpacecraft.add(vm);
                    vm.objetiveMission();
                    break;
                case 4:
                    tscname = "Research Spacecraft.";
                    System.out.print("Name of " + tscname);
                    name = sn.next();
                    System.out.print("Powerpush in kg: ");
                    power = sn.nextInt();
                    System.out.print("Weight kg: ");
                    weight = sn.nextInt();
                    System.out.print("Type fuel: ");
                    fuel = sn.next();
                    System.out.print("Country: ");
                    country = sn.next();
                    vr = new vantResearch(name, power, weight, fuel, country);
                    listSpacecraft.add(vr);
                    vr.objetiveMission();
                    System.out.print("Weather is clear? Y/N");
                    weather = sn.next();
                    vr.checkedForTakeoff(weather);
                    break;
                case 5:
                    for (Object valObject : listSpacecraft) {
                        System.out.println(valObject);
                    }
                    break;
                case 6:
                    mode = false;

                default:
                    System.out.println("Opcion no valida, elija una opcion valida.");
                    break;
            }
        }

    }

}
