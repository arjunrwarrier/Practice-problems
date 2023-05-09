import java.util.Scanner;

class SwapwithoutTemp{

public static void main(String[] args){

int num1,num2;
Scanner input = new Scanner(System.in);
System.out.println("Enter 2 numbers : ");
num1 = input.nextInt();
num2 = input.nextInt();

num1=num1+num2;
num2=num1-num2;
num1=num1-num2;

System.out.println("The swapped values are :"+num1+" and "+num2);

}
}