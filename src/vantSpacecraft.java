
public abstract class vantSpacecraft {
    public String typeSpacecraft, typeFuel, country; 
    public int capacity, pushPower, weight;
    public boolean tripulation;
    String houstonAproveR;
    

    protected vantSpacecraft(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        this.typeSpacecraft = typeSpacecraft;
        this.tripulation = true;
        this.pushPower = pushPower;
        this.weight = weight;
        this.typeFuel = typeFuel;
        this.country = country;
    }

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





    
}
