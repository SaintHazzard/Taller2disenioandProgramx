

public  class tripulationSpacecraft extends classpacecraft implements methodSpacecraft{

    protected tripulationSpacecraft(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);
        this.tripulation = true;
        //TODO Auto-generated constructor stub
    }


     @Override
    public boolean checkedForTakeoff(String weather) {
        
        if ("Clear".equalsIgnoreCase(weather) && houstonAprove() && tripulationAprove()) {
            ignitionSecuence();
            takeoff();
        } else {
            // abortingSecuence();
        }
        return false;
    }

    
    





    
}
