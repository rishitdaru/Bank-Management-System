package bank.mangement.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 * @author Rishit Daru
 */

// This class displays last 5 transactions
public class MiniStatement extends JFrame{
    
    String pinNumber = "";
    MiniStatement(String pinNumber) {
        this.pinNumber = pinNumber;
        
        // JFrame Setup
        setSize(400, 600);
        setLocation (20, 20);
        setLayout(null);
        setTitle("Mini Statement");

        // Bank Name
        JLabel bankName = new JLabel("RD BANK");
        bankName.setFont(new Font("System", Font.BOLD, 18));
        bankName.setBounds(150, 20, 100, 20);
        add(bankName);
        
        // Mini Statement
        JLabel miniStatement = new JLabel();
        add(miniStatement);
        
        
        // Card Number
        JLabel cardNumber = new JLabel();
        cardNumber.setBounds(20, 80, 300, 20);
        add(cardNumber);
        
        // Balance
        JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 320, 20);
        add(balanceLabel);
        
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pinNumber = '"+pinNumber+"'");
            while (rs.next()) {
                cardNumber.setText("Card Number: " + rs.getString("cardNumber").substring(0, 4) + "-XXXX-XXXX-" + rs.getString("cardNumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
            int balance = 0;
            while (rs.next()) {
                miniStatement.setText(miniStatement.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("typeOfTransaction") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("typeOfTransaction").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balanceLabel.setText("Your current acccount balance is $" + balance);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        miniStatement.setBounds(20, 140, 400, 200);
                
    }
    
    public static void main(String args[]) {
        new MiniStatement("");
    }
}
