package oodproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class return_book_controller {
    
    String UserID,BookID;
    User borroweruser;
    Book borrowedbook;
    
    public return_book_controller() {
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
    
    public void returnbook(UserDB userdb,BooksInventory bookdb)
    {
        getbook(bookdb);
        getuser(userdb);
        bookcopy book = borroweruser.borrowedbook;
        book.setstatus(1);
        int x = Integer.parseInt(borrowedbook.Ncopies);
        x++;
        borrowedbook.Ncopies = Integer.toString(x);
        borroweruser.borrowedbook.name = " ";
        borroweruser.borrowedbook.ID = " ";
    }
    
    public void update(BooksInventory bookdb,UserDB bd)
    {
        returnbook(bd, bookdb);
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
