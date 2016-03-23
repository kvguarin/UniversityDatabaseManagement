
// AUTHOR: Nicholas Muller

public class AdjunctProfessor extends Professor{

	String companyName;

	//CONSTRUCTOR
	public AdjunctProfessor(String name, Long id, int salary, String department, 
			String startDate, String newcompanyName, String title){
		super(name, id, salary, department, startDate, title);
		this.companyName = newcompanyName;
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
		return "Adjunct Professor";
		}

	// toString method
	public String toString(){
		String output = super.toString();
		output += "Company Name: " + this.companyName;
		return output;
	}
}