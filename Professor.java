// AUTHOR: Nicholas Muller

public class Professor extends Employee{

	String title;

	//CONSTRUCTOR
	public Professor(String name, Long id, int salary, String department, String startDate, String
				ititle){
		super(name, id, salary, department, startDate);
		this.title = ititle;
	}

	//GETTERS
	public String getTitle(){
		return this.title;
	}

	//SETTERS
	public void setTitle(String inputTitle){
		this.title = inputTitle;
	}

	
	public String getClassName()
		{
		return "Professor";
		}

	// toString method
	public String toString(){
		String output = super.toString();
		output += " Title: " + this.title;
		return output;
	}
}

