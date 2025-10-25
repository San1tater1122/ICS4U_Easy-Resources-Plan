package model;

/**
 *
 * @author San1tater
 */

public class User {
    // Who can access?
    // public:                Same class, same package, subclass, other package
    // protected:             Same class, same package, subclass
    // (default) Not written: Same class, same package
    // private:               Same class
    protected short userID;
    protected String password;
    protected String userName;
    protected String role;

    public User(short userID, String password, String userName, String role){
        this.userID = userID;
        this.password = password;
        this.userName = userName;
        this.role = role;
    }

    public short getUserID(){return userID;}
    public String getUserName(){return userName;}
    public String getPassword(){return password;}
    public String getRole(){return role;}

    public void resetUserID(short newID){this.userID = newID;}
    public void resetUserName(String newName){this.userName = newName;}
    public void resetUserPassword(String newPassword){this.password = newPassword;}
    public void resetUserRole(String newRole){this.role = newRole;}

}