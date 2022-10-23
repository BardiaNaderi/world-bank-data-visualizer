package userInputObervers;

public interface Selector {
	
    void subscribe(Validator sub);
    void unsubscribe(Validator sub);
	void notifySubs();
    
}
