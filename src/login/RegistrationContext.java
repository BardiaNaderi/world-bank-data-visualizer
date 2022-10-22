package login;
public class RegistrationContext implements State {

    private State registrationState;

    /**
     * setState method to set the state of the registration method
     * 
     * @param state, the method of registration picked by the user
     */
    public void setState(State state) {
        this.registrationState = state;
    }

    /**
     * getState method to get the current state of the object
     * 
     * @return object's current registration state
     */
    public State getState() {
        return this.registrationState;
    }

    /**
     * doAction method to call the doAction method of that specific registration
     * state
     */
    @Override
    public void doAction() {
        this.registrationState.doAction();
    }
}
