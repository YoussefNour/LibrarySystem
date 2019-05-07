package oodproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class remove_user_Controller {
    
    private String userID;
    
    public remove_user_Controller()
    {
        
    }
    
    public void getdata(String userID)
    {
        this.userID=userID;
    }
    
    public User search(UserDB bd)
    {
    for(int i=0;i<bd.myUsers.size();i++)
    {
    if(bd.myUsers.get(i).ID.equals(userID))
        return bd.myUsers.get(i);
    }
    return null;
    }
    public void delete(UserDB bd)
    {
        bd.myUsers.remove(search(bd));
        try
        {
        FileWriter fw=new FileWriter("myUsers.txt");
        PrintWriter pw=new PrintWriter(fw);
        bd.ShowMyUsers(pw);
        pw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
    
}
