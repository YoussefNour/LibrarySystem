
package oodproject;

import java.io.*;
import java.util.ArrayList;

public class BooksInventory {
        protected ArrayList<Book> myBooks=new ArrayList<>();
        public void ShowMyBooks(PrintWriter pw)
    {
    for(int i=0;i<myBooks.size();i++)
    {
    myBooks.get(i).printDetails(pw);
    }
    }
        
}
