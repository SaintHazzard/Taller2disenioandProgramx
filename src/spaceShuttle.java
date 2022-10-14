public class spaceShuttle extends classpacecraft implements methodSpacecraft {

    public spaceShuttle(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);
        this.tripulation = false;
    }

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

    @Override
    public void objetiveMission() {
        System.out.println("Carry cargo into space");
    }

    public void dontStartSecuence() {
        System.out.println("Houston deny sequence start");
    }

    

    
}


    



