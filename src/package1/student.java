package package1;

class s1 {
	String name = "Nitin";
	int rollno = 1;
	
	
	void display() {
		System.out.println("class student");
	}
}

public class student{
	public static void main(String[] args) {
		s1 s = new s1();
		System.out.println(s.name);
		System.out.println(s.rollno);
		
	}
}

