package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUpTwo extends JFrame implements ActionListener{
    
    JTextField pan,adhar;
    JButton next;
    JRadioButton eyes,eno,syes,sno;
    JComboBox religion,incomes,educations,occupation,categorys;
    String formno;
    
    SignUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
 
        
        JLabel additionDetails  = new JLabel("Page 2: ADDITIONAL DETAILS");
        additionDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionDetails.setBounds(290,80,400,30);
        add(additionDetails);
        
        JLabel name  = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
       
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[] = {"General","OBC","SC","ST","Others"};
        categorys = new JComboBox(valCategory);
        categorys.setBounds(300,190,400,30);
        categorys.setBackground(Color.WHITE);
        add(categorys);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String incomecat[]={"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000"};
        incomes = new JComboBox(incomecat);
        incomes.setBounds(300,240,400,30);
        incomes.setBackground(Color.WHITE);
        add(incomes);
        
  
        
        
       JLabel education = new JLabel("Educational:");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,290,200,30);
        add(education);
       
       JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educational[]={"Non Graduate","Graduate","Post-Graduate","Others"};
        educations = new JComboBox(educational);
        educations.setBounds(300,315,400,30);
        educations.setBackground(Color.WHITE);
        add(educations);
       
        
       JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationvalue[]={"Salaried","Self-Employed","Bussiness","Student","Others"};
        occupation= new JComboBox(occupationvalue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
         
       JLabel pans = new JLabel("PAN Number:");
        pans.setFont(new Font("Raleway",Font.BOLD,20));
        pans.setBounds(100,440,200,30);
        add(pans);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,16));
        pan.setBounds(300,440,400,30);
        add(pan);
        
       JLabel adhars = new JLabel("Adhar Number:");
        adhars.setFont(new Font("Raleway",Font.BOLD,20));
        adhars.setBounds(100,490,200,30);
        add(adhars);
        
        adhar = new JTextField();
        adhar.setFont(new Font("Raleway",Font.BOLD,16));
        adhar.setBounds(300,490,400,30);
        add(adhar);
        
       JLabel ctz = new JLabel("Senior Citizen:");
        ctz.setFont(new Font("Raleway",Font.BOLD,20));
        ctz.setBounds(100,540,200,30);
        add(ctz);
        
        syes =new JRadioButton("YES");
        syes.setBounds(300,540,200,30);
        syes.setBackground(Color.white);
        syes.setSelected(false);
        add(syes);
        
        sno =new JRadioButton("NO");
        sno.setBounds(500,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup ctzgroup = new ButtonGroup();
        ctzgroup.add(syes);
        ctzgroup.add(sno);
        
       
       JLabel exact = new JLabel("Exisiting Account:");
        exact.setFont(new Font("Raleway",Font.BOLD,20));
        exact.setBounds(100,590,200,30);
        add(exact);
        
        eyes =new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno =new JRadioButton("NO");
        eno.setBounds(500,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup exactgroup = new ButtonGroup();
        exactgroup.add(eyes);
        exactgroup.add(eno);
        
        
        
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
//        String formno =""+ random; //long
        String sreligion =(String)religion.getSelectedItem();
        String scategory = (String)categorys.getSelectedItem();
        String sincome = (String)incomes.getSelectedItem();
        String seducation = (String)educations.getSelectedItem();
        int maxEducationLength = 255;
    if (seducation.length() > maxEducationLength) {
        JOptionPane.showMessageDialog(null, "Education value is too long");
        return;
    }
        String soccupation =(String)occupation.getSelectedItem();
        String seniorcitizen =null;
        if(syes.isSelected()){
           seniorcitizen ="YES";
        }else if(sno.isSelected()){
            seniorcitizen="NO";
        }else{
            JOptionPane.showMessageDialog(null,"Select Any Option");
            return;
        }
        
        
 
        String exisitingaccount =null;
        if(eyes.isSelected()){
            exisitingaccount ="YES";
        }else if(eno.isSelected()){
            exisitingaccount ="No";
        }
        else{
            JOptionPane.showMessageDialog(null,"Select Any Option");
            return;
        }
        
        String span =pan.getText();
        String sadhar = adhar.getText();
       
        try{
            
                Conn c =new Conn();
                String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                c.s.executeUpdate(query);
                
                //Signup3 object
                setVisible(false);
                new SignUpThree(formno).setVisible(true);
            }
            
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in database operation: " + e.getMessage());
        }
    }
    
    public static void main (String args[]){
        new SignUpTwo("");
        
    }
}
