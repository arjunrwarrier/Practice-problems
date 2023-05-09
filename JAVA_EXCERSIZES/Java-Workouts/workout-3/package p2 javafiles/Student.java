/*
5. Create a package p1, create classes Student and Faculty with data members and methods. 
Create a package p2 with classes Student and Faculty with data members and methods.
Now create a class Demo with main program and import both packages and demonstrate how 
to create objects for the classes (same name in different packages).

*/

package p2;
import java.util.Scanner;

public class Student{

int rollNumber;
String name;
int classname;

Scanner scanner = new Scanner(System.in);

public void getStudentValues()
{
System.out.println("\nEnter Student Name: ");
name = scanner.next();
System.out.println("\nEnter rollNumber: ");
rollNumber = scanner.nextInt();
System.out.println("\nEnter the class: ");
classname = scanner.nextInt();
}

public void displayStudentValues()
{
System.out.println("\nThe student in package p2, Name: "+name+" Rollnumber: "+rollNumber+" is in class: "+classname+"th\n");
}

}

