

public class tripulationSpacecraft extends classpacecraft implements methodSpacecraft {
    
    int capacity;

    protected tripulationSpacecraft(String typeSpacecraft, int pushPower, int weight, String typeFuel, String country) {
        super(typeSpacecraft, pushPower, weight, typeFuel, country);
        this.tripulation = true;
        this.capacity = 0;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    

    public void dropRockerShuttle() {
        int altitude = 0;
        while (altitude <= 120) {
            altitude = altitude + 10;
            try {
                Thread.sleep(300);
                System.out.println("Current altitude " + altitude);
                if (altitude > 120) {
                System.out.println("Start secuence for drop rockets shuttle");}
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }


    @Override
    public boolean checkedForTakeoff(String weather) {
        
        if ("y".equalsIgnoreCase(weather) && houstonAprove() && tripulationAprove()) {
            ignitionSecuence();
            takeoff();
        } else {
        System.out.println("Something is going wrong, deny sequence start");
    }
        return false;
    }


    @Override
    public void objetiveMission() {
        System.out.println("take the crew to their target location");
        
    }

    
    





    
}
