package snippet;

import java.util.Scanner;

public class NumberAddSub

{
	public static void main(String[] args) 	
	{
		
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter Number");

		int num= sc.nextInt();
		
		int numSq=num*num;

		int output=0,output1 = 0,output2 = 0,output3 = 0,output4 = 0;

		if(num%2==0) 
		
		{
			for(int i=num-1; i>=1; i--)
			{
			
				if(i%2==0)
				{
					
					output1 = output1+(i*i);
				}

				else
			
				{
					output2= output2 + (i*i);
					
				}
			
			}

			System.out.println(output1 +" "+ output2);
			System.out.println(output = numSq + output2 -output1);
			
			
		}

		else if(num%2!=0)
		
		{
			
				for(int i=num-1; i>=1; i--)
				{
				
					if(i%2==0)
				{
					output3= output3+i*i;
				}
				
					else
				{
					output4= output4+i*i;
				}
				
				}
				
			System.out.println(output3+" "+output4);
			System.out.println(output = numSq + output3 - output4);
		}
	}

}
