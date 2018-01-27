package Comp;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	
	private static int rollNumber=0;
	private static int index=0;
	private static String defaultName ;
	private int roll;
	
	private String name;

	public Student() {
		
		this(null);
		
	}
	
	public Student(String nameStud) {
		
		
		rollNumber++;
		roll=rollNumber;
		
		if (nameStud == null ) {
			index++;
			//System.out.println(index);
			defaultName="Student"+ index;
			name=defaultName;
		}else {
			//System.out.println(nameStud);
			name= nameStud;	
		}
		
	}
	
	public int getRollNumber() {
		return roll;
		
	}
	
	public String getName() {
		return name;
	}

	public void SetName(String s) {
		
		if (s.isEmpty()) {
			return;
		}
		name=s;
		return;
	}
	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.rollNumber - arg0.rollNumber;
	}
	
	public static class compareByName implements  Comparator<Student>
	{
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}

	}

}
