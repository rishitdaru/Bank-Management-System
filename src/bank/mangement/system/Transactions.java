package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Rishit Daru
 */
public class Transactions extends JFrame implements ActionListener{
    
    JButton depositButton, withdrawalButton, fastCashButton, miniStatementButton, changePinButton, balanceEnquiryButton, exitButton;
    String pinNumber = "";
    Transactions(String pinNumber) {
        this.pinNumber = pinNumber;
        // JFrame Setup
        setSize(900, 900);
        setLocation (300, 0);
        setLayout(null);
        setTitle("Transactions");
         
        // Adding background image to frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image= imageIcon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel label = new JLabel(scaledImageIcon);
        label.setBounds(0, 0, 900, 900);
        add(label);
        
        // Instruction label
        JLabel instructionLabel = new JLabel("Please select your Transaction");
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(new Font("System", Font.BOLD, 18));
        instructionLabel.setBounds(210, 300, 700, 35);
        label.add(instructionLabel);
        
        
        // Add Deposit Button
        depositButton = new JButton("Deposit Cash");
        depositButton.setBounds(170, 415, 150, 30);
        depositButton.addActionListener(this);
        label.add(depositButton);
        
        // Add Withdrawal Button
        withdrawalButton = new JButton("Withdraw Cash");
        withdrawalButton.setBounds(355, 415, 150, 30);
        withdrawalButton.addActionListener(this);
        label.add(withdrawalButton);
        
        // Add Fast Cash Button
        fastCashButton = new JButton("Fast Cash");
        fastCashButton.setBounds(170, 450, 150, 30);
        fastCashButton.addActionListener(this);
        label.add(fastCashButton);
        
        // Add Mini Statement Button
        miniStatementButton = new JButton("Mini Statement");
        miniStatementButton.setBounds(355, 450, 150, 30);
        miniStatementButton.addActionListener(this);
        label.add(miniStatementButton);
        
        // Add Change PIN Button
        changePinButton = new JButton("Change Pin");
        changePinButton.setBounds(170, 485, 150, 30);
        changePinButton.addActionListener(this);
        label.add(changePinButton);
        
        // Add Change PIN Button
        balanceEnquiryButton = new JButton("Check Balance");
        balanceEnquiryButton.setBounds(355, 485, 150, 30);
        balanceEnquiryButton.addActionListener(this);
        label.add(balanceEnquiryButton);
        
        // Add Exit Button
        exitButton = new JButton("Exit");
        exitButton.setBounds(355, 520, 150, 30);
        exitButton.addActionListener(this);
        label.add(exitButton);
              
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exitButton) {
            System.exit(0);
        } else if (ae.getSource() == depositButton) {
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        } else if (ae.getSource() == withdrawalButton) {
            setVisible(false);
            new Withdraw(pinNumber).setVisible(true);
        }  else if (ae.getSource() == fastCashButton) {
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new Transactions("");
    }
}
