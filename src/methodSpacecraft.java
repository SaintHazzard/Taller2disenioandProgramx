/*
 * Represents the abstract methods.
 */
public interface methodSpacecraft {
    


    /**
     * @param weather weather condition for approves take off
     * @return true If the whole list is ok
     */
    public abstract boolean checkedForTakeoff(String weather);



    /**
     * Ship's mission to accomplish
     */
    public abstract void objetiveMission();

    
}
