import java.util.Scanner;
import java.lang.Math;

class test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your octal: ");
		double num=sc.nextDouble();
		
		int counter=0;
		while(num>0){
			double rem=num%10;
			
			       num=num/10;
				   counter++;
				   rem=rem*Math.pow(8,counter);
		}		   
		System.out.println(num);
	}
}