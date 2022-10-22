package login;
public class User {

    private String name;
    private int id;
    private String email;
    private String pass;

    /**
     * User constructor
     * 
     * @param name,  string name value that is passed from user input
     * @param id,    int id value that is passed idCount method
     * @param email, string email value that is passed from user input
     * @param pass,  string password value that is passed from user input
     */
    public User(String name, int id, String email, String pass) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.pass = pass;
    }

    /**
     * Getter method for name value
     * 
     * @return name, string value
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for id value
     * 
     * @return id, int value
     */
    public int getId() {
        return id;
    }

    /**
     * getter method for email value
     * 
     * @return email, string value
     */
    public String getEmail() {
        return email;
    }

    /**
     * getter method for password value
     * 
     * @return pass, string value
     */
    public String getPassword() {
        return pass;
    }
}
