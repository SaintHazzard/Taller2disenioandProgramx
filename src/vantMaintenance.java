

public class vantMaintenance extends vantSpacecraft implements methodSpacecraft {

    protected vantMaintenance(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);

    }


    @Override
    public boolean checkedForTakeoff(String weather) {
        // TODO Auto-generated method stub
        return false;
    }
    
    /**
     * Ship's mission to accomplish
     */
    @Override
    public void objetiveMission() {
        System.out.println("The " + typeSpacecraft + " is doing its maintenance objetive");        
    }

    
    
}
