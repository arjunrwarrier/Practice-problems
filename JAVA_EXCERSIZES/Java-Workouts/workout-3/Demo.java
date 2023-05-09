/*
5. Create a package p1, create classes Student and Faculty with data members and methods. 
Create a package p2 with classes Student and Faculty with data members and methods.
Now create a class Demo with main program and import both packages and demonstrate how 
to create objects for the classes (same name in different packages).

*/

/*
**Created "package p1 javafiles" folder to store the package p1 java files. Created "package p2 javafiles" folder 
to store package p2 javafiles.  
**Demo.java is the main class, so its not stored on any folder.
**p1  and  p2 are the two packages, it is also added to the github.
*/ 




import p1.Student;  //possible to import only p1 package because of ambiguity
import p1.Faculty;

class Demo{
public static void main(String[] args)
{

//creating package p1 classes objects s1 and f1
p1.Student s1 = new p1.Student(1,"Arun",4); 
p1.Faculty f1 = new p1.Faculty(23, "Ajesh", "Office-Staff");

//calling methods of objects from package p1 
f1.displayFacultyValues();
s1.displayStudentValues();

//creating package p2 classes objects s2 and f2
p2.Student s2 = new p2.Student();
p2.Faculty f2 = new p2.Faculty();

//calling methods of objects from package p2 
System.out.println("\nEnter details manually of student and faculty in package p2\n");

s2.getStudentValues();
f2.getFacultyValues();
f2.displayFacultyValues();
s2.displayStudentValues();


}
}