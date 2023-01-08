package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

/**
 * @author Rishit Daru
 */
public class SignUpPageOne extends JFrame {
    JTextField nameTextField, fathersNameTextField, emailAddressTextField, addressTextField, provinceOrStateTextField, countryTextField, postalCodeTextField;
    
    SignUpPageOne() {
        
        // JFrame Setup
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation (350, 10);
        setLayout(null);
        
        // Display form number
        Random randomNum =new Random();
        long randomNumber = Math.abs((randomNum.nextLong() % 9000L) + 1000L);
        JLabel formNumberHeading = new JLabel("APPLICATION FORM NUMBER: " + randomNumber);
        formNumberHeading.setFont(new Font("Raleway", Font.BOLD, 34));
        formNumberHeading.setBounds(100, 20, 650, 40);
        add(formNumberHeading);
        
        // Personal Details Heading
        JLabel personalDetailsHeading = new JLabel("Page 1: Personal Details");
        personalDetailsHeading.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetailsHeading.setBounds(275, 80, 300, 30);
        add(personalDetailsHeading);
        
        // Name Label
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        nameLabel.setBounds(100, 140, 200, 30);
        add(nameLabel);
        
        // Name Text Field
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        // Father's Name Label
        JLabel fathersNameLabel = new JLabel("Father's Name:");
        fathersNameLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        fathersNameLabel.setBounds(100, 190, 200, 30);
        add(fathersNameLabel);
        
        // Father's Name Text Field
        fathersNameTextField = new JTextField();
        fathersNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fathersNameTextField.setBounds(300, 190, 400, 30);
        add(fathersNameTextField);
        
        // Date of Birth Label
        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        dobLabel.setBounds(100, 240, 200, 30);
        add(dobLabel);
        
        // Date Chooser
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        // Gender Label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        genderLabel.setBounds(100, 290, 200, 30);
        add(genderLabel);
        
        // Gender Radio Buttons
        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(300, 290, 60, 30);
        maleRadioButton.setBackground(Color.WHITE);
        add(maleRadioButton);
        
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(390, 290, 80, 30);
        femaleRadioButton.setBackground(Color.WHITE);
        add(femaleRadioButton);
        
        JRadioButton otherGenderRadioButton = new JRadioButton("Other");
        otherGenderRadioButton.setBounds(500, 290, 60, 30);
        otherGenderRadioButton.setBackground(Color.WHITE);
        add(otherGenderRadioButton);
        
        // to prevent multi-select
        ButtonGroup genderRadioButtonsGroup = new ButtonGroup();
        genderRadioButtonsGroup.add(maleRadioButton);
        genderRadioButtonsGroup.add(femaleRadioButton);
        genderRadioButtonsGroup.add(otherGenderRadioButton);

        
        // Email Address Label
        JLabel emailAddressLabel = new JLabel("Email Address:");
        emailAddressLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        emailAddressLabel.setBounds(100, 340, 200, 30);
        add(emailAddressLabel);
        
        // Email AddressText Field
        emailAddressTextField = new JTextField();
        emailAddressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailAddressTextField.setBounds(300, 340, 400, 30);
        add(emailAddressTextField);
        
        // Marital Status Label
        JLabel maritalStatusLabel = new JLabel("Marital Status:");
        maritalStatusLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        maritalStatusLabel.setBounds(100, 390, 200, 30);
        add(maritalStatusLabel);
        
        // Marital Status Radio Buttons
        JRadioButton singleRadioButton = new JRadioButton("Single");
        singleRadioButton.setBounds(300, 390, 80, 30);
        singleRadioButton.setBackground(Color.WHITE);
        add(singleRadioButton);
        
        JRadioButton marriedRadioButton = new JRadioButton("Married");
        marriedRadioButton.setBounds(390, 390, 80, 30);
        marriedRadioButton.setBackground(Color.WHITE);
        add(marriedRadioButton);
        
        JRadioButton otherMaritalStatusRadioButton = new JRadioButton("Other");
        otherMaritalStatusRadioButton.setBounds(500, 390, 60, 30);
        otherMaritalStatusRadioButton.setBackground(Color.WHITE);
        add(otherMaritalStatusRadioButton);
        
        // to prevent multi-select
        ButtonGroup maritalStatusRadioButtonsGroup = new ButtonGroup();
        maritalStatusRadioButtonsGroup.add(singleRadioButton);
        maritalStatusRadioButtonsGroup.add(marriedRadioButton);
        maritalStatusRadioButtonsGroup.add(otherMaritalStatusRadioButton);
        
        // Address Label
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        addressLabel.setBounds(100, 440, 200, 30);
        add(addressLabel);
        
        // Address Text Field
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
       
        // Province / State Label
        JLabel provinceOrStateLabel = new JLabel("Province/State:");
        provinceOrStateLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        provinceOrStateLabel.setBounds(100, 490, 200, 30);
        add(provinceOrStateLabel);
        
        // Province/State Text Field
        provinceOrStateTextField = new JTextField();
        provinceOrStateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        provinceOrStateTextField.setBounds(300, 490, 400, 30);
        add(provinceOrStateTextField);
        
        // Country Label
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        countryLabel.setBounds(100, 540, 200, 30);
        add(countryLabel);
        
        // Country Text Field
        countryTextField = new JTextField();
        countryTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        countryTextField.setBounds(300, 540, 400, 30);
        add(countryTextField);
        
        // Postal Code Label
        JLabel postalCodeLabel = new JLabel("Postal Code:");
        postalCodeLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        postalCodeLabel.setBounds(100, 590, 200, 30);
        add(postalCodeLabel);
        
        // Postal Code Text Field
        postalCodeTextField = new JTextField();
        postalCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        postalCodeTextField.setBounds(300, 590, 400, 30);
        add(postalCodeTextField);

        // Add 'Next' button
        JButton nextButton = new JButton("Next");
        nextButton.setBounds(620, 660, 80, 30);
        nextButton.setBackground(Color.BLUE);
        nextButton.setForeground(Color.WHITE);
        add(nextButton);
        
        setVisible(true);
    }
    
    public static void main(String args[]) {
        new SignUpPageOne();
    }
    
}
