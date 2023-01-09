package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Rishit Daru
 */
public class SignUpPageThree extends JFrame implements ActionListener{
    
    String formNumber="";
    JRadioButton savingsAccountRadioButton, checkingAccountRadioButton, recurringDepositAccountRadioButton, fixedDepositAccountRadioButton;
    JCheckBox atmCardCheckBox, internetBankingCheckBox, mobileBankingCheckBox, emailAlertsCheckBox, paperStatementCheckBox, eStatementCheckBox, declarationCheckBox;
    JButton submitButton, cancelButton;
    
    SignUpPageThree(String formNumber) {
        
        this.formNumber = formNumber;
        // JFrame Setup
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation (350, 10);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
 
        // Account Details Heading
        JLabel accountDetailsHeading = new JLabel("Page 3: Account Details");
        accountDetailsHeading.setFont(new Font("Raleway", Font.BOLD, 22));
        accountDetailsHeading.setBounds(275, 40, 400, 30);
        add(accountDetailsHeading);
        
        // Account Type
        JLabel accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("Raleway", Font.BOLD, 22));
        accountType.setBounds(100, 140, 200, 30);
        add(accountType);
        
        // Account Type Radio Buttons
        savingsAccountRadioButton = new JRadioButton("Savings account");
        savingsAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        savingsAccountRadioButton.setBounds(100, 175, 250, 25);
        savingsAccountRadioButton.setBackground(Color.WHITE);
        add(savingsAccountRadioButton);
        
        checkingAccountRadioButton = new JRadioButton("Checking account");
        checkingAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        checkingAccountRadioButton.setBounds(350, 175, 250, 25);
        checkingAccountRadioButton.setBackground(Color.WHITE);
        add(checkingAccountRadioButton);
        
        recurringDepositAccountRadioButton = new JRadioButton("Recurring Deposit Account");
        recurringDepositAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        recurringDepositAccountRadioButton.setBounds(100, 215, 250, 25);
        recurringDepositAccountRadioButton.setBackground(Color.WHITE);
        add(recurringDepositAccountRadioButton);
        
        fixedDepositAccountRadioButton = new JRadioButton("Fixed Deposit account");
        fixedDepositAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedDepositAccountRadioButton.setBounds(350, 215, 250, 25);
        fixedDepositAccountRadioButton.setBackground(Color.WHITE);
        add(fixedDepositAccountRadioButton);
                
        // to prevent multi-select
        ButtonGroup accountTypeRadioButtonsGroup = new ButtonGroup();
        accountTypeRadioButtonsGroup.add(savingsAccountRadioButton);
        accountTypeRadioButtonsGroup.add(checkingAccountRadioButton);
        accountTypeRadioButtonsGroup.add(recurringDepositAccountRadioButton);
        accountTypeRadioButtonsGroup.add(fixedDepositAccountRadioButton);
        
        // Card Number
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNumberLabel.setBounds(100, 280, 200, 30);
        add(cardNumberLabel);
        
        JLabel cardNumberSubLabel = new JLabel("This is your 16 digit card number");
        cardNumberSubLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        cardNumberSubLabel.setBounds(100, 310, 300, 20);
        add(cardNumberSubLabel);
 
        JLabel dummyCardNumberLabel = new JLabel("XXXX-XXXX-XXXX-XXXX-4184");
        dummyCardNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        dummyCardNumberLabel.setBounds(320, 280, 350, 30);
        add(dummyCardNumberLabel);
        
        // Pin Number
        JLabel pinNumberLabel = new JLabel("Pin Number:");
        pinNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNumberLabel.setBounds(100, 350, 200, 30);
        add(pinNumberLabel);
        
        JLabel pinNumberSubLabel = new JLabel("This is your 4 digit PIN");
        pinNumberSubLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        pinNumberSubLabel.setBounds(100, 380, 300, 20);
        add(pinNumberSubLabel);
 
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNumber.setBounds(320, 350, 350, 30);
        add(pinNumber);
        
        // Services:
        JLabel services = new JLabel("Services required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 430, 350, 30);
        add(services);
        
        // Services check box:
        atmCardCheckBox = new JCheckBox("ATM Card");
        atmCardCheckBox.setBackground(Color.WHITE);
        atmCardCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        atmCardCheckBox.setBounds(100, 470, 200, 20);
        add(atmCardCheckBox);
        
        internetBankingCheckBox = new JCheckBox("Interet Banking");
        internetBankingCheckBox.setBackground(Color.WHITE);
        internetBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBankingCheckBox.setBounds(320, 470, 200, 20);
        add(internetBankingCheckBox);
        
        mobileBankingCheckBox = new JCheckBox("Mobile Banking");
        mobileBankingCheckBox.setBackground(Color.WHITE);
        mobileBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBankingCheckBox.setBounds(100, 500, 200, 20);
        add(mobileBankingCheckBox);
        
        emailAlertsCheckBox = new JCheckBox("Email Alerts");
        emailAlertsCheckBox.setBackground(Color.WHITE);
        emailAlertsCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        emailAlertsCheckBox.setBounds(320, 500, 200, 20);
        add(emailAlertsCheckBox);
        
        paperStatementCheckBox = new JCheckBox("Paper Statement");
        paperStatementCheckBox.setBackground(Color.WHITE);
        paperStatementCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        paperStatementCheckBox.setBounds(100, 530, 200, 20);
        add(paperStatementCheckBox);
        
        eStatementCheckBox = new JCheckBox("e-Statement");
        eStatementCheckBox.setBackground(Color.WHITE);
        eStatementCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatementCheckBox.setBounds(320, 530, 200, 20);
        add(eStatementCheckBox);
        
        declarationCheckBox = new JCheckBox("I hereby declare that the above declared information is correct to the best of my knowledge");
        declarationCheckBox.setBackground(Color.WHITE);
        declarationCheckBox.setFont(new Font("Raleway", Font.BOLD, 12));
        declarationCheckBox.setBounds(100, 600, 600, 20);
        add(declarationCheckBox);
        
        // Add 'Submit' button
        submitButton = new JButton("Next");
        submitButton.setBounds(250, 640, 80, 30);
        submitButton.setBackground(Color.BLUE);
        submitButton.setForeground(Color.WHITE);
        submitButton.addActionListener(this);
        add(submitButton);
        
        // Add 'Cancel' button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(450, 640, 80, 30);
        cancelButton.setBackground(Color.BLUE);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.addActionListener(this);
        add(cancelButton);
        
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
    }
    
    public static void main(String args[]) {
        new SignUpPageThree("");
    }
    
}
