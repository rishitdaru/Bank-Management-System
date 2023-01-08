package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 * @author Rishit Daru
 */
public class SignUpPageOne extends JFrame implements ActionListener{
    
    long randomNumber;
    JTextField nameTextField, fathersNameTextField, emailAddressTextField, addressTextField, cityTextField,provinceOrStateTextField, countryTextField, postalCodeTextField;
    JButton nextButton;
    JRadioButton maleRadioButton, femaleRadioButton,otherGenderRadioButton, singleRadioButton, marriedRadioButton, otherMaritalStatusRadioButton; 
    JDateChooser dateChooser;
            
    SignUpPageOne() {
        
        // JFrame Setup
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation (350, 10);
        setLayout(null);
        
        // Display form number
        Random randomNum = new Random();
        randomNumber = Math.abs((randomNum.nextLong() % 9000L) + 1000L);
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
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 18));
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        // Gender Label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        genderLabel.setBounds(100, 290, 200, 30);
        add(genderLabel);
        
        // Gender Radio Buttons
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(300, 290, 60, 30);
        maleRadioButton.setBackground(Color.WHITE);
        add(maleRadioButton);
        
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(390, 290, 80, 30);
        femaleRadioButton.setBackground(Color.WHITE);
        add(femaleRadioButton);
        
        otherGenderRadioButton = new JRadioButton("Other");
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
        singleRadioButton = new JRadioButton("Single");
        singleRadioButton.setBounds(300, 390, 80, 30);
        singleRadioButton.setBackground(Color.WHITE);
        add(singleRadioButton);
        
        marriedRadioButton = new JRadioButton("Married");
        marriedRadioButton.setBounds(390, 390, 80, 30);
        marriedRadioButton.setBackground(Color.WHITE);
        add(marriedRadioButton);
        
        otherMaritalStatusRadioButton = new JRadioButton("Other");
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
        
        // City Label
        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        cityLabel.setBounds(100, 490, 200, 30);
        add(cityLabel);
        
        // City Text Field
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
       
        // Province / State Label
        JLabel provinceOrStateLabel = new JLabel("Province/State:");
        provinceOrStateLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        provinceOrStateLabel.setBounds(100, 540, 200, 30);
        add(provinceOrStateLabel);
        
        // Province/State Text Field
        provinceOrStateTextField = new JTextField();
        provinceOrStateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        provinceOrStateTextField.setBounds(300, 540, 400, 30);
        add(provinceOrStateTextField);
        
        // Country Label
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        countryLabel.setBounds(100, 590, 200, 30);
        add(countryLabel);
        
        // Country Text Field
        countryTextField = new JTextField();
        countryTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        countryTextField.setBounds(300, 590, 400, 30);
        add(countryTextField);
        
        // Postal Code Label
        JLabel postalCodeLabel = new JLabel("Postal Code:");
        postalCodeLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        postalCodeLabel.setBounds(100, 640, 200, 30);
        add(postalCodeLabel);
        
        // Postal Code Text Field
        postalCodeTextField = new JTextField();
        postalCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        postalCodeTextField.setBounds(300, 640, 400, 30);
        add(postalCodeTextField);

        // Add 'Next' button
        nextButton = new JButton("Next");
        nextButton.setBounds(620, 700, 80, 30);
        nextButton.setBackground(Color.BLUE);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String formNumber = "" + randomNumber;
        String name = nameTextField.getText();
        String fathersName = fathersNameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = "";
        if(maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        } else if (otherGenderRadioButton.isSelected()){
            gender = "Other";
        }
        
        String emailAddress = emailAddressTextField.getText();
        
        String maritalStatus = "";
        if(singleRadioButton.isSelected()) {
            maritalStatus = "Single";
        } else if (marriedRadioButton.isSelected()) {
            maritalStatus = "Married";
        } else if (otherMaritalStatusRadioButton.isSelected()){
            maritalStatus = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String provinceOrState = provinceOrStateTextField.getText();
        String country = countryTextField.getText();
        String postalCode = postalCodeTextField.getText();  
        
        checkForValidation( formNumber, name, fathersName, dob, gender, emailAddress, 
                            maritalStatus, address, city, provinceOrState, country, postalCode );
        // At this point all strings are valid
        
        try {
            Conn c = new Conn();
            String query = "insert into signupPageOne values('"+formNumber+"','"+name+"','"+fathersName+"','"+dob+"','"+gender+"','"+emailAddress+"','"+maritalStatus+"','"+address+"','"+city+"','"+provinceOrState+"','"+country+"','"+postalCode+"')";
            c.s.executeUpdate(query);                
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void checkForValidation( String formNumber, String name, String fathersName, String dob, String gender, 
                                    String emailAddress, String maritalStatus, String address, String city, 
                                    String provinceOrState, String country, String postalCode
    ) {

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Required");
            return;
        }
        if (fathersName.equals("")) {
            JOptionPane.showMessageDialog(null, "Father's Name is Required");
            return;
        }
        if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            return;
        }
        if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Gender is Required");
            return;
        }
        if (emailAddress.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Address is Required");
            return;
        }
        if (maritalStatus.equals("")) {
            JOptionPane.showMessageDialog(null, "Marital Status is Required");
            return;
        }
        if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address is Required");
            return;
        }
        if (city.equals("")) {
            JOptionPane.showMessageDialog(null, "City is Required");
            return;
        }
        if (country.equals("")) {
            JOptionPane.showMessageDialog(null, "Country is Required");
            return;
        }
        if (postalCode.equals("")) {
            JOptionPane.showMessageDialog(null, "Postal Code is Required");
        }
    }
    
    public static void main(String args[]) {
        new SignUpPageOne();
    }
    
}
