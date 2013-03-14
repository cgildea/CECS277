/*
 * Cody Gildea 008933663
 * CECS 277
 * Lab 2
 */
import java.util.Calendar;
public class PartTime extends Staff implements EmployeeInfo
{
	int hoursPerWeek;
	
	public PartTime()
	{
		super();
		hoursPerWeek = 0;
	}
	public PartTime(String name, int ID, String sex, 
			int yy, int mm, int dd, double hourlyRate,
			int hoursPerWeek)
	{
		super(name, ID, sex,yy, mm, dd, hourlyRate);
		this.hoursPerWeek = hoursPerWeek;
	}
	public int getHoursPerWeek()
	{
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int value)
	{
		hoursPerWeek = value;
	}
	public String toString()
	{
		Calendar c = this.getBirthday();
		return "ID: "+super.getID()+
				"\nName: "+super.getName()+
				"\nDate of Birth: "+c.get(Calendar.MONTH+1)+"/"+
				c.get(Calendar.DAY_OF_MONTH)+"/"+
				c.get(Calendar.YEAR)+
				"\nHours worked per month: "+getHoursPerWeek()+
				"\nMonthly salary: "+monthlyEarning();
	}
}
