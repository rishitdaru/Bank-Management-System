package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Rishit Daru
 */
public class SignUpPageTwo extends JFrame implements ActionListener{
    
    String formNumber;
    JTextField sinOrTinNumberTextField;
    JComboBox ethnicityDropdown, incomeDropdown, educationalQualificationDropdown, occupationDropdown;
    JRadioButton isSeniorRadioButton, isNotSeniorRadioButton, existingAccountRadioButton, notExistingAccountRadioButton;
    JButton nextButton;
            
    SignUpPageTwo(String formNumber) {
        
        this.formNumber = formNumber;
        // JFrame Setup
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation (350, 10);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        
        // Additional Details Heading
        JLabel additionalDetailsHeading = new JLabel("Page 2: Additional Details");
        additionalDetailsHeading.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetailsHeading.setBounds(275, 80, 300, 30);
        add(additionalDetailsHeading);
        
        // Ethnicity Label
        JLabel nameLabel = new JLabel("Ethnicity:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        nameLabel.setBounds(100, 140, 200, 30);
        add(nameLabel);
        
        // Ethnicity Dropdown
        String ethnicityList[] = {"Alaskan Native", "Asian", "Black or African descent", "Hispanic", "Native Hawaiian", "White(Caucasian)", "Other", "Prefer not to say"};
        ethnicityDropdown = new JComboBox(ethnicityList);
        ethnicityDropdown.setBounds(300, 140, 400, 30);
        ethnicityDropdown.setBackground(Color.WHITE);
        add(ethnicityDropdown);
              
        // Income Label
        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        incomeLabel.setBounds(100, 190, 200, 30);
        add(incomeLabel);
        
        // Income Dropdown
        String incomeList[] = {"Null", "<$30,000", "$30,000 to $75,000", "$75,000 to $150,000", "$150,000 to $300,000", ">$300,000"};
        incomeDropdown = new JComboBox(incomeList);
        incomeDropdown.setBounds(300, 190, 400, 30);
        incomeDropdown.setBackground(Color.WHITE);
        add(incomeDropdown);
                
        // Educational Label
        JLabel genderLabel = new JLabel("Educational");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        genderLabel.setBounds(100, 240, 200, 30);
        add(genderLabel);

        // Qualification Label
        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        qualificationLabel.setBounds(100, 260, 200, 30);
        add(qualificationLabel);
        
        // Educational Qualification Dropdown
        String educationalQualificationList[] = {"No formal education", "Primary Education", "Secondary Education", "GED", "Vocational Qualification", "Bachelor's degree", "Master's degree", "Doctorate or higher"};
        educationalQualificationDropdown = new JComboBox(educationalQualificationList);
        educationalQualificationDropdown.setBounds(300, 250, 400, 30);
        educationalQualificationDropdown.setBackground(Color.WHITE);
        add(educationalQualificationDropdown);
                
        // Occupation Label
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        occupationLabel.setBounds(100, 310, 200, 30);
        add(occupationLabel);
        
        // Occupation Dropdown
        String occupationTypeList[] = {"Unemployed", "Salaried", "Self-Employed", "Student", "Retired", "Other"};
        occupationDropdown = new JComboBox(occupationTypeList);
        occupationDropdown.setBounds(300, 310, 400, 30);
        occupationDropdown.setBackground(Color.WHITE);
        add(occupationDropdown);
               
        // GovernmentID number Label
        JLabel sinOrTinNumber = new JLabel("SIN/TIN number:");
        sinOrTinNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        sinOrTinNumber.setBounds(100, 360, 200, 30);
        add(sinOrTinNumber);
        
        // GovernmentID number Field
        sinOrTinNumberTextField = new JTextField();
        sinOrTinNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        sinOrTinNumberTextField.setBounds(300, 360, 400, 30);
        add(sinOrTinNumberTextField);
       
        // Senior Label
        JLabel seniorLabel = new JLabel("Senior citizen:");
        seniorLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        seniorLabel.setBounds(100, 410, 200, 30);
        add(seniorLabel);
              
        // Senior Radio Buttons
        isSeniorRadioButton = new JRadioButton("Yes");
        isSeniorRadioButton.setBounds(300, 410, 60, 30);
        isSeniorRadioButton.setBackground(Color.WHITE);
        add(isSeniorRadioButton);
        
        isNotSeniorRadioButton = new JRadioButton("No");
        isNotSeniorRadioButton.setBounds(370, 410, 60, 30);
        isNotSeniorRadioButton.setBackground(Color.WHITE);
        add(isNotSeniorRadioButton);
        
        // to prevent multi-select
        ButtonGroup seniorRadioButtonsGroup = new ButtonGroup();
        seniorRadioButtonsGroup.add(isSeniorRadioButton);
        seniorRadioButtonsGroup.add(isNotSeniorRadioButton);
        
        
        // Existing Account Label
        JLabel existingAccountLabel = new JLabel("Existing account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        existingAccountLabel.setBounds(100, 460, 200, 30);
        add(existingAccountLabel);
              
        // Senior Radio Buttons
        existingAccountRadioButton = new JRadioButton("Yes");
        existingAccountRadioButton.setBounds(300, 460, 60, 30);
        existingAccountRadioButton.setBackground(Color.WHITE);
        add(existingAccountRadioButton);
        
        notExistingAccountRadioButton = new JRadioButton("No");
        notExistingAccountRadioButton.setBounds(370, 460, 60, 30);
        notExistingAccountRadioButton.setBackground(Color.WHITE);
        add(notExistingAccountRadioButton);
        
        // to prevent multi-select
        ButtonGroup existingAccountRadioButtonsGroup = new ButtonGroup();
        existingAccountRadioButtonsGroup.add(existingAccountRadioButton);
        existingAccountRadioButtonsGroup.add(notExistingAccountRadioButton);
               
        
        // Add 'Next' button
        nextButton = new JButton("Next");
        nextButton.setBounds(620, 500, 80, 30);
        nextButton.setBackground(Color.BLUE);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String ethnicity = (String)ethnicityDropdown.getSelectedItem();
        String income = (String)incomeDropdown.getSelectedItem();
        String educationalQualification = (String)educationalQualificationDropdown.getSelectedItem();
        String occupation = (String)occupationDropdown.getSelectedItem();
        String sinOrTinNumber = sinOrTinNumberTextField.getText();

        String senior = "";
        if(isSeniorRadioButton.isSelected()) {
            senior = "Yes";
        } else if (isNotSeniorRadioButton.isSelected()) {
            senior = "No";
        }
                
        String existingAccount = "";
        if(existingAccountRadioButton.isSelected()) {
            existingAccount = "Yes";
        } else if (notExistingAccountRadioButton.isSelected()) {
            existingAccount = "No";
        }
        
        if( checkForValidation( ethnicity, income, educationalQualification, occupation, sinOrTinNumber, senior, existingAccount)) {
            // At this point all strings are valid
            // Send data to database
           try {
            Conn c = new Conn();
            String query = "insert into signupPageTwo values('"+formNumber+"','"+ethnicity+"','"+income+"','"+educationalQualification+"','"+occupation+"', '"+sinOrTinNumber+"','"+senior+"','"+existingAccount+"')";
            c.s.executeUpdate(query);                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean checkForValidation(String ethnicity, String income, String educationalQualification, String occupation,
                                    String sinOrTinNumber, String senior, String existingAccount) {

        if (ethnicity.equals("")) {
            JOptionPane.showMessageDialog(null, "Ethnicity is Required");
            return false;
        }
        if (income.equals("")) {
            JOptionPane.showMessageDialog(null, "Income is Required");
            return false;
        }
        if (educationalQualification.equals("")) {
            JOptionPane.showMessageDialog(null, "Educational Qualification is Required");
            return false;
        }
        if (occupation.equals("")) {
            JOptionPane.showMessageDialog(null, "Occupation is Required");
            return false;
        }
        if (sinOrTinNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Gender is Required");
            return false;
        }
        if (senior.equals("")) {
            JOptionPane.showMessageDialog(null, "Are you a senior citizen?");
            return false;
        }
        if (existingAccount.equals("")) {
            JOptionPane.showMessageDialog(null, "Do you have an bank account with us?");
            return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        new SignUpPageTwo("");
    }
    
}
