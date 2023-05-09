import java.util.Scanner;

class Amstrong{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the 2 limits: ");
int num1 = input.nextInt();
int num2 = input.nextInt();



for(int i=num1;i<num2;i++){
int remainder,temp,amstrong=0;
temp =i;
while(temp!=0){

remainder = temp%10;
amstrong += (remainder*remainder*remainder);
temp/=10;
}
if(i==amstrong){
System.out.println(i);
}
}



}
}

