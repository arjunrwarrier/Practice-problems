import java.util.Scanner;

class ReverseNumber{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number : ");
int number = input.nextInt();

int reverse = 0,remainder;

while(number!=0){

remainder = number%10;

reverse = reverse * 10 +remainder;

number = number/10;
}

System.out.println("The reverse of "+number+" is "+reverse);

}
}




