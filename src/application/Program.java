package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Employee;
import entities.Rectangle;
import entities.Student;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int controle = 1;
		while (controle == 1) {

			System.out.println("Type:\n"
					+ "1 - Exercise Rectangle\n"
					+ "2 - Exercise Employee\n"
					+ "3 - Exercise Student\n"
					+ "4 - Exercise Statics Member\n"
					+ "5 - Exercise The Bank");
			int getExercise;
			getExercise = sc.nextInt();

			switch (getExercise) {

			// EXERCISE - 01
			case 1:
				System.out.printf("Exercise-01\n\n");
				System.out.println("Enter rectangle width an height: ");
				double recWidth = sc.nextDouble();
				double recHeight = sc.nextDouble();

				Rectangle rectangle = new Rectangle();
				rectangle.width = recWidth;
				rectangle.hight = recHeight;

				System.out.println(rectangle);
				System.out.println("\n**************Exercise-01 End**************\n");

				break;
			// EXERCISE - 02
			case 2:
				System.out.printf("Exercise-02\n\n");
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Gross Salary: ");
				double grossSalary = sc.nextDouble();
				System.out.println("Tax: ");
				double tax = sc.nextDouble();
				
				Employee employee = new Employee();
				employee.name = name;
				employee.grossSalary = grossSalary;
				employee.tax = tax;
				
				System.out.println("\nEmployee " + employee);
				
				System.out.println("\nWich percentage to increase salary? ");
				double percentage;
				percentage = sc.nextDouble();
				employee.increaseSalary(percentage);
				System.out.println("Update data: " + employee);		
				
				System.out.println();
				System.out.println("\n**************Exercise-02 End**************\n");

				break;
			//EXERCISE - 03
			case 3:
				System.out.println("Exercise-03\n\n");
				System.out.println("Nome do Aluno: ");
				String studentyName = sc.nextLine();
				sc.nextLine();
				boolean validation = true;
				int getOption = 1;
				double note1 = 0;
				double note2 = 0;
				double note3 = 0;
				
				while(validation) {
									
					switch (getOption) {
					
					case 1: 
						System.out.println("Nota 1: ");
						note1 = sc.nextDouble();
						getOption = (note1 > 30) ? 1 : 2;
						
						if (getOption == 1) System.out.println("THE NOTE MUST BE LESS THAN 30.00.");
						
						break;
					
					case 2:
						System.out.println("Nota 2: ");
						note2 = sc.nextDouble();
						getOption = (note2 > 35) ? 2 : 3;
						
						if (getOption == 2) System.out.println("THE NOTE MUST BE LESS THAN 35.00.");
						
						break;
					
					case 3:
						System.out.println("Nota 3: ");
						note3 = sc.nextDouble();
						getOption = (note3 > 35) ? 3 : 4;
						
						if (getOption == 3) System.out.println("THE NOTE MUST BE LESS THAN 35.00.");	
						
						
						break;					
					default:
						validation = false;
						break;
					}
				}
				
				Student student = new Student();
				student.note1 = note1;
				student.note2 = note2;
				student.note3 = note3;
				
				System.out.println(student);
				
				System.out.println();
				System.out.println("\n**************Exercise-03 End**************\n");
				break;
				
				//EXERCISE - 04 
			case 4:
				
				System.out.println("What is the dollar price?");
				double price = sc.nextDouble();
				System.out.println("How many dollars will be bought?");
				double dollars = sc.nextDouble();
				
				System.out.println("Amount to be paid in reais = R$ " + String.format("%.2f", CurrencyConverter.converter(price, dollars)));
				
				System.out.println();
				System.out.println("\n**************Exercise-04 End**************\n");
				
				break;
				
			case 5:
				
				System.out.printf("Exercise-05\n\n");
				
				double deposit;
				double withdraw;				
				int number;
				char option;
				String holder;
				Account account;
				
				System.out.print("Enter account number: ");
				number = sc.nextInt();
				
				System.out.print("Enter account holder: ");
				sc.nextLine();
				holder = sc.nextLine();	
								
				System.out.print("Is there an initial deposit (y/n): ");
				option = sc.next().charAt(0);
				
				if(option == 'y' || option == 'Y'){
					
					System.out.print("Enter initial deposit value: ");
					deposit = sc.nextDouble();
					account = new Account(number, holder, deposit);
				} else {
					
					account = new Account(number, holder);					
				}				
				
				System.out.println("Account data: ");
				System.out.println(account);				
								
				System.out.println("Enter a deposit value: ");
				deposit = sc.nextDouble();
				account.deposit(deposit);
				
				System.out.println("Update account data: ");
				System.out.println(account);
							
				System.out.println("Enter a withdraw value: ");
				withdraw = sc.nextDouble();
				account.withdraw(withdraw);
				
				System.out.println("Update account data: ");
				System.out.println(account);
				
				
				System.out.println("\n**************Exercise-05 End**************\n");
				
				break;
				
			default:
				System.out.println("\nInvalid Choice!!!");
				break;
			}

			System.out.println("\nType 1 for came back home menu or 0 for end: ");
			controle = sc.nextInt();

		}

		System.out.println("**************Program End**************");
		sc.close();

	}

}
