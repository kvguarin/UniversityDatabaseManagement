
public class Staff extends Employee
	{
	protected String title;
	protected Boolean unionized;

	public Staff(String name, Long id, int salary, String department, String date, String aTitle, Boolean aUnionized)
		{

		super(name, id, salary, department, date);
		this.title = aTitle;
		this.unionized = aUnionized;
		} // end constructor

	// getters
	public String getTitle()
		{
		return this.title;
		}

	public Boolean getUnionized()
		{
		return this.unionized;
		}

	public String getClassName()
		{
		return "Staff";
		}
	
	// setters
	public void setTitle(String newTitle)
		{
		this.title = newTitle;
		}
	public void setUnionized(Boolean newUnionized)
		{
		this.unionized = newUnionized;
		}



	public String toString()
		{
		String output = super.toString();
		output += " Title: " + this.title + " Unionized: " + this.unionized;
		return output;
		}


	}

