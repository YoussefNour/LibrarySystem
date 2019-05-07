
package oodproject;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;
public class add_Book_Controller {
    private String name;
    private String price;
    private String id;
    private String copies;
    private Book b;
    public add_Book_Controller() {
        
    }
    public void getData(String name,String price,String id,String copies)
    {
    this.name=name;
    this.price=price;
    this.id=id;
    this.copies=copies;
    }
    public void createBook()
    {
    b =new Book(name,price,id,copies);
    }
    public void save(BooksInventory bd)
    {
    bd.myBooks.add(b);
        try
        {
        File fw=new File("myBooks.txt");
        PrintWriter pw=new PrintWriter(new FileWriter(fw,true));
        b.printDetails(pw);
        pw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        }
    
}
