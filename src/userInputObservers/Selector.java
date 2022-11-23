package userInputObservers;

public interface Selector {
	
	/**
	 * A method for adding new subscribers
	 * @param sub the subscriber to be added
	 */
    void subscribe(Validator sub);
    
    /**
     * A method for removing subscribers
     * @param sub the subscriber to be removed
     */
    void unsubscribe(Validator sub);
    
    /**
     * A method to communicate to all subscribers at once
     */
	void notifySubs();
    
}
