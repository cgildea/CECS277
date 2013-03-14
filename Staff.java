/*
 * Cody Gildea 008933663
 * CECS 277
 * Lab 2
 */
public class Staff extends Employee implements EmployeeInfo
{
	private double hourlyRate;
	
	public Staff()
	{
		super();
		hourlyRate = 0.0;
	}
	public Staff(String name, int ID, String sex, 
			int yy, int mm, int dd, double hourlyRate) 
	{
		super(name, ID, sex, yy, mm, dd);
		this.hourlyRate = hourlyRate;
	}
	public double getRate()
	{
		return hourlyRate;
	}
	public void setRate(double rate)
	{
		hourlyRate = rate;
	}
	public double monthlyEarning()
	{ 
		return STAFF_MONTHLY_HOURS_WORKED*hourlyRate;
	}
	
	public String toString()
	{
		return (super.toString()+"\nFull time"+
				"\nHourly rate: "+getRate());
	}
}
