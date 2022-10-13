

public class vantMaintenance extends vantSpacecraft {

    protected vantMaintenance(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, country);

    }

    public void missionOfMaintenance() {
        System.out.println("The " + typeSpacecraft + " is doing its maintenance objetive");
    }

    
    
}
