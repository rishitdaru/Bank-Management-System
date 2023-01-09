create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signupPageOne( formNumber varchar(20), name varchar(20), fathersName varchar(20),  dob varchar(20), gender varchar(20), emailAddress varchar(30), maritalStatus varchar(20), address varchar(40), city varchar(25), provinceOrState varchar(25), country varchar(25), postalCode varchar(20) );

show tables;

select * from signupPageOne;

create table signupPageTwo( formNumber varchar(20), ethnicity varchar(20), income varchar(20), educationalQualification varchar(30), occupation varchar(30), sinOrTinNumber varchar(10), senior varchar(5), existingAccount varchar(5) );

show tables;

select * from signupPageTwo;

create table signupPageThree( formNumber varchar(20), accountType varchar(40), cardNumber varchar(25), pinNumber varchar(10), servicesSelected varchar(100));

show tables;

select * from signupPageThree;

create table login(formNumber varchar(20), cardNumber varchar(25), pinNumber varchar(10) );

select * from login;

create table bank(pinNumber varchar(10), date varchar(50), typeOfTransaction varchar(20), amount varchar(20) );

select * from bank;

