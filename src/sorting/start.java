package sorting;

import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int rollno;
	
	Student(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return name + " " + rollno;
		
	}
	
	@Override
	public int compareTo(Student that) {
		return this.name.compareTo(that.name);
//		return this.rollno - that.rollno;
		
	}
}



public class start {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Rahul",21));
		list.add(new Student("Ram",12));
		list.add(new Student("Nitin",22));
		list.add(new Student("Nisha",19));
		
		Collections.sort(list);
		System.out.println(list);
	}
}
