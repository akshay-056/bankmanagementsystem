package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,transgender,other,married,unmarried;
    JDateChooser dateChooser;
    
    SignUpOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()% 9000L) +1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO: " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails  = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        JLabel name  = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,16));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,16));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
       JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male =new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
         female =new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        transgender =new JRadioButton("Transgender");
        transgender.setBounds(600,290,180,30);
        transgender.setBackground(Color.white);
        add(transgender);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(transgender);
        
        
       
       JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,16));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
       JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married =new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried =new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other =new JRadioButton("Other");
        other.setBounds(600,390,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
       JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addTextField = new JTextField();
        addTextField.setFont(new Font("Raleway",Font.BOLD,16));
        addTextField.setBounds(300,440,400,30);
        add(addTextField);
        
       JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,16));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
       JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,16));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
       JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,16));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
       next = new JButton("NEXT");
       next.setBounds(620,660,80,30);
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway",Font.BOLD,16));
       next.addActionListener(this);
       add(next);
       
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno =""+ random; //long
        String name =nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }else if(transgender.isSelected()){
            gender="Transgender";
        }
//        else{
//            JOptionPane.showMessageDialog(null,"Select Gender");
//           return;
//        }
        
        String email =emailTextField.getText();
        String marital =null;
        if(married.isSelected()){
            marital ="Married";
        }else if(unmarried.isSelected()){
            marital ="Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }else{
            JOptionPane.showMessageDialog(null,"Select Marital Status");
            return;
        }
        
        String address =addTextField.getText();
        String city = cityTextField.getText();
        String state=stateTextField.getText();
        String pin =pincodeTextField.getText();
    
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Father Name is not be Empty");
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father Name is not be Empty");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Select Date Of Birth");
            }else if(email.equals("")){
                JOptionPane.showMessageDialog(null,"Email is not be blank");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null,"Fill the Address");
            }else if(city.equals("")){
                JOptionPane.showMessageDialog(null,"Fill City");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null,"Fill State");
            }else if(pin.equals("")){
                JOptionPane.showMessageDialog(null,"Fill Pincode");
            }else{
                Conn c =new Conn();
                String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+pin+"','"+state+"','"+city+"','"+address+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main (String args[]){
        new SignUpOne();
        
    }
}
