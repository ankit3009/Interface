package TestCase;

import java.util.Collections;
import java.util.LinkedList;
import Comp.Student;
import Comp.Student.compareByName;

import org.junit.Test;

public class TestStudent {

	@Test
	public void TestComparable() {
		
		LinkedList<Student> list= new LinkedList<Student>();
		list.add(new Student());
		list.add(new Student("Ankit Srivastava"));
		list.add(new Student("Apoorva Verma Srivastava"));
		list.add(new Student("Anika Srivastava"));
		list.add(new Student("Arpit Srivastava"));
		list.add(new Student("Puneet Srivastava"));
		list.add(new Student());
		list.add(new Student());
		
		for (Student i : list ) {
			System.out.print(i.getRollNumber());
			System.out.print(" : ");
			System.out.print(i.getName());
			System.out.println("");
		}
		
		Collections.sort(list);
		System.out.println("********************Default Comparision(By Roll Number)***********************");
		for (Student i : list ) {
			System.out.print(i.getRollNumber());
			System.out.print(" : ");
			System.out.print(i.getName());
			System.out.println("");
		}
		Collections.sort(list,new Student.compareByName() );
		System.out.println("********************Comparision by Name***********************");
		for (Student i : list ) {
			System.out.print(i.getRollNumber());
			System.out.print(" : ");
			System.out.print(i.getName());
			System.out.println("");
		}
		
		
	}
}
