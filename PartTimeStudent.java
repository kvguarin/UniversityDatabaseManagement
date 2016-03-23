// PartTimeStudentClass

public class PartTimeStudent extends Student
{
	protected String companyName;



	public PartTimeStudent(String name, Long id, String major, int graduationYear, String companyName){
		
		super(name, id, major, graduationYear);
		this.companyName = companyName;
}

public String getCompanyName(){
	return this.companyName;
}


public void PartTimeStudent(String inputcompanyName){
	this.companyName = inputcompanyName;
}

	 	public String getClassName()
		{
		return "Part time student";
		}

public String toString(){

	String output = "";
	output = this.companyName + "" + this.companyName;
	return output;
}
}



