package package2;
import package1.student;


//class parent extends s1{
//	void display() {
//		System.out.println(s.name);
//		System.out.println(s.rollno);
//	}
//}


public class child extends student {
	public void display(){
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String[] args) {
	    child c = new child();
	    c.display();
	}
}



