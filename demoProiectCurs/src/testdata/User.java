package testdata;

import utils.Reader;

public class User {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = "username";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;

    public User(String fileName){
        this.username = Reader.json(fileName).get("username").toString();
        this.password = Reader.json(fileName).get("password").toString();
    }
}
