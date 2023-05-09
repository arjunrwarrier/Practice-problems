/*
8. Write a program to swap the value of two numbers by call by value and call by reference 
methods
*/


class swap{
int num1, num2;

swap(int n1, int n2)
{
num1=n1;
num2=n2;
}

public void swapvalue(int n1, int n2)                     //pass by value
{
int temp=n1;
n1=n2;
n2=temp;
System.out.println("The swapped values are :"+n1+" and "+n2);
}

public void swapvalue(swap s)                             //pass by reference
{
int temp=s.num1;
s.num1=s.num2;
s.num2=temp;
System.out.println("The swapped values are: "+num1+" and "+num2);
}

}



class swapDriver{
public static void main(String[] args){

swap s1= new swap(10,20);


//pass by value
s1.swapvalue(34,56);

//pass by reference
s1.swapvalue(s1);

}
}