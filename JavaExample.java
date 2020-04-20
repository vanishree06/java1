import java.util.Scanner;
package com.beginnersbook;
public class JavaExample
{
public void calculate(int p,int t,double r,int n)
{
double amount=p*Math.pow(1+(r/n),n*t);
double cinterest=amount-p;
System.out.println("compound interest after " +t+ "years:"cinterest);
System.out.println("amount after" +t+ "years:"+amount);
}
public static void main(String arrgs[])
{
JavaExample obj=new JavaExample();
obj.calculate(2000,5,.08,12);
}
}
