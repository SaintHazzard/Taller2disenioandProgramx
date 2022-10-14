
import java.util.Scanner;


public abstract class classpacecraft {
    public String typeSpacecraft, typeFuel, country; 
    public int capacity, pushPower, weight;
    public boolean tripulation;
    String houstonAproveR;
    Scanner sn = new Scanner(System.in);


    protected classpacecraft(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        this.typeSpacecraft = typeSpacecraft;
        this.tripulation = true;
        this.pushPower = pushPower;
        this.weight = weight;
        this.typeFuel = typeFuel;
        this.country = country;
    }

    /**
     * Ignition secuence with a counter
     */
    public void ignitionSecuence() {
        int i = 10;
        while (i != 0) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
            i--;
        }
    }

    public boolean houstonAprove() {
        System.out.print("Houston aprove start count secuence? Y/N: ");
        houstonAproveR = sn.next();
        if ("Y".equalsIgnoreCase(houstonAproveR)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean tripulationAprove() {
        System.out.print("The tripulation confirm all ok? Y/N: ");
        String tripulationAprove = sn.nextLine();
        if ("Y".equalsIgnoreCase(tripulationAprove)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void takeoff() {
        System.out.println("The " + typeSpacecraft + " is taking off at " + java.time.LocalDateTime.now());

    }

    @Override
    public String toString() {
        return typeSpacecraft + " with " + pushPower + " Kg of push and its fuel is " + typeFuel + " of the country" + country;
    }

    
    

}
