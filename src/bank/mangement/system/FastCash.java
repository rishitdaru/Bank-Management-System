package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

/**
 * @author Rishit Daru
 */
public class FastCash extends JFrame implements ActionListener{
    
    JButton tenButton, twentyButton, fiftyButton, hundredButton, fiveHundredButton, thousandButton, backButton;
    String pinNumber = "";
    FastCash(String pinNumber) {
        this.pinNumber = pinNumber;
        // JFrame Setup
        setSize(900, 900);
        setLocation (300, 0);
        setLayout(null);
        setTitle("FastCash");
         
        // Adding background image to frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image= imageIcon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel label = new JLabel(scaledImageIcon);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        // Instruction label
        JLabel instructionLabel = new JLabel("Select withdrawal amount");
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(new Font("System", Font.BOLD, 18));
        instructionLabel.setBounds(210, 300, 700, 35);
        label.add(instructionLabel);
        
        
        // $10
        tenButton = new JButton("$10");
        tenButton.setBounds(170, 415, 150, 30);
        tenButton.addActionListener(this);
        label.add(tenButton);
        
        // $20
        twentyButton = new JButton("$20");
        twentyButton.setBounds(355, 415, 150, 30);
        twentyButton.addActionListener(this);
        label.add(twentyButton);
        
        // $50
        fiftyButton = new JButton("$50");
        fiftyButton.setBounds(170, 450, 150, 30);
        fiftyButton.addActionListener(this);
        label.add(fiftyButton);
        
        // $100
        hundredButton = new JButton("$100");
        hundredButton.setBounds(355, 450, 150, 30);
        hundredButton.addActionListener(this);
        label.add(hundredButton);
        
        // $500
        fiveHundredButton = new JButton("$500");
        fiveHundredButton.setBounds(170, 485, 150, 30);
        fiveHundredButton.addActionListener(this);
        label.add(fiveHundredButton);
        
        // $1000
        thousandButton = new JButton("$1000");
        thousandButton.setBounds(355, 485, 150, 30);
        thousandButton.addActionListener(this);
        label.add(thousandButton);
        
        // Add Back Button
        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        label.add(backButton);
              
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {             
        if(ae.getSource() == backButton) {
            setVisible(false);
            new Transactions(pinNumber).setVisible(false);
        } else {
            String amount = ( ((JButton)ae.getSource() ).getText()).substring(1);           
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("typeOfTransaction").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource() != backButton && balance < Integer.parseInt(amount)) {
                    // Balance is less than the amount you want to withdraw
                    JOptionPane.showMessageDialog(null, "Insufficient message");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
    
    public static void main(String args[]) {
        new FastCash("");
    }
}
