import java.util.Scanner;
class SwapwithTemp{
public static void main(String [] args){

int num1,num2,temp;
Scanner input = new Scanner(System.in);
System.out.print("Enter 2 numbers :");
num1 = input.nextInt();
num2 = input.nextInt();
temp=num1;
num1=num2;
num2=temp;
System.out.println("The swapped values are :"+num1+" and "+num2);
}
}