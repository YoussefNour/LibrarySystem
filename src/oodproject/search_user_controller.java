/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodproject;
import javax.swing.JTable;
public class search_user_controller {
    User searchedUser;
    private void search(UserDB ub,String UserID)
    {
    for(int i=0;i<ub.myUsers.size();i++)
        {
            if(ub.myUsers.get(i).ID.equalsIgnoreCase(UserID))
            {
                searchedUser = ub.myUsers.get(i);
                break;
            }
        }
    }
    public void show(UserDB ub,JTable table,String UserID)
    {
        search(ub,UserID);
        for(int j=0;j<6;j++)
        {
        String value=null;
        switch(j)
        {
            case 0:
                value=searchedUser.name;
                break;
                  case 1:
                value=searchedUser.ID;
                break;
                  case 2:
                value=searchedUser.Address;
                break;
                  case 3:
                value=searchedUser.phone;
                break;
                 case 4:
                value=searchedUser.bookname;
                break;
                 case 5:
                value=searchedUser.bookid;
                break;
        }   
        table.setValueAt(value, 0, j);
        }
    }
}
