package com.mycompany.app.Users.users;

public class UserMaster extends User{
    public UserMaster(){
        description = "Usuario Master";
    }

    private static UserMaster uniqueInstance = new UserMaster();
 public static UserMaster getInstance() {
     if (uniqueInstance == null) {
         uniqueInstance = new UserMaster();
     }
     return uniqueInstance;
 }

    public double price() {
        return 50.0;
    }
}