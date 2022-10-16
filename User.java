public class User {

    private String name;
    private int id;
    private String email;
    private String pass;

    public User(String name, int id, String email, String pass) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return pass;
    }
}
