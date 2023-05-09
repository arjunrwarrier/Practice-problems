/*
5. Create a package p1, create classes Student and Faculty with data members and methods. 
Create a package p2 with classes Student and Faculty with data members and methods.
Now create a class Demo with main program and import both packages and demonstrate how 
to create objects for the classes (same name in different packages).

*/

package p1;

public class Student{

int rollNumber;
String name;
int semester;

public Student(){
rollNumber =0;
name = " ";
semester =0;
}

public Student(int roll, String name, int sem)
{
this.rollNumber = roll;
this.name = name;
this.semester = sem;
}

public void displayStudentValues()
{
System.out.println("The student in package p1, Name: "+name+" Rollnumber: "+rollNumber+" is in Semester: "+semester);
}

}

