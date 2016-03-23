

// TEMPORARY EMPLOYEE
// AUTHOR: Nicholas Muller

public class TemporaryEmployee extends Staff{

	//variables
	String endDate;

	//CONSTRUCTOR
	public TemporaryEmployee(String name, Long id, int salary, String department, 
		String startDate, String title, Boolean unionized, String iendDate){
		super(name, id, salary, department, startDate, title, unionized);
		this.endDate = iendDate;
	}

	//GETTERS
	public String getEndDate(){
		return this.endDate;
	}

	//SETTERS
	public void setEndDate(String inputEndDate){
		this.endDate = inputEndDate;
	}

		 	public String getClassName()
		{
		return "Temp employee";
		}

	// toString method
	public String toString(){
		String output = super.toString();
		output += "End Date: " + this.endDate;
		return output;
	}
}

