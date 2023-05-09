/*
6. Create Interface StudentFee and declare following method getFee() throws 
InvalidFeeException. This method ask fees from user and throws exception if user enters 
invalid or negative fees Create class Student with members (name, fees) and implement the 
StudentFee Interface
*/

import java.util.InputMismatchException;
import java.util.Scanner;


//interface

interface StudentFee{
abstract void getFee() throws InvalidFeeException;
}


//creating InvalidFeeException class
class InvalidFeeException extends Exception
{
public InvalidFeeException(String s)
{
super(s);
}
}




//Student class
class Student implements StudentFee{
String name;
int fees;
Scanner scanner = new Scanner(System.in);
public void getName(){                                                   //using getName() to get name
System.out.println("\nEnter student name:");
this.name = scanner.next();
}

public void getFee() throws InvalidFeeException,InputMismatchException                 //getFee() implementation
{
System.out.println("\nEnter the fees: ");
this.fees = scanner.nextInt();
if(this.fees<0){
throw new InvalidFeeException("Fees amount should be above zero");                      //error checking
}
}


public void displayStudent(){
System.out.println("\nStudent name: "+name+" fees: "+fees);                                    //method to display values
}
}



//main class
class InterfaceDriver{

public static void main(String[] args){

Student s1 = new Student();
s1.getName();

//try block
try{

s1.getFee();
s1.displayStudent();
}
catch(InvalidFeeException e1)         
{
System.out.println("\nException Handled");
System.out.println(e1.toString());
}
catch(InputMismatchException e2)
{
System.out.println("\nException Handled");
System.out.println("\nFees should be an integer");
System.out.println(e2.toString());
}
//final block 
finally{
System.out.println("The program has ended.");
}

}
}







