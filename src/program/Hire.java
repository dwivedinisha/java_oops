package program;


public class Hire {
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.name);
        System.out.println(b.rollno);
        b.add();
        b.display();
        C c = new C();
        c.Sub();
    }
}



class A{
    String name = "nitin";
    int rollno = 1;

    void display(){
        System.out.println("Parent method called");
    }
}

class B extends A{
    void add(){
        System.out.println("class B method called");
    }
}


class C extends A{
    void Sub(){
        System.out.println("class C method called");
    }
}