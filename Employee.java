public class Employee extends UniversityCitizen{

	private int salary;
	private String department;
	private String date;


	public Employee(String name, Long id, int salary,
					String idepartment, String idate){
		super(name, id);
		this.department = idepartment;
		this.date = idate;
	}

	public int getSalary(){
		return this.salary;
	}

	public String getDepartment(){
		return this.department;
	}

	public String getDate(){
		return this.date;
	}

	public void setSalary(int newSalary){
	 	this.salary = newSalary;
	 }

	public void setDepartment(String newDepartment){
	 	this.department = newDepartment;
	 }

	public void setDate(String newDate){
	 	this.date = newDate;
	 }

	 	public String getClassName()
		{
		return "Employee";
		}

	public String toString(){
		String output = super.toString();
		output += " Salary: " + this.salary 
				+ " Department: " + this.department
				+ " Date: " + this.date; 
		return output;
	}

}