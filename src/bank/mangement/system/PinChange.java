package bank.mangement.system;

import javax. swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Rishit Daru
 */
public class PinChange extends JFrame implements ActionListener{
    String pinNumber = "";
    JPasswordField newPinTextField, confirmPinTextField;
    JButton changeButton, backButton;
    
      
    PinChange(String pinNumber) {
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

        // Instruction label
        JLabel instructionLabel = new JLabel("CHANGE YOUR PIN");
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(new Font("System", Font.BOLD, 18));
        instructionLabel.setBounds(250, 300, 700, 35);
        label.add(instructionLabel);
        
        // New Pin Label
        JLabel newPinLabel = new JLabel("NEW PIN:");
        newPinLabel.setForeground(Color.WHITE);
        newPinLabel.setFont(new Font("System", Font.BOLD, 18));
        newPinLabel.setBounds(165, 350, 180, 25);
        label.add(newPinLabel);
        
        // Pin Text Field
        newPinTextField = new JPasswordField();
        newPinTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        newPinTextField.setBounds(330, 350, 180, 25);
        label.add(newPinTextField);
        
        // Confirm Pin Label
        JLabel confirmPinLabel = new JLabel("Re-Enter New PIN:");
        confirmPinLabel.setForeground(Color.WHITE);
        confirmPinLabel.setFont(new Font("System", Font.BOLD, 18));
        confirmPinLabel.setBounds(165, 390, 180, 25);
        label.add(confirmPinLabel);
        
        // Confirm Pin Text Field
        confirmPinTextField = new JPasswordField();
        confirmPinTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        confirmPinTextField.setBounds(330, 390, 180, 25);
        label.add(confirmPinTextField);
        
        // ChangeButton
        changeButton = new JButton("Change");
        changeButton.setBounds(355, 485, 150, 30);
        changeButton.addActionListener(this);
        label.add(changeButton);
        
        // Back Button
        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        label.add(backButton);
        
        
        
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { 
        if(ae.getSource() == changeButton) {
            try {
                String newPin = newPinTextField.getText();
                String confirmPin = confirmPinTextField.getText();
                
                if(!newPin.equals(confirmPin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                if(newPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "New PIN is required");
                    return;
                }
                if(confirmPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please re-enter NEW PIN");
                    return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set pinNumber = '"+newPin+"' where pinNumber = '"+pinNumber+"' ";
                String query2 = "update login set pinNumber = '"+newPin+"' where pinNumber = '"+pinNumber+"' ";
                String query3 = "update signupPageThree set pinNumber = '"+newPin+"' where pinNumber = '"+pinNumber+"' ";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(newPin).setVisible(true);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }

        
    }
    public static void main(String args[]) {
        new PinChange("");
    }
    
}
