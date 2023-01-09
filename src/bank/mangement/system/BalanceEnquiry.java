package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

/**
 * @author Rishit Daru
 */
public class BalanceEnquiry extends JFrame implements ActionListener{
    String pinNumber="";
    JButton backButton;
    
    BalanceEnquiry(String pinNumber) {
        this.pinNumber = pinNumber;
        
        // JFrame Setup
        setSize(900, 900);
        setLocation (300, 0);
        setLayout(null);
        setTitle("PinChange");

        // Adding background image to frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image= imageIcon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel label = new JLabel(scaledImageIcon);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        // Back Button
        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        label.add(backButton);
        
        Conn c = new Conn();
        int balance = 0;
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
                while (rs.next()) {
                    if (rs.getString("typeOfTransaction").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
        // Balance label
        JLabel balanceLabel = new JLabel("Your current account balance is " + balance);
        balanceLabel.setForeground(Color.WHITE);
        balanceLabel.setFont(new Font("System", Font.BOLD, 18));
        balanceLabel.setBounds(170, 300, 400, 30);
        label.add(balanceLabel);
                
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { 
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
    }
    
    public static void main(String args[]){
        new BalanceEnquiry("");
    }
}
