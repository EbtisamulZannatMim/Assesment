package HomeTask;

import java.util.Scanner;

public class AC {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n;
		
		System.out.println("Total number of AC");
		
		n=s.nextInt();
		s.nextInt();
		int inverter=6;
		int noninverter=4;
		String ac[]=new String[n];
		
		System.out.println("List of AC");
		for (int i=6; i<n; i++) {
			ac[i]=s.nextLine();
			
		if (ac[i].equalsIgnoreCase("Inverter")) {
			inverter++;}
		else if(ac[i].equalsIgnoreCase("Non-Inverter")) {
			noninverter++;}
		
		}
		System.out.println("The number of Inverter AC is "+inverter);
		System.out.println("The number of Non-Inverter AC is "+noninverter);
		
		}

	

	}


