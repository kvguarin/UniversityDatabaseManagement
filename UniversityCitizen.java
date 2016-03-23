public class UniversityCitizen{
	protected String name;
	protected Long id;
	static int numberOfCitizens = 0;



	public UniversityCitizen(String newname, Long newid){
		
		this.name = newname;
		this.id = newid;
		numberOfCitizens = numberOfCitizens + 1;
	
	}

	public String getName(){
		return this.name;
	}

	public Long getId(){
		return this.id;
	}

	public int getnumberOfCitizens(){
		return this.numberOfCitizens;
	}



	public void setName(String newname){
		this.name = newname;
	}

	public void setId(Long newid){
		this.id = newid;
	}

	public void setNumberofCitizens(int newNumber){
		this.numberOfCitizens = newNumber;
	}
		 	

	public String getClassName()
		{
		return "University Citizen";
		}


	public String toString(){
		String output = "";
		output += "Name: " + this.name 
				+ " ID: " + this.id
				//+ "Number of Citizens: " + this.numberOfCitizens
				; 
		return output;
	}
}