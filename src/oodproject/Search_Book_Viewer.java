package oodproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_Book_Viewer extends JPanel {

    private BooksInventory bd;
    private home myHome;
    private search_book_controller searchC1;
    private JFrame frame;
    private String bookID;
    public Search_Book_Viewer(BooksInventory bd, search_book_controller searchC1, home myHome,String bookID) {
        this.bd = bd;
        this.myHome = myHome;
        this.searchC1 = searchC1;
        this.bookID=bookID;
        initializeUI();
    }
    private void initializeUI() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 100));
        JTable table = new JTable(1, 4);
        frame = new JFrame();
        table.getColumnModel().getColumn(0).setHeaderValue("Name");
        table.getColumnModel().getColumn(1).setHeaderValue("ID");
        table.getColumnModel().getColumn(2).setHeaderValue("Price");
        table.getColumnModel().getColumn(3).setHeaderValue("Copies");
       // showC1.show(bd, table);
       searchC1.show(bd, table,bookID);
        JScrollPane pane = new JScrollPane(table);
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myHome.setVisible(true);
                frame.dispose();
            }
        });
        add(pane, BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);
    }

    public void showFrame() {
        JPanel panel = new Search_Book_Viewer(bd, searchC1, myHome,bookID);
        panel.setOpaque(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Book Found");
        frame.setBounds(350, 100, 500, 200);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                BookShower.showFrame();
//            }
//        });
//    }
}
