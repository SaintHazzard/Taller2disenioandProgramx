/*
 * Represents a type of spaceship, which is the space shuttle
 */
public class spaceShuttle extends classpacecraft implements methodSpacecraft {


    public spaceShuttle(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);
        this.tripulation = false;
    }

    /**
     * @param weather weather condition for approves take off
     * @return true If the whole list is ok
     */
    @Override
    public boolean checkedForTakeoff(String weather) {

        if ("y".equalsIgnoreCase(weather) && houstonAprove()) {
            ignitionSecuence();
            takeoff();
            return true;
        } else {
            dontStartSecuence();
        }
        return false;
    }

    /**
     * Ship's mission to accomplish
     */
    @Override
    public void objetiveMission() {
        System.out.println("Carry cargo into space");
    }

    /*
     * Abort secuence of ignition if something in list isnt ok
     */
    public void dontStartSecuence() {
        System.out.println("Houston deny sequence start");
    }

    

    
}


    



