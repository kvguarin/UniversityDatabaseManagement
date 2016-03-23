public class Administrator extends Staff
	{
	private int yearlyBonus;

	public Administrator(String name, Long id, int salary, String department, String date, String title, Boolean unionized, int aYearlyBonus)
		{
		super(name, id, salary, department, date, title, unionized);
		this.yearlyBonus = aYearlyBonus;
		} // end constructor
	
	// getters
	public int getYearlyBonus()
		{
		return this.yearlyBonus;
		}
	public String getClassName()
		{
		return "Administrator";
		}

	// setters
	public void setYearlyBonus(int newYearlyBonus)
		{
		this.yearlyBonus = newYearlyBonus;
		}


			 	public String getClassName()
		{
		return "Administrator";
		}

	public String toString()
		{
		String output = super.toString();
		output += " Yearly Bonus: " + this.yearlyBonus;
		return output;
		}


	}




