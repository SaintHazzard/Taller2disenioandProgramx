import java.util.Scanner;

public class vantResearch extends vantSpacecraft implements methodSpacecraft {
    String houstonAproveR;
    Scanner sn = new Scanner(System.in);
    protected vantResearch(String typeSpacecraft, int pushPower, int weight,String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);

    }
    

    /**
     * ATV research execute tasks
     */
    public void newCalibration() {
        System.out.println(typeSpacecraft + "is calibrating its sensors and mirrors.");
    }
    
    /**
     * ATV research execute tasks
     */
    public void stanbyCharge() {
        System.out.println(typeSpacecraft + "is in lower usage. Stany mode ON.");
    }


    @Override
    public boolean checkedForTakeoff(String weather) {
        if ("Y".equalsIgnoreCase(weather) && houstonAprove()) {
            System.out.println("Starting mission");
            newCalibration();
        }
        return false;
    }
    
    public boolean houstonAprove() {
        System.out.print("Houston aprove start mision secuence? Y/N: ");
        houstonAproveR = sn.next();
        if ("Y".equalsIgnoreCase(houstonAproveR)) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void objetiveMission() {
        System.out.println(typeSpacecraft + " is focusing early universe");
        
    }
}
