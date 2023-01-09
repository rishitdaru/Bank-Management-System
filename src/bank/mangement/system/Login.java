package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 * @author Rishit Daru
 */
public class Login extends JFrame implements ActionListener{
    
    // Define elements here to access them outside constructor as well
    JButton loginButton, clearButton, signUpButton;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login() {
        // Setting up JFrame
        setTitle("Automated Teller Machine");
        setLayout(null);
        setSize(800, 480);
        setLocation(350, 200);
        getContentPane().setBackground(Color.WHITE);
        
        // Adding Icon onto frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image image= imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel label = new JLabel(scaledImageIcon);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        // Adding welcomeLabel
        JLabel welcomeLabel = new JLabel("Welcome to RD Bank's ATM");
        welcomeLabel.setFont(new Font("Osward", Font.BOLD, 40));
        welcomeLabel.setBounds(200, 40, 600, 40);
        add(welcomeLabel);
        
        // Adding cardNumberLabel
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNumberLabel.setBounds(120, 150, 250, 30);
        add(cardNumberLabel);
        
        // Adding cardTextField
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cardTextField.setBounds(325, 150, 230, 30);
        add(cardTextField);
        
        // Adding pinLabel
        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 28));
        pinLabel.setBounds(120, 220, 250, 30);
        add(pinLabel);
        
        // Adding pinTextField
        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBounds(325, 220, 230, 30);
        add(pinTextField);
        
        // Adding 'Sign In' button
        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(325, 300, 100, 30);
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);
        
        // Adding 'Clear' button
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(455, 300, 100, 30);
        clearButton.setBackground(Color.BLUE);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        add(clearButton);
        
        // Adding 'Sign Up' button
        signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(325, 350, 230, 30);
        signUpButton.setBackground(Color.BLUE);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(this);
        add(signUpButton);
        
        setVisible(true);
    }
    
    // To resolve the following error: 
    // Login is not abstract and does not override abstract method actionPerformed(ActionEvent) in ActionListener
    @Override
    public void actionPerformed(ActionEvent ae){
        // Identify which button was defined
        if(ae.getSource() == clearButton) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == loginButton) {
            Conn conn = new Conn();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();
            
            String query = "select * from login where cardNumber = '"+cardNumber+"' and pinNumber = '"+pinNumber+"'";
            
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            } catch(Exception e) {
                System.out.println(e);
            }
            
        }
        else if (ae.getSource() == signUpButton) {
            setVisible(false);
            new SignUpPageOne().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Login();
    }
}
