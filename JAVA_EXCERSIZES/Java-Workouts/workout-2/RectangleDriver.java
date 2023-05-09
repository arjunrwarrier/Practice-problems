/*
3. Write a program - a class Rectangle having fields length & breadth and methods getArea() 
& getPerimeter(), then create the object of the class initialize the fields and display the area & 
perimeter of the rectangle. Now overload the rectangle constructor with one and two 
parameters.
*/


class Rectangle{
int length=2, breadth=5;

//initialisation
Rectangle(){
this.length=length;
this.breadth=breadth;
}

//one argument
Rectangle(int length){
this.length=length;
}

//two arguments
Rectangle(int length, int breadth){
this.length=length;
this.breadth=breadth;
}

//area function
void getArea(){

System.out.println("The area is: "+length*breadth);

}

//perimeter funtion
void getPerimeter(){

System.out.println("The perimeter is: "+2*(length+breadth));

}


}


class RectangleDriver{
public static void main(String[] args){

Rectangle r1= new Rectangle();    //initialising 
r1.getArea();
r1.getPerimeter();

Rectangle r2= new Rectangle(3);    //overloading with one value
r2.getArea();
r2.getPerimeter();

Rectangle r3= new Rectangle(4,6);   //overloading with two value
r3.getArea();
r3.getPerimeter();


}
}
