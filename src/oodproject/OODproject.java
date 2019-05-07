package oodproject;

import java.io.*;

public class OODproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BooksInventory db = new BooksInventory();
        UserDB ub = new UserDB();
        loading(db, ub);
        add_Book_Controller addC1 = new add_Book_Controller();
        remove_book_Controller remC1 = new remove_book_Controller();
        Add_User_Controller addC2 = new Add_User_Controller();
        remove_user_Controller remC2 = new remove_user_Controller();
        show_books_Controller showC1 = new show_books_Controller();
        show_users_controller showc2 = new show_users_controller();
        Borrow_book_controller borrowc1 = new Borrow_book_controller();
        search_book_controller searchC1=new search_book_controller();
        search_user_controller searchC2=new search_user_controller();
        return_book_controller returnC1=new return_book_controller();
        home h = new home(db, ub, addC1, remC1, addC2, remC2, showC1, showc2, borrowc1,searchC1,searchC2,returnC1);
        h.setVisible(true);
    }

    public static void loading(BooksInventory db, UserDB ub) {

        //books loading
        try {
            FileReader booksFile = new FileReader("myBooks.txt");
            BufferedReader bookBuffer = new BufferedReader(booksFile);
            String name = null, price = null, id = null, copies = null;
            String str;
            int counter = 0;
            while ((str = bookBuffer.readLine()) != null) {
                switch (counter) {
                    case 0:
                        name = str;
                        counter++;
                        break;
                    case 1:
                        price = str;
                        counter++;
                        break;
                    case 2:
                        id = str;
                        counter++;
                        break;
                    case 3:
                        copies = str;
                        Book bb = new Book(name, price, id, copies);
                        db.myBooks.add(bb);
                        counter = 0;
                        break;
                }
            }
            bookBuffer.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

        //users loading
        try {
            FileReader usersfile = new FileReader("myUsers.txt");
            BufferedReader userbuffer = new BufferedReader(usersfile);
            String name = null, id = null, address = null, phone = null, bookname = null, bookid = null;
            String str;
            int counter = 0;
            while ((str = userbuffer.readLine()) != null) {
                switch (counter) {
                    case 0:
                        name = str;
                        counter++;
                        break;
                    case 1:
                        id = str;
                        counter++;
                        break;
                    case 2:
                        address = str;
                        counter++;
                        break;
                    case 3:
                        phone = str;
                        counter++;
                        break;
                    case 4:
                        bookname = str;
                        counter++;
                        break;
                    case 5:
                        bookid = str;
                        User uu = new User(name, id, address, phone, bookname, bookid);
                        ub.myUsers.add(uu);
                        counter = 0;
                        break;
                }
            }
            userbuffer.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
