//THIS IS THE STUDENT CLASS
public class Student extends UniversityCitizen
{
	protected String major;
	protected int graduationYear;



	public Student(String name, Long id, String inputMajor, int inputGraduationYear){
		super(name, id);
		this.major = inputMajor;
		this.graduationYear = inputGraduationYear;
}

	public String getMajor(){
		return this.major;
	}
	public int getGraduationYear(){
		return this.graduationYear;
	}

	public void setMajor(String inputMajor){
		this.major = inputMajor;
	}
	public void setGraduationYear(int inputGraduationYear){
		this.graduationYear = inputGraduationYear;
	}


	 public String getClassName()
		{
		return "Student";
		}


	public String toString(){

	String output = super.toString();
	output += " Major: " + this.major 
			+ " Graduation Year: " + this.graduationYear;
	return output;
}


}
