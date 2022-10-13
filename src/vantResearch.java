public class vantResearch extends vantSpacecraft {

    protected vantResearch(String typeSpacecraft, int pushPower, int weight, String country) {
        super(typeSpacecraft, pushPower, weight, country);

    }
    

    public void newCalibration() {
        System.out.println(typeSpacecraft + "is calibrating its sensors and mirrors.");
    }
    
    public void stanbyCharge() {
        System.out.println(typeSpacecraft + "is in lower usage. Stany mode ON.");
    }
}
