public class spaceShuttle extends classpacecraft implements methodSpacecraft {

    public spaceShuttle(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);
        this.tripulation = false;
    }

    

    @Override
    public boolean checkedForTakeoff(String weather) {
            
        if (weather == "Clear" && houstonAprove()) {
            ignitionSecuence();
            takeoff();
        } else {
            // abortingSecuence();
        }
        return false;
    }

    




    
    
}
