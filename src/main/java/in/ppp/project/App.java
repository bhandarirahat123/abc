package in.ppp.project;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class App 
{
	 static int mindiff(int[] arr, int n) 
	    { 	        
	        int mindiff = Integer.MAX_VALUE; 
        for(int i=0; i<n-1; i++) 
	            for (int j=i+1; j<n; j++) 
	                if (Math.abs((arr[i] - arr[j]) )< mindiff) {
	               mindiff = Math.abs((arr[i] - arr[j])); 	 }           
	        return mindiff; 
	    } 
	 public static void main(String[] args) 
	    { 	     
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
				 int arr[]=new int[n];
				 for(int i=0;i<arr.length;i++)
				 {
					 arr[i]=sc.nextInt();
				 }
	        System.out.println("Min difference is "+ 
	                              mindiff(arr, arr.length)); 
	      	    } 
}