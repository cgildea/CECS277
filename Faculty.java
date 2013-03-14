/*
 * Cody Gildea 008933663
 * CECS 277
 * Lab 2
 */
public class Faculty extends Employee implements EmployeeInfo, Cloneable
{
	String level;
	private Education education;
	
	public Faculty()
	{
		super();
		level = "";
		education = new Education();
	}
	public Faculty(String name, int ID, String sex, 
			int yy, int mm, int dd, 
			String levelEmp, String degree, String major, int research)
	{
		super(name, ID, sex, yy, mm, dd);
		level = levelEmp;
		education = new Education(degree, major, research);
	}
	public Education getEducation()
	{
		return education;
	}
	public void setEducation(String deg, String maj, int res)
	{
		education = new Education(deg, maj, res);
	}
	public String getLevel()
	{
		return level;
	}
	public void setLevel(String value)
	{
		if(value.equalsIgnoreCase("AS"))
			level = "Assistant";
		else if (value.equalsIgnoreCase("AO"))
			level = "Assosiate";
		else if (value.equalsIgnoreCase("FU"));
			level = "Fulltime";
	}
	
	public double monthlyEarning()
	{
		if(level.equals("AS"))
			return FACULTY_MONTHLY_SALARY;
		else if (level.equals("AO"))
			return FACULTY_MONTHLY_SALARY*1.2;
		else if (level.equals("FU"));
			return FACULTY_MONTHLY_SALARY*1.4;
	}
	public String toString()
	{
		String lvl = "";
		if(lvl.equalsIgnoreCase("AS"))
			lvl = "Assistant";
		else if (lvl.equalsIgnoreCase("AO"))
			lvl = "Assosiate";
		else if (lvl.equalsIgnoreCase("FU"));
			lvl = "Fulltime";
		return (super.toString()+"\nLevel: "+lvl+
				"\nDegree: "+ education.getDegree()+
				"\nMajor: "+education.getMajor()+
				"\nResearch: "+education.getResearch()+
				"\nMountly Salary: "+monthlyEarning());
	}
	public Object Clone() throws CloneNotSupportedException
	{
		Faculty any = (Faculty)super.clone();
		Education some=(Education)education.Clone();
		any.setEducation(some.getDegree(),some.getMajor(), some.getResearch());
		return any;
		
	}
}
