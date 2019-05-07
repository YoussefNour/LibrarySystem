package oodproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Borrow_book_controller {
    
    String UserID,BookID;
    User borroweruser;
    Book borrowedbook;
    
    public Borrow_book_controller()
    {
        
    }
    
    public void getdata(String UserID,String BookID)
    {
        this.BookID=BookID;
        this.UserID=UserID;
    }
    
    public void getuser(UserDB userdb)
    {
        for(int i=0;i<userdb.myUsers.size();i++)
        {
            if(userdb.myUsers.get(i).ID.equals(UserID))
            {
                borroweruser = userdb.myUsers.get(i);
                break;
            }
        }
    }
    
    public void getbook(BooksInventory bookdb)
    {
        for(int i=0;i<bookdb.myBooks.size();i++)
        {
            if(bookdb.myBooks.get(i).id.equals(BookID))
            {
                borrowedbook = bookdb.myBooks.get(i);
                break;
            }
        }
    }
    
    public void lendbook(BooksInventory bookdb,UserDB userdb)
    {
        getbook(bookdb);
        getuser(userdb);
        if(borroweruser == null)
        {
            System.out.println("user is null");
        }
        if(borrowedbook == null)
        {
            System.out.println("book is null");
        }
        bookcopy bookcopy= null;
        
        for(int i=0;i<borrowedbook.copies.size();i++)
        {
            if(borrowedbook.copies.get(i).status.equalsIgnoreCase("available"))
            {
                bookcopy = borrowedbook.copies.get(i);
            }
        }
        
        bookcopy.setstatus(0);
        int x = Integer.parseInt(borrowedbook.Ncopies);
        x--;
        borrowedbook.Ncopies = Integer.toString(x);
        borroweruser.borrowedbook = bookcopy;
    }
    
    public void update(BooksInventory bookdb,UserDB bd)
    {
        lendbook(bookdb, bd);
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
