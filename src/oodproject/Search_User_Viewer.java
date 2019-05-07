package oodproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_User_Viewer extends JPanel {

    private UserDB ub;
    private home myHome;
    private search_user_controller searchC2;
    private JFrame frame;
    private String userID;
    public Search_User_Viewer(UserDB ub, search_user_controller searchC2, home myHome,String userID) {
        this.ub = ub;
        this.myHome = myHome;
        this.searchC2 = searchC2;
        this.userID=userID;
        initializeUI();
    }
    private void initializeUI() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 100));
        JTable table = new JTable(1, 6);
        frame = new JFrame();
        table.getColumnModel().getColumn(0).setHeaderValue("Name");
        table.getColumnModel().getColumn(1).setHeaderValue("ID");
        table.getColumnModel().getColumn(2).setHeaderValue("Address");
        table.getColumnModel().getColumn(3).setHeaderValue("Phone");
        table.getColumnModel().getColumn(4).setHeaderValue("Book Name");
        table.getColumnModel().getColumn(5).setHeaderValue("Book ID");
        searchC2.show(ub, table,userID);
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
        JPanel panel = new Search_User_Viewer(ub, searchC2, myHome,userID);
        panel.setOpaque(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Book Found");
        frame.setBounds(350, 100, 500, 200);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }


}
