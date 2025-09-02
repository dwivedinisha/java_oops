package Abstraction;



abstract class emp{
	String name;
	int id;
	
	public emp(String name,int id) {
		this.name = name;
		this.id = id;
	}
	abstract void calsal();
	void showdetails() {
		System.out.println("name: "+name+" "+"id"+id);
	}
	
	
}



