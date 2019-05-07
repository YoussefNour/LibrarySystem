package oodproject;

import javax.swing.JTable;

public class show_books_Controller {
    public void show(BooksInventory bd,JTable table)
    {
    for(int i=0;i<bd.myBooks.size();i++)
        {
        for(int j=0;j<4;j++)
        {
        String value=null;
        switch(j)
        {
            case 0:
                value=bd.myBooks.get(i).name;
                break;
                  case 1:
                value=bd.myBooks.get(i).id;
                break;
                  case 2:
                value=bd.myBooks.get(i).price;
                break;
                  case 3:
                value=bd.myBooks.get(i).Ncopies;
                break;
        }   
        table.setValueAt(value, i, j);
        }
        }
    }
}
