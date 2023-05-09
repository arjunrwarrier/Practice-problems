/*
5. Create a package p1, create classes Student and Faculty with data members and methods. 
Create a package p2 with classes Student and Faculty with data members and methods.
Now create a class Demo with main program and import both packages and demonstrate how 
to create objects for the classes (same name in different packages).

*/

package p1;

public class Faculty{

int facultyId;
String name;
String section;

public Faculty(){
facultyId =0;
name = " ";
section =" ";
}

public Faculty(int facultyId, String name, String section)
{
this.facultyId =facultyId;
this.name =name;
this.section =section;
}

public void displayFacultyValues()
{
System.out.println("The faculty in package p1, Name: "+name+" faculty id: "+facultyId+" is in Section: "+section);
}

}

