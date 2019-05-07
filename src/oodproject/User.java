package oodproject;

import java.util.*;
import java.io.*;

public class User {

    protected String name;
    protected String ID;
    protected String Address;
    protected String phone;
    protected bookcopy borrowedbook;
    protected String bookname;
    protected String bookid;
    public User(String Name, String ID, String Address, String phone, String bookname, String bookid) {
        this.name = Name;
        this.ID = ID;
        this.Address = Address;
        this.phone = phone;
        this.bookname=bookname;
        this.bookid=bookid;
        borrowedbook = new bookcopy(bookname, bookid);
    }

    public void printDetails(PrintWriter pw) {
        if (pw == null) {
            System.out.println("Name :  " + name);
            System.out.println("ID :  " + ID);
            System.out.println("Address :  " + Address);
            System.out.println("Phone :  " + phone);
            System.out.println("Book name :  " + borrowedbook.name);
            System.out.println("Book ID :  " + borrowedbook.ID);
            System.out.println("");
        } else {
            pw.println(name);
            pw.println(ID);
            pw.println(Address);
            pw.println(phone);
            pw.println(borrowedbook.name);
            pw.println(borrowedbook.ID);
        }
    }

    public void setbookID(String ID) {
        this.borrowedbook.ID = ID;
    }

    public void setbookName(String name) {
        this.borrowedbook.name = name;
    }

}
