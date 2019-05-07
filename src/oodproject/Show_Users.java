package oodproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Show_Users extends JPanel {
    private UserDB bd;
    private home myHome;
    private show_users_controller showC1;
    private JFrame frame = new JFrame();
    private JButton back;

    public Show_Users(UserDB bd, show_users_controller showC1, home myHome) {
        this.bd = bd;
        this.myHome = myHome;
        this.showC1 = showC1;
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 200));
        JTable table = new JTable(bd.myUsers.size(), 6);
        table.getColumnModel().getColumn(0).setHeaderValue("Name");
        table.getColumnModel().getColumn(1).setHeaderValue("ID");
        table.getColumnModel().getColumn(2).setHeaderValue("Address");
        table.getColumnModel().getColumn(3).setHeaderValue("Phone");
        table.getColumnModel().getColumn(4).setHeaderValue("Book name");
        table.getColumnModel().getColumn(5).setHeaderValue("Book ID");
        showC1.show(bd, table);
        JScrollPane pane = new JScrollPane(table);
        back = new JButton("BACK");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                close();
            }
        });
        add(pane, BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);
    }
    public void showFrame() {
        JPanel panel = new Show_Users(bd, showC1, myHome);
        panel.setOpaque(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Books Database");
        frame.setBounds(350, 100, 500, 200);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public void close() {
        myHome.setVisible(true);
        frame.dispose();
        
    }
}
