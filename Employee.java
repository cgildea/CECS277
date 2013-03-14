/*
 * Cody Gildea 008933663
 * CECS 277
 * Lab 2
 */
import java.util.Calendar;
import java.util.Scanner;
public abstract class Employee implements EmployeeInfo, Comparable
{
	private String employName;
	private int ID_Number;
	private String gender;
	private Calendar birthday;
	//String dateOfBirth;
	Scanner userInput = new Scanner(System.in);
	
	public Employee()
	{
		employName = "";
		ID_Number = 0;
		gender = "";
		birthday = Calendar.getInstance();
	}
	public Employee(String name, int ID, String sex, 
			int yy, int mm, int dd)
	{
		employName = name;
		ID_Number = ID;
		gender = sex;
		birthday = Calendar.getInstance();
		birthday.set(yy, mm-1, dd);
	}
	public String toString()
	{
		return ("ID Number: "+ID_Number+
				"\nEmployee Name: "+employName+
				"\nGender: "+gender+
				"\nDate of Birth: "+birthday.get(Calendar.MONTH+1)+"/"+
				birthday.get(Calendar.DAY_OF_MONTH)+"/"+
				birthday.get(Calendar.YEAR));
	}
	public void setName(String value)
	{
		employName = value;
	}
	public void setID(int value)
	{
		ID_Number = value;
	}
	public void setGender(String value)
	{
		gender = value;
	}
	public void setBirthday(int yy, int mm, int dd)
	{
		birthday.set(yy, mm-1, dd);
		/*
		birthday.set(Calendar.MONTH, mm);
		birthday.set(Calendar.DAY_OF_MONTH, dd);
		birthday.set(Calendar.YEAR, yy);
		*/
	}
	public String getName()
	{
		return employName;
	}
	public int getID()
	{
		return ID_Number;
	}
	public String getGender()
	{
		return gender;
	}
	public Calendar getBirthday()
	{
		return birthday;
	}
	public abstract double monthlyEarning();
	
	public int compareTo(Object C){
		Employee temp=(Employee)C;
		return this.ID_Number-temp.ID_Number;
	}
}
