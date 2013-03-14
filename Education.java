/*
 * Cody Gildea 008933663
 * CECS 277
 * Lab 2
 */
import java.util.Scanner;
public class Education implements Cloneable
{
	private String degree;
	private String major;
	private int research;
	Scanner userInput = new Scanner(System.in);
	
	public Education()
	{
		degree = "";
		major = "";
		research = 0;
	}
	public Education(String degree, String major, int research)
	{
		this.degree = degree;
		this.major = major;
		this.research = research;
	}
	public String getDegree()
	{
		return degree;
	}
	public String getMajor()
	{
		return major;
	}
	public int getResearch()
	{
		return research;
	}
	public void setDegree(String value)
	{
		degree = value;	
	}
	public void setMajor(String value)
	{
		major = value;
	}
	public void setResearch(int value)
	{
		research = value;
	}
	public Object Clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
