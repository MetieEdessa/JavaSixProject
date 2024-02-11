package com.week3JavaProject;

import java.util.Scanner;
import java.util.*;

//public class ThrowExcep{
	


public class ExceptionHomework {

			public static void main(String[] args) throws Exception {
				
				{
			        Scanner scanner = new Scanner(System.in);
			        boolean isValid = false;
			        int Grade = 0; 
			        
			        while (!isValid){
			            isValid = true;
			            
			            try {
			                System.out.print("Enter Grade: ");
			                Grade = scanner.nextInt();
			            }
			            catch (InputMismatchException e) {
			                isValid = false;
			                System.out.println("Grade should be integer.");
			            }
			            finally {
			              scanner.nextLine();
			            }
			        }
			        
			            if (Grade >= 90){
			        		System.out.println('A');
			        		}
			        	else if (Grade >=80) {
			        			System.out.println('B');
			        			}
			        	else if (Grade >=70){
			        			System.out.println('C');
			        			}
			        	else if (Grade >=60){
			        			System.out.println('D');
			        			}
			        	else if (Grade <= 59){
			        			System.out.println('F');
			        			}
			    }
			}
}
			
			

//			
				  
			
				
				
					 

//						try { 
//							netSalary =salary +bonus; {
//							System.out.println("You net salary for the month is:"+ netSalary);
//							}
//						
//						}
//						catch (Exception e) {
//							System.out.println("Not found Double() value ");
//						}
//					 netSalary = salary +bonus;
//						salary = salary - bonus;
//						
				//	 netSalary =salary +bonus; {
						 
//	System.out.println("You net salary for the month is:"+ netSalary);
////							}
////				}
//					 }
//			}
//			}
//
//			private static Exception ArithmenticException(String string) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//}


						
////						
//			public int grade;
//						
//			Scanner sc1 = new Scanner(System.in);
//						
//			System.out.println("Enter your grade");
//								
//			int grade = sc1.nextInt();
//			System.out.println("Enter your grade");
//							
//								
//		try { 
//				if (grade>=80){
//				System.out.println("You passe");
//									
//				}catch (Exception e) {
//				System.out.println("Try again");
//				}finally {
//									
//					scanner.close();
						
						
//			
//							}
//
//				}	
//			


			


