 import java.util.Scanner;
public class Armstrong
{
public static void main(String[] args)
{
int num,number,temp,total=0;
System.out.println("enter a 3 digit number");
Scanner scanner=new Scanner(System.in);
num=scanner.nextInt();
scanner.close();
number=num;
for(;number!=0;number/=10)
{
temp=number%10;
total=total+temp*temp*temp;
}
if(total==number)
System.out.println(num+"is an Armstrong number");
else
System.out.println(num+"is not an Armstrong number");
}
}
