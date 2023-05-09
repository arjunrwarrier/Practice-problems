/*
2. Create a class MathFunction containing method ‘multiply’ to calculate multiplication of 
following arguments.
 two integers
 two float
 one float and one integer
*/




class MathFunction{

void multiply(int m1, int m2){

System.out.println("Result: "+m1*m2);

}

void multiply(float m1, float m2){

System.out.println("Result: "+m1*m2);

}

void multiply(float m1, int m2){

System.out.println("Result: "+m1*m2);

}

}

class MathFunctionDriver{
public static void main(String[] args){

MathFunction o1=new MathFunction();
o1.multiply(2,3);
o1.multiply(2.0f,3.0f);
o1.multiply(2.0f,3);

}
}
