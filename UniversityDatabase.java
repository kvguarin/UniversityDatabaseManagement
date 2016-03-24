import java.util.Scanner;



public class UniversityDatabase
	{
	public static void main(String[] args) 
		{

			//variables
			int userChoice = 1;

			UniversityCitizen[] array = new UniversityCitizen[20];

			Long number0 = new Long(00123);
			array[0] = new Student("Mickey Mouse", number0, "CS", 2016);



			Long number1 = new Long(00567);
			array[1] = new Professor("Donald Duck", number1, 43212345, "Economics", "01, 01, 1990", "Associate");

			array[2] = new Employee("Bob", number1, 10, "CS", "1/1/11");
			array[3] = new Employee("ALice", number1, 15, "CS", "1/1/11");
			array[4] = new Student("Minnie Mouse", number0, "CS", 2016);



			double totalSalary = 0;
			double averageSalary = 0;
			int countEmployee = 0;
			int numCitizens = array[0].getnumberOfCitizens(); 



			do{


				System.out.println("Please Select a Following Option: ");
				System.out.println("1. Display All Contents in the Database");
				System.out.println("2. Search by individual name");
				System.out.println("3. Print a list of a class of citizens");
				//System.out.println("4: Print average and total salary of the employees");
				System.out.println("5. Exit");

				Scanner scan = new Scanner(System.in);
				userChoice = scan.nextInt();


				switch (userChoice) {
					case 1: //prints all the contents in the database
						for (int i = 0; i < numCitizens; i++) 
							{
								System.out.println(array[i].getClassName() + ", " + array[i]);
							}	

						break;

					case 2:

						System.out.println("Please Enter a Name to Search: ");
						String userSearch = scan.next();

						for (int x = 0; x < array.length; x++){
							if(array[x].getName().contains(userSearch)){
								System.out.println(array[x]);
							}
						}
						break;

					case 3: 


						System.out.println("Please Type Out a following Option: ");
						System.out.println("Employee");
						System.out.println("Student");
						System.out.println("Volunteer");
						System.out.println("Professor");
						System.out.println("Staff");
						System.out.println("Part Time Student");
						System.out.println("Adjunct Professor");
						System.out.println("Administrator");
						System.out.println("Temporary Employee");

						String userOption = scan.next();

						for (int i = 0; i < numCitizens; i++){
							if(array[i].getClassName().equalsIgnoreCase(userOption)) {
								System.out.println(array[i]);
							}
						}

						break;

					//case 4:
						

						// for(int index = 0; index < array.length; index++){
						// 	if (array[index].getClassName().contains("Employee") || array[index].getClassName().contains("Volunteer") 
						// 		|| array[index].getClassName().contains("Professor") || array[index].getClassName().contains("Staff") 
						// 		|| array[index].getClassName().contains("Administrator") || array[index].getClassName().contains("Adjunct")){
								
						// 		totalSalary += array[index].getSalary();
						// 		countEmployee++;
						// 	}
						// }
						// averageSalary = totalSalary / countEmployee;

						// System.out.println("Total Salary for all Employees: $" + totalSalary);
						// System.out.println("Average Salary for all Employees: $" + averageSalary);
					
							
					}


			} while (userChoice != 5 );


		}
	


	}





