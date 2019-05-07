
package oodproject;

import java.io.*;


public class remove_book_Controller {

    private String id;

    public remove_book_Controller() {
    }
    
    public void getData(String id) {
        this.id=id;
    }
    public Book search(BooksInventory bd)
    {
    for(int i=0;i<bd.myBooks.size();i++)
    {
    if(bd.myBooks.get(i).id.equals(id))
        return bd.myBooks.get(i);
    }
    return null;
    }
    public void delete(BooksInventory bd)
    {
        bd.myBooks.remove(search(bd));
        try
        {
        FileWriter fw=new FileWriter("myBooks.txt");
        PrintWriter pw=new PrintWriter(fw);
        bd.ShowMyBooks(pw);
        pw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}
