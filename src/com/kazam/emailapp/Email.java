package com.kazam.emailapp;

import java.util.Scanner;

public class Email {
private String fname;
private String lname;
private String email;
private String department;
private String altEmail;
private String password;
private int mailboxCapacity=500;
private int defaultPassLength=8;
private String companySurfix="askTech.com";


//constructor
public Email(String fname, String lname){
	this.fname=fname;
	this.lname=lname;
	
	//call method asking for department
	this.department=setDepartment();
	
	//call password method
	this.password=randomPassword(defaultPassLength);
	System.out.println("PASSWORD IS: "+this.password);
	
	//combine elements to generate email
	email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department.toLowerCase()+"."+companySurfix;
	
}
//ask for department
private String setDepartment(){
	System.out.print("Enter department\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");
	Scanner in =new Scanner(System.in);
	int depChoice=in.nextInt();
	if(depChoice==1) {return "sales";}
	else if(depChoice==2) {return "dev";}
	else if(depChoice==3) {return "accounts";}
	else {return "";}

}
//generate random password
private String randomPassword(int length) {
	String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ£$!@";
	char[] password=new char[length];
	for(int i=0; i<length; i++) {
		int rand =(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		
	}
	return new String(password);

	
}
//setters
//set mailbox capacity
public void setMailboxCapacity(int capacity) {
	this.mailboxCapacity=capacity;
}
//set altanate email
public void setaltEmail(String altEmail) {
	this.altEmail=altEmail;
}
//change password
public void changePassword(String password) {
	this.password=password;
}
//getters
public int getMailboxCapacity() {return mailboxCapacity;}
public String getAltEmail() {return altEmail;}
public String getPassword() {return password;}

public String showInfo() {
	return "DISPLAY NAME: "+fname+" "+lname+
			"\nCOMPANY EMAIL: "+email+
			"\nMAILBOX CAPACITY: "+mailboxCapacity+ "nb";
}

}
