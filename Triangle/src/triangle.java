/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HiDAN
 */
import java.util.Scanner;
public class triangle 
{ 

	public static void main(String[] args) 
	{
		int n, c, k, space = 1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n=s.nextInt();
		
		space = n - 1;
		
		  for (k = 1; k<=n; k++)
		  {
		    for (c = 1; c<=space; c++)
		      System.out.print(" ");
		
		    space--;
		
		    for (c = 1; c<= 2*k-1; c++)
		      System.out.print("*");
		
		    System.out.print("\n");
		  }
		 
		  space = 1;
		 
		  for (k = 1; k<= n - 1; k++)
		  {
		    for (c = 1; c<= space; c++)
		      System.out.print(" ");
		 
		    space++;
		 
		    for (c = 1 ; c<= 2*(n-k)-1; c++)
		      System.out.print("*");
		 
		    System.out.println("");
		  }
	}
}