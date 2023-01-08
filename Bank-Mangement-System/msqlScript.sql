create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signupPageOne( formNumber varchar(20), name varchar(20), fathersName varchar(20),  dob varchar(20), gender varchar(20), emailAddress varchar(30), maritalStatus varchar(20), address varchar(40), city varchar(25), provinceOrState varchar(25), country varchar(25), postalCode varchar(20) );

show tables;

select * from signupPageOne;

create table signupPageTwo( formNumber varchar(20), ethnicity varchar(20), income varchar(20), educationalQualification varchar(30), occupation varchar(30), sinOrTinNumber varchar(10), senior varchar(5), existingAccount varchar(5) );

show tables;

select * from signupPageTwo;