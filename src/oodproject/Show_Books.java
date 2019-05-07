package oodproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Show_Books extends JPanel {

    private BooksInventory bd;
    private home myHome;
    private show_books_Controller showC1;
    private JFrame frame;

    public Show_Books(BooksInventory bd, show_books_Controller showC1, home myHome) {
        this.bd = bd;
        this.myHome = myHome;
        this.showC1 = showC1;
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 200));
        JTable table = new JTable(bd.myBooks.size(), 4);
        frame = new JFrame();
        // Turn off JTable's auto resize so that JScrollPane will show a
        // horizontal scroll bar.
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setHeaderValue("Name");
        table.getColumnModel().getColumn(1).setHeaderValue("ID");
        table.getColumnModel().getColumn(2).setHeaderValue("Price");
        table.getColumnModel().getColumn(3).setHeaderValue("Copies");
        showC1.show(bd, table);
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
        JPanel panel = new Show_Books(bd, showC1, myHome);
        panel.setOpaque(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Books Database");
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
