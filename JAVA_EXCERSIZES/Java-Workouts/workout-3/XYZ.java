/*
1. 
Create three classes.
Faculty (facultyid, salary)
FullTimeFaculty (basic, allowance) inherits class Faculty
PartTimeFaculty (hour, rate) inherits class Faculty
Create a method for accepting input in FullTimeFaculty and PartTimeFaculty, but salary 
should not be accepted. Salary is calculated on the basis of (basic+allowance) for 
FullTimeFaculty and (hour*rate) for PartTimeFaculty. Also create method in above classes to 
display faculty data.
Create another class(say XYZ) for main method and store 2 fulltime and 2 parttime faculty 
information. Also print their details.
*/


import java.util.Scanner;

class Faculty{

int facultyid;
int salary;
Scanner input = new Scanner(System.in);

}

class FullTimeFaculty extends Faculty{

int basic;
int allowance;

void fullTimeInput(){
System.out.println("Enter Full time facultyId: ");
facultyid=input.nextInt();
System.out.println("Enter the basic salary: ");
basic=input.nextInt();
System.out.println("Enter the allowance: ");
allowance=input.nextInt();

}



void fullTimeOutput(){
salary=basic+allowance;
System.out.println("The total salary of fulltime faculty with id: "+facultyid+" basic salary: "+basic+" allowance: "+allowance+" is :"+salary);

}

}



class PartTimeFaculty extends Faculty{

int hour;
int rate;
void partTimeInput(){
System.out.println("Enter Part time facultyId: ");
facultyid=input.nextInt();
System.out.println("Enter the worktime in hours: ");
hour=input.nextInt();
System.out.println("Enter the hourly rate: ");
rate=input.nextInt();

}




void partTimeOutput(){
salary=hour*rate;
System.out.println("The total salary of parttime faculty with id: "+facultyid+" working hour: "+hour+" hourly rate: "+rate+" is :"+salary);

}


}


class XYZ{

public static void main(String[] args){

//public static Scanner input = new Scanner(System.in);

FullTimeFaculty f1 = new FullTimeFaculty();
PartTimeFaculty p1= new PartTimeFaculty();
FullTimeFaculty f2 = new FullTimeFaculty();
PartTimeFaculty p2= new PartTimeFaculty();

f1.fullTimeInput();
p1.partTimeInput();

f1.fullTimeOutput();
p1.partTimeOutput();


f2.fullTimeInput();
p2.partTimeInput();

f2.fullTimeOutput();
p2.partTimeOutput();



}

}