/*
 * Cody Gildea 008933663
 * CECS 277
 * Lab 2
 */
import java.util.Arrays;
public class Lab2Tester implements Cloneable
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws CloneNotSupportedException
	{
		double totalMonthlyEarnings = 0.0;
		double totalStaff = 0.0;
		Employee [] emps = new Employee[9];
		emps [0] = new Staff("Chan, Scott", 123, "M", 59, 2, 23, 35.0);
		emps [1] = new Staff("Salinas, Brian", 456, "F", 64, 7, 12, 30.0);
		emps [2] = new Staff("Weir, Allen", 789, "M", 70, 6, 2, 22.0);
		emps [3] = new Faculty("Im, Lee", 243, "F", 62, 4, 27, "Full", "PH.D", "Engineering", 3);
		emps [4] = new Faculty("Bui, Trung", 791, "F", 75, 3, 14, "AO", "PH.D", "English", 1 );
		emps [5] = new Faculty("Moreno, Maria", 623, "F", 80, 5, 22, "AS", "MS", "Physical Education", 0);
		emps [6] = new PartTime("Lee, Chesong", 455, "F", 77, 8, 10, 35, 25);
		emps [7] = new PartTime("Garcia, Frank", 678, "F", 87, 9, 15, 30.0, 25);
		emps [8] = new PartTime("Alquilo, Roscoe", 945, "M", 88, 11, 24, 20.0, 30);
		
		for(Employee i : emps)
		{
			System.out.println(i.toString());
		}

		for(Employee i:emps){
			totalMonthlyEarnings+=i.monthlyEarning();
			if(i instanceof Faculty){
				totalStaff+=i.monthlyEarning();
			}
		}
		System.out.println("\n\nTotal Monthly Earnings: $"+totalMonthlyEarnings);
		System.out.println("Total Staff Monthly Earnings: $"+totalStaff+"\n");
		
		
		Faculty F =(Faculty)emps[5];
		Faculty F2=(Faculty) F.Clone();
		
		System.out.println("\nCloned:  "+"\n");
		System.out.println(F.toString()+"\n");
		System.out.println(F2.toString()+"\n");
		
		System.out.println("Equal Employee Check:"+"\n");
		Staff S1 =(Staff)emps[0];
		Staff S2=(Staff)emps[1];
		S1.equals(S2);
		
		if(S1.equals(S2))
			System.out.println(S1+"\n\nIs equal to:"+"\n\n"+S2);
		else
			System.out.println(S1+"\n\nIs not equal to:"+"\n\n"+S2);
		
		System.out.println("\nSorted Employees:  "+"\n");
		Arrays.sort(emps);
		for(Employee i: emps)
		{
			System.out.println(i.toString());
			System.out.println("");
		}
	}
}
