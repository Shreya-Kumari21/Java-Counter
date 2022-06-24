import java.util.Scanner;
import java.lang.Math;

class number{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		int counter=0;
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				counter++;
			}
		}
			
		if(counter==0){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
}