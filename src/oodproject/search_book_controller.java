/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodproject;
import javax.swing.JTable;
public class search_book_controller {
    Book searchedBook;
    private void search(BooksInventory bookdb,String BookID)
    {
    for(int i=0;i<bookdb.myBooks.size();i++)
        {
            if(bookdb.myBooks.get(i).id.equals(BookID))
            {
                searchedBook = bookdb.myBooks.get(i);
                break;
            }
        }
    }
    public void show(BooksInventory bookdb,JTable table,String BookID)
    {
        search(bookdb,BookID);
        for(int j=0;j<4;j++)
        {
        String value=null;
        switch(j)
        {
            case 0:
                value=searchedBook.name;
                break;
                  case 1:
                value=searchedBook.id;
                break;
                  case 2:
                value=searchedBook.price;
                break;
                  case 3:
                value=searchedBook.Ncopies;
                break;
        }   
        table.setValueAt(value, 0, j);
        }
    }
}
