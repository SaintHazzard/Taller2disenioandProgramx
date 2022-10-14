

public class tripulationSpacecraft extends classpacecraft implements methodSpacecraft {
    
    int capacity;

    protected tripulationSpacecraft(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);
        this.tripulation = true;
        this.capacity = 0;
    }

    /*
     * max capacity for spacecraft
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    

    /**
     * Drop boths rocker shuttle when spacecraft get altitude over 120 miles
     */
    public void dropRockerShuttle() {
        int altitude = 0;
        while (altitude <= 120) {
            altitude = altitude + 10;
            try {
                Thread.sleep(800);
                System.out.println("Current altitude " + altitude + " miles");
                if (altitude > 120) {
                    System.out.println("Start secuence for drop rockets shuttle...");
                    System.out.println(
                            "****************************************************************************************************");
                    System.out.println(
                            "****************************************************************************************************");
                            System.out.println(
                            "****************************************************************************************************");
                }
                
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    /**
     * @param weather weather condition for approves take off
     * @return true If the whole list is OK
     */
    @Override
    public boolean checkedForTakeoff(String weather) {
        
        if ("y".equalsIgnoreCase(weather) && houstonAprove() && tripulationAprove()) {
            ignitionSecuence();
            takeoff();
            dropRockerShuttle();
        } else {
        System.out.println("Something is going wrong, deny sequence start");
    }
        return false;
    }

    /**
     * Ship's mission to accomplish
     */
    @Override
    public void objetiveMission() {
        System.out.println("take the crew to their target location");
        
    }

    
    





    
}
