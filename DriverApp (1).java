package Transaction;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		int transaction;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		transaction =sc.nextInt();
		int trans[]=new int[transaction];
		int i;
		for (i=0;i<trans.length;i++) {
			System.out.println("enter the values of array " +(i+1));
			trans[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(trans));
		System.out.println("enter the total no of targets that needs to be achieved");
		int target=sc.nextInt();
		int sum;
		int flag;
		for(int j=1;j<=target;j++) {
			System.out.println("enter the value of target "+j);
			int singleTarget=sc.nextInt();
			sum=0;
			flag=0;
			for(int k=0;k<trans.length;k++)
			{
				sum=sum+trans[k];
				if(sum>=singleTarget)
				{
					flag=1;
					System.out.println("Target achieved after "+(k+1)+" transactions ");
					break;
				}
			}
		if(flag==0) {
			System.out.println(" Given target is not achieved ");
		}
		}
		
		}
		

	}


