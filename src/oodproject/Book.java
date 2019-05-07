package oodproject;

import java.io.*;
import java.util.*;

public class Book {

    protected String name;
    protected String price;
    protected String id;
    protected String Ncopies;
    protected ArrayList<bookcopy> copies;

    public Book(String n, String p, String i, String c) {
        name = n;
        price = p;
        id = i;
        Ncopies = c;
        copies = new ArrayList<bookcopy>();
        for (int j = 0; j < Integer.parseInt(Ncopies); j++) {
            bookcopy k = new bookcopy(name, (id + "." + (j + 1)));
            copies.add(k);
        }
    }

    public void printDetails(PrintWriter pw) {
        if (pw == null) {
            System.out.println("Name :  " + name);
            System.out.println("Price :  " + price + "  EGP");
            System.out.println("ID :  " + id);
            System.out.println("Number of copies :  " + Ncopies);
            System.out.println("");
        } else {
            pw.println(name);
            pw.println(price);
            pw.println(id);
            pw.println(Ncopies);
        }
    }
}
