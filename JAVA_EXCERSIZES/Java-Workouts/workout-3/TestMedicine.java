/*
2. Create a class Medicine to represent a drug manufactured by a pharmaceutical company. 
Provide a function displayLabel() in this class to print Name and address of the company. 
Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the 
displayLabel() function in each of these classes to print additional information suitable to the 
type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in 
case of ointments it could be “for external use only” etc.
Create a class TestMedicine. Write main function to do the following:
Create three medicine object of the type as decided by a randomly generated integer in the 
range 1 to 3.
*/





import java.lang.Math;

//base class

class Medicine {

public void displayLabel() {
System.out.println(" \n The   MLI  (MedLabIn) \n\tBangalore\n");
}
}



// class Tablet inheriting Medicine

class Tablet extends Medicine {
 // will override
public void displayLabel() {

System.out.println("\nTablets should be kept in a cool dry place, not to be placed in direct sunlight\n");
// displayLabel() for Tablet class, will override the Medicine method.

}

}





// class Syrup inheriting Medicine

class Syrup extends Medicine {

// will override
public void displayLabel() {
System.out.println("\nThis syrup is not for children, should be taken as informed by the physician\n");
}

}





// class Ointment inheriting Medicine

class Ointment extends Medicine {

public void displayLabel() {
System.out.println("\nOintment is for external use only. Once used, keep the seal tightly closed\n");
}

}






// main funtion class

class TestMedicine {
public static void main(String[] args) {

System.out.println("\nThe randomly generated objects\n");

boolean med = false, t = false, s = false, o = false;
int counter = 0;


while (counter < 4) {

int random = (int) (Math.random() * (4 - 1 + 1) + 1);

if (random == 1 && med != true) 
{
Medicine m = new Medicine();
System.out.println("\n***The Base class Medicine object created and displayLabel has been called.***\n");
m.displayLabel();
med = true;
counter++;
}
else if (random == 2 && t != true)
{
Tablet t1 = new Tablet();
System.out.println("\n***The child class Tablet object created and displayLabel has been called.***\n");
t1.displayLabel();
t = true;
counter++;
}
else if (random == 3 && s != true)
{

Syrup s1 = new Syrup();
System.out.println("\n***The child class Syrup object created and displayLabel has been called.***\n");
s1.displayLabel();
s = true;
counter++;

}
else if (random == 4 && o != true)
{
Ointment o1 = new Ointment();
System.out.println("\n***The child class Ointment object created and displayLabel has been called.***\n");
o1.displayLabel();
o = true;
counter++;
}


}

}
}