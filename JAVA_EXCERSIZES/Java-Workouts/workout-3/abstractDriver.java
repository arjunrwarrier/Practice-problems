/*
4. Create abstract class Car
a. Define an abstract method ignition()
b. Define a non-abstract/normal method changeGear(). Is this allowed?   Yes.
c. Create concrete class Sedan. Overload ignition method
d.Inside the main program, Create instance of Sedan and invoke ignition() and changeGear() 
methods. Does the program execute?    Yes the program executes.
e. Define a variable noOfWheels in Car class. Can it be accessed in Sedan class?  Yes it can be accessed.
*/



//abstract class Car

abstract class Car{

int noOfWheels;             //variable noOfWheels

abstract void ignition();

//normal method in abstract class Car
//normal method is possible in abstract class
public void changeGear(){
System.out.println("\n The  gear have been changed...\n");
}
}




//concrete class Sedan
class Sedan extends Car{
void ignition(){
System.out.println("\nThe engine have been started\n");      
}

//noOfWheels can be accessed by Sedan, 
//method to display the number of wheels.
void displayWheels(int n){
this.noOfWheels = n;
System.out.println("\nThe Sedan have "+noOfWheels+" wheels on it\n");
}

}




//main class

class abstractDriver{
public static void main(String[]  args)
{

Sedan s1 = new Sedan();      //object of class Sedan
s1.ignition();                         //invoking methods changeGear and ignition
s1.changeGear();
s1.displayWheels(4);            //method to show noOfWheels can be accessed

}
}

