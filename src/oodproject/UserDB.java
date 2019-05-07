package oodproject;

import java.io.*;
import java.util.ArrayList;

public class UserDB {

    protected ArrayList<User> myUsers = new ArrayList<>();

    public void ShowMyUsers(PrintWriter pw) {
        for (int i = 0; i < myUsers.size(); i++) {
            myUsers.get(i).printDetails(pw);
        }
    }

}
