package oodproject;

import javax.swing.JTable;

public class show_users_controller {
    
    public void show(UserDB bd,JTable table)
    {
        for(int i=0;i<bd.myUsers.size();i++)
            {
                for(int j=0;j<6;j++)
                {
                    String value=null;
                    switch(j)
                    {
                        case 0:
                            value=bd.myUsers.get(i).name;
                            break;
                        case 1:
                            value=bd.myUsers.get(i).ID;
                            break;
                        case 2:
                            value=bd.myUsers.get(i).Address;
                            break;
                        case 3:
                            value=bd.myUsers.get(i).phone;
                            break;
                        case 4:
                            value=bd.myUsers.get(i).borrowedbook.name;
                            break;
                        case 5:
                            value=bd.myUsers.get(i).borrowedbook.ID;
                            break;
                    }      
                    table.setValueAt(value, i, j);
                }
            }
    }
}
