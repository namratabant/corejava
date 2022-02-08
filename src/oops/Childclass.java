package oops;

public class Childclass extends Person{

	String Profession;
	public Childclass() {
	}
	
		public Childclass(String Name,int Age,String Profession)
		{
		
		super(Name,Age);
		this.Profession = Profession;
	}

	public void print() {
		System.out.println("Inside Child");
}
	
}