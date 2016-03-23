



public class UniversityDatabase
	{
	public static void main(String[] args) 
		{
		UniversityCitizen[] array = new UniversityCitizen[2];

		Long number0 = new Long(00123);

		array[0] = new Student("Mickey Mouse", number0, "CS", 2016);

		Long number1 = new Long(00567);
		array[1] = new Professor("Donald Duck", number1, 43212345, "Economics", "01, 01, 1990", "Associate");


		for (int i = 0; i < array.length; i++) 
			{
			System.out.println(array[i].getClassName() + ", " + array[i]);
			}


		}
	


	}




