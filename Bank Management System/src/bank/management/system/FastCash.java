
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,cashwithdrawal,fastcash,pinchng,ministatement,exit;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel ("SELECT WITHDEAWL AMOUNT");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(160,417,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        fastcash = new JButton("RS 200");
        fastcash.setBounds(160,452,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        pinchng = new JButton("RS 500");
        pinchng.setBounds(160,487,150,30);
        pinchng.addActionListener(this);
        image.add(pinchng);
        
        cashwithdrawal = new JButton("Rs 1000");
        cashwithdrawal.setBounds(360,417,150,30);
        cashwithdrawal.addActionListener(this);
        image.add(cashwithdrawal);
        
        ministatement = new JButton("Rs 5000");
        ministatement.setBounds(360,452,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
//        balanceenquiry = new JButton("Rs 10,000");
//        balanceenquiry.setBounds(360,487,150,30);
//        balanceenquiry.addActionListener(this);
//        image.add(balanceenquiry);
      
        
        exit = new JButton("Back");
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
       setVisible(false);
       new Transactions(pinnumber).setVisible(true);
    }else {
        String amount = ((JButton)ae.getSource()).getText().substring(3);
        Conn c = new Conn();
        try{
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             int balance = 0;
             while(rs.next()){
                 if(rs.getString("type").equals("Deposit")){
                     balance += Integer.parseInt((String) rs.getString("amount"));
                 }else{
                     balance -= Integer.parseInt((String) rs.getString("amount"));
                 }
             }
             if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
               JOptionPane.showMessageDialog(null, "Insufficient Balance");  
               return;
             }
             Date date = new Date();
             String query = "insert into bank values('"+pinnumber+"', '"+date+"' ,'Withdrawl', '"+amount+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs "+ amount + "Debited Successfully");
       
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public static void main(String args[]){
     new FastCash("");
}
}