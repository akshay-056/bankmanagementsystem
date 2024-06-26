
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,cashwithdrawal,fastcash,pinchange,ministatement,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel ("Please Select Your Transaction");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(160,417,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(160,452,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(160,487,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        cashwithdrawal = new JButton("CASH WITHDRAWAL");
        cashwithdrawal.setBounds(360,417,150,30);
        cashwithdrawal.addActionListener(this);
        image.add(cashwithdrawal);
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(360,452,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(360,487,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
      
        
        exit = new JButton("EXIT");
        exit.setBounds(360,521,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==exit){
        System.exit(0);
    }else if (ae.getSource() == deposit ){
        setVisible(false);
        new Deposit(pinnumber).setVisible(true);
    }else if (ae.getSource() == cashwithdrawal){
        setVisible(false);
        new Withdrawl(pinnumber).setVisible(true);
    }else if (ae.getSource() == fastcash){
        setVisible(false);
        new FastCash(pinnumber).setVisible(true);
    }else if (ae.getSource() == pinchange){
        setVisible(false);
        new PinChange(pinnumber).setVisible(true);
    }else if (ae.getSource() == balanceenquiry){
        new BalanceEnquiry(pinnumber).setVisible(true);
    }else if (ae.getSource() == ministatement){
        new MiniStatement(pinnumber).setVisible(true);
    }
}

public static void main(String args[]){
     new Transactions("");
}
}