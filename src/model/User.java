package model;

public class User {
    // Who can access?
    // public:                Same class, same package, subclass, other package
    // protected:             Same class, same package, subclass
    // (default) Not written: Same class, same package
    // private:               Same class
    protected short userID;
    protected String email;
    protected String password;

    public User(short userID, String email, String password){
        this.userID = userID;
        this.email = email;
        this.password = password;
    }

    public short getUserID(){return userID;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}

    public void resetUserID(short newID){this.userID = newID;}
    public void resetUserEmail(String newEmail){this.email = newEmail;}
    public void resetUserPassword(String newPassword){this.password = newPassword;}

}