package com.yash.internsDMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author mukesh.sen
 *
 */
public class App {
	
	//Added some more comments from Mukesh-----
	
	public static void main(String[] args) {
		// comments added....
		System.out.println("INTERNS DMS STARTED.................");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		boolean go= true;
		
		while (go) {
			System.out.println("****** Press 1 for Register new Interns *******");
			System.out.println("****** Press 2 for View All Interns *******");
			System.out.println("****** Press 3 for view single Interns *******");
			System.out.println("****** Press 4 for Update Interns *******");
			System.out.println("****** Press 5 for Delete Interns *******");
			System.out.println("****** Press 6 for Exit App *******");
			
			try {
				int input= Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					//Add new Interns
					// taking input from users
					System.out.println("Enter Intern ID: ");
					int iId = Integer.parseInt(br.readLine());
					
					break;

				default:
					break;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
