import java.util.Scanner;

/*
3. Create a class Student with two members : rollno and percentage.
Create default and parameterized constructors. Create method show() to display information.
Create another class CollegeStudent inherits Student class. Add a new member semester to it. 
Create default and parameterized constructors. Also override show() method.
Create another class SchoolStudent inherits Student class. Add a new member classname (eg 12th 
,10th etc.) to it. Create default and parameterized constructors. Also override show() method.
Create a class (say XYZ) with main method that carries out the operation of the project:
-- has array to store objects of any class (Student or CollegeStudent, SchoolStudent)
--create two CollegeStudent and three SchoolStudent record objects and store them inside the 
array
-- display all record from the array
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of 
CollegeStudent.
--count how many students are having A grade, if for A grade percentage >75

*/





//class student
class Student {

protected int rollno;
protected double percentage;

public Student() {
rollno = 0; // default constructor
percentage = 0.0;
}

public Student(int roll, double percent) {
this.rollno = roll; // parametarised constructor
this.percentage = percent;
}

public void show() {
System.out.println("\nRollNo: " + rollno + " Percentage: " + percentage + " of the Student.\n");
}
}




//class CollegeStudent
class CollegeStudent extends Student {

protected int semester;

public CollegeStudent() {
rollno = 0;
percentage = 0.0;
semester = 0;
}

public CollegeStudent(int roll, double percent, int sem) {
this.rollno = roll;
this.percentage = percent;
this.semester = sem;
}

public void show() {
System.out.println("\nRollNo: " + rollno + " Percentage " + percentage + " of the College Student in semester "+ semester + "\n");
        
}

}






//class SchoolStudent
class SchoolStudent extends Student {

protected int classname;

public SchoolStudent() {
rollno = 0;
percentage = 0;
classname = 0;
}

public SchoolStudent(int roll, double percent, int classname) {
this.rollno = roll;
this.percentage = percent;
this.classname = classname;
}

public void show() {
System.out.println("\nRollNo: " + rollno + " Percentage " + percentage + " of the School Student in " + classname + "th\n");
}

}




//main class

class StudentDriver {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);



// creating Array of base class Student, child class CollegeStudent and SchoolStudent.

Student[] st;

CollegeStudent[] cs;

SchoolStudent[] ss;



//Creating 3 SchoolStudent and 2 CollegeStudent 

ss = new SchoolStudent[3];

cs = new CollegeStudent[2];

//Storing records in the object of SchoolStudent and CollegeStudent


ss[0] = new SchoolStudent(1, 56 , 10);
ss[1] = new SchoolStudent(2, 89 , 12);
ss[2] = new SchoolStudent(3, 67 , 7);

cs[0] = new CollegeStudent(11, 45, 2);
cs[1] = new CollegeStudent(12, 79, 6); 




// displaying records from the array.
// st[0].show(); used base class object for testing
System.out.println("\n The student details stored in arrays.\n");

for(int i=0;i<ss.length;i++){    
ss[i].show();
}

for(int i=0;i<cs.length;i++){
cs[i].show();
}


// Students with A grade in the records.

System.out.println("\nThe students with A grade in College and School.\n");
int count = 0;
for (CollegeStudent c : cs) { // using foreach loop
if (c.percentage > 75.0) {
System.out.println("\nCollege Student  RollNO: " + c.rollno + " percentage: " + c.percentage + " in semester: "+ c.semester + " have A grade.");
count++;
            }
}
for (SchoolStudent s : ss) {// using foreach loop
if (s.percentage > 75.0) {
System.out.println("\nSchool Student  RollNO: " + s.rollno + " percentage: " + s.percentage + " in class: "+ s.classname + " have A grade.");
count++;
            }
}
System.out.println("\nTotal number of Students in college and School who have A grade is \n" + count);





// Searching record on the basis of rollnumber

count =0;//using above used count to view message if rollnumber is not present

System.out.print("\nEnter rollNumber to check whether the student is a college student or school student: ");
int rollNumber = scanner.nextInt();

for (int i = 0; i < cs.length; i++) {
if (rollNumber == cs[i].rollno) {
System.out.println("\nThis is a college Student, RollNumber: " + cs[i].rollno + " percentage: "+ cs[i].percentage + " in semester: " + cs[i].semester + "\n");
count++;
}
}
for (int i = 0; i < ss.length; i++) {
if (rollNumber == ss[i].rollno) 
{
System.out.println("\nThis is a School Student, RollNumber: " + ss[i].rollno + " percentage: "+ ss[i].percentage + " in class: " + ss[i].classname);
count++;
}
}

if(count==0) System.out.println("\nThis rollnumber is not present in the record\n"); 

}
}
