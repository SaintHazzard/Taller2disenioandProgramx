
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
 * Represents the abstract main class, SUPERCLASS
 */
public abstract class classpacecraft {
    public String typeSpacecraft, typeFuel, country; 
    public int capacity, pushPower, weight;
    public boolean tripulation;
    String houstonAproveR, tripulationAprove;
    Scanner sn = new Scanner(System.in);


    /**
     * @param typeSpacecraft name for space craft
     * @param pushPower spacecraft thrust power
     * @param weight spacecraft weight in launch
     * @param typeFuel What fuel is this.
     * @param country country owner of spacecraft
     */
    protected classpacecraft(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        this.typeSpacecraft = typeSpacecraft;
        this.tripulation = true;
        this.pushPower = pushPower;
        this.weight = weight;
        this.typeFuel = typeFuel;
        this.country = country;
    }

    /**
     * Ignition secuence with a counter from 10
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

    /*
     * houston or control tower approves or not secuence ignition
     */
    public boolean houstonAprove() {
        System.out.print("Houston approves start count secuence? Y/N: ");
        houstonAproveR = sn.next();
        if ("Y".equalsIgnoreCase(houstonAproveR)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Tripulation approves or not secuence ignition
     */
    public boolean tripulationAprove() {
        System.out.print("The tripulation confirm all ok? Y/N: ");
        tripulationAprove = sn.next();
        if ("Y".equalsIgnoreCase(tripulationAprove)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Register when Space craft is taking off
     */
    public void takeoff() {
        System.out.println("The " + typeSpacecraft + " is taking off at "
                + (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime())));

    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString() format for to list spacecraft
     */
    @Override
    public String toString() {
        return typeSpacecraft + " with " + pushPower + " Kg of push and its fuel is " + typeFuel + " of the country" + country;
    }

    
    

}
