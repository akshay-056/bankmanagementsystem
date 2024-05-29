package bank.management.system;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 150);
        add(mini);

        JLabel bank = new JLabel("STATE BANK OF INDIA");
        bank.setBounds(120, 30, 220, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 330, 300, 20);
        add(balanceLabel);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s
                    .executeQuery("SELECT * FROM login WHERE pin = '" + pinnumber + "'");
            while (rs.next()) {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX"
                        + rs.getString("cardnumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s
                    .executeQuery("SELECT * FROM bank WHERE pin = '" + pinnumber + "' ORDER BY date DESC LIMIT 4");

            while (rs.next()) {
                mini.setText(
                        mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + rs.getString("amount") + "<br><br>");

                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balanceLabel.setText("Your Current Account Balance is Rs: " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }

        setSize(400, 400);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new MiniStatement("");
    }
}
