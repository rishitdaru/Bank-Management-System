package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

/**
 * @author Rishit Daru
 */
public class Withdraw extends JFrame implements ActionListener{
    
    JTextField amountTextField;
    JButton withdrawButton, backButton;
    String pinNumber = "";
    
    Withdraw(String pinNumber) {
        
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
        JLabel instructionLabel = new JLabel("Enter the amount you want to withdraw");
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(new Font("System", Font.BOLD, 16));
        instructionLabel.setBounds(170, 300, 400, 20);
        label.add(instructionLabel);
        
        // Amount Text Field
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(170, 350, 320, 25);
        add(amountTextField);
        
        // Withdrawal Button
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(355, 485, 150, 30);
        withdrawButton.addActionListener(this);
        label.add(withdrawButton);
        
        // Back Button
        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        label.add(backButton);
        
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdrawButton) {
            String amount = amountTextField.getText();
            Date date = new Date();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            }
            else {
                try {
                    Conn conn = new Conn();
                    conn.s.executeUpdate("insert into bank values('"+pinNumber+"', '"+date+"', 'Withdraw', '"+amount+"')");

                    JOptionPane.showMessageDialog(null, "$"+amount+" withdrawn Successfully");

                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            }
                
        } else if (ae.getSource() == backButton) {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new Withdraw("");
    }

}
