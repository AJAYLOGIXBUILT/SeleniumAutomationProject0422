package PakagesC6pro;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Calculation {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter A:");
			int a =sc.nextInt();
			
			System.out.println("Enter B:");
			int b =sc.nextInt();
						
			try
			{
				int c= a/b;
				System.out.println("Division ="+c);
			}
			catch(Exception e)
			{
					System.out.println("Getting exception error");
			}
								
			System.out.println("Rest of code");
			System.out.println("Program continue");
			
		}
		
	}


