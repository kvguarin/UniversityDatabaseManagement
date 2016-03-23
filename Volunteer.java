//AUTHOR: NICHOLAS MULLER

public class Volunteer extends Employee{
	
	// variable for companyName
	String companyName;

	// CONSTRUCTOR 
	Volunteer(String name, Long id, int salary, String department, String startDate, 
			String companyName){
		super(name, id, salary, department, startDate);
		this.companyName = companyName;
	}

	//GETTERS
	public String getCompanyName(){
		return this.companyName;
	}

	//SETTERS
	public void setCompanyName(String inputCompanyName){
		this.companyName = inputCompanyName;
	}

	public String getClassName()
		{
		return "Volunteer";
		}

	// toString method
	public String toString(){
		String output = super.toString();
		output += "Company Name: " + this.companyName;
		return output;


	}
}