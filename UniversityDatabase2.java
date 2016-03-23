



import java.util.Scanner;

public class UniversityDatabase2{

	public static void main(String[] args) {
		
		UniversityCitizen[] database = new UniversityCitizen[10];

		database[0] = new Student("Mickey Mouse", 00123, "CS", 2016);
		database[1] = new Professor("Donald Duck", 00567, 43212345, "Economics", "01, 01, 1990", "Associate");

		Scanner scan = new Scanner();

		System.out.println("Please Select a Following Option: ");

		System.out.println("1. Display All Contents in the Database");

		System.out.println("2. Search by individual name");

		System.out.println("3. Print a list of a class of citizens");

		int userInput = scan.nextInt();

		if (userInput == 1){
			for (int i = 0; i < database.length; i++){
				System.out.println(database[i]);
			}
		}

		else if (userInput == 2){
			System.out.println("Please input Name.");
		}

		else if (userInput == 3){

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

			for (int i = 0; i < database.length; i++){
				if(database[i].getClassName().equals(userOption)){
					System.out.println(database[i]);

				}
			}
		}

	}
}


/*


public class UniversityDatabase
	{
	public static void main(String[] args) 
		{
		UniversityCitizen[] array = new UniversityCitizen[9];

		array[0] = new Student("Mickey Mouse", 00123, "CS", 2016);
		array[1] = new Professor("Donald Duck", 00567, 43212345, "Economics", "01, 01, 1990", "Associate");


		for (int i = 0; i < array.length; i++) 
			{
			System.out.println(array[i].getClassName() + ", " + array[i]);
			}


		}
	


	}

	*/
