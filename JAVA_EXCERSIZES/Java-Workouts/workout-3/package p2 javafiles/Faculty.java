/*
5. Create a package p1, create classes Student and Faculty with data members and methods. 
Create a package p2 with classes Student and Faculty with data members and methods.
Now create a class Demo with main program and import both packages and demonstrate how 
to create objects for the classes (same name in different packages).

*/

package p2;
import java.util.Scanner;

public class Faculty{

int facultyId;
String name;
String section;

Scanner scanner = new Scanner(System.in);

public void getFacultyValues()
{
System.out.println("\nEnter Faculty Name: ");
name = scanner.next();
System.out.println("\nEnter ID: ");
facultyId = scanner.nextInt();
System.out.println("\nEnter the section: ");
section = scanner.next();
}

public void displayFacultyValues()
{
System.out.println("\nThe faculty in package p2, Name: "+name+" faculty id: "+facultyId+" is in section: "+section+"\n");
}

}

