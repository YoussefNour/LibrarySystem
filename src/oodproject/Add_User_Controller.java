package oodproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Add_User_Controller {

    private String userName;
    private String userID;
    private String userAddress;
    private String userPhone;
    private User user;

    public Add_User_Controller() {

    }

    public void getData(String userName, String userID, String userAddress, String userPhone) {
        this.userName = userName;
        this.userID = userID;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    public void createUser() {
        user = new User(userName, userID, userAddress, userPhone, "", "");
    }

    public void save(UserDB bd) {
        bd.myUsers.add(user);
        try {
            File fw = new File("myUsers.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(fw, true));
            user.printDetails(pw);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
