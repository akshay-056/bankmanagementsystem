
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignUpThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignUpThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 =new JLabel("Page 3: ACCOUNT DETAILS");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type =new JLabel("Account Type:");
        type.setFont(new Font("Railway",Font.BOLD,22));
        type.setBounds(100,115,200,30);
        add(type);
        
        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,160,150,20);
        add(r1);
        
        
        r2= new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,160,250,20);
        add(r2);
        
        r3= new JRadioButton("Current Account");
        r3.setFont(new Font("Railway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,200,150,20);
        add(r3);
        
        r4= new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Railway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,200,250,20);
        add(r4);
       
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card =new JLabel("CARD NUMBER:");
        card.setFont(new Font("Railway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number =new JLabel("XXXX-XXXX-XXXX-6585");
        number.setFont(new Font("Railway",Font.BOLD,22));
        number.setBounds(330,300,270,30);
        add(number);
        
        JLabel carddetail =new JLabel("Your 16 Digit Card number");
        carddetail.setFont(new Font("Railway",Font.BOLD,12));
        carddetail.setBounds(100,330,270,20);
        add(carddetail);
        
        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("Railway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pindetail =new JLabel("Your 4 digit Password");
        pindetail.setFont(new Font("Railway",Font.BOLD,12));
        pindetail.setBounds(100,400,270,20);
        add(pindetail);
        
        JLabel pnumber =new JLabel("XXXX");
        pnumber.setFont(new Font("Railway",Font.BOLD,22));
        pnumber.setBounds(330,370,270,30);
        add(pnumber);
        
        JLabel service =new JLabel("Service Required:");
        service.setFont(new Font("Railway",Font.BOLD,22));
        service.setBounds(100,450,200,30);
        add(service);
        
        c1= new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Railway",Font.BOLD,16));
        c1.setBounds(100,500,150,30);
        add(c1);
        
        c2= new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBounds(400,500,150,30);
        add(c2);
        
        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBounds(100,550,150,30);
        add(c3);
        
        c4= new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBounds(400,550,150,30);
        add(c4);
        
        c5= new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBounds(100,600,150,30);
        add(c5);
        
        c6= new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBounds(400,600,150,30);
        add(c6);
        
        c7= new JCheckBox("I hearby declares that the above entered details correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Railway",Font.BOLD,13));
        c7.setBounds(100,670,630,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Railway",Font.BOLD,14));
        submit.setBounds(220,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Railway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
       
        setSize(850,820);
        setLocation(350, 0);
        setVisible(true);

}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }
            else if(r2.isSelected()){
                accountType = "Fixed Deposite Account";
            }
            else if(r3.isSelected()){
                accountType = "Current Account";
            }
            else if(r4.isSelected()){
                accountType = "Reccuring Deposite Account";
            }else if(!c7.isSelected()){
                      JOptionPane.showMessageDialog(null, "Declaration is Required");
            }

            Random random = new Random();
            String cardnumber =""+Math.abs(random.nextInt()% 90000000L)+(random.nextInt()% 90000000L);
            
            String pinnumber =""+Math.abs(random.nextInt()%9000L);
            
            String facility = "";
              if(c1.isSelected()){
                  facility = facility + "ATM CARD";
              }else if(c2.isSelected()){
                  facility = facility + "Internet Banking";
              }else if(c3.isSelected()){
                  facility = facility + "Mobile Banking";
              }else if(c4.isSelected()){
                  facility = facility + "EMAIL & SMS Alerts";
              }else if(c5.isSelected()){
                  facility = facility + "Check Box";
              }else if(c6.isSelected()){
                  facility = facility + "E-Statement";
              }
              
              try{
                  if(accountType.isEmpty()){
                      JOptionPane.showMessageDialog(null, "Account Type is Required");
                  
                }else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null, "Declaration is Required");
                }
                  else {
                      Conn conn = new Conn();
                      String query1 = "insert into SignUpThree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                      String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

                      conn.s.executeUpdate(query1);
                      conn.s.executeUpdate(query2);

                      JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber +"\n Pin: "+ pinnumber);
                  setVisible(false);
                  new Deposit (pinnumber).setVisible(true);
                }
              }
            
            catch(Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    
    public static void main (String args[]){
        new SignUpThree("");
    }
    
}
