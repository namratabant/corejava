package oops;

public class runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 543456;
		emp2.Salary = 1200; */
		
		//Employee emp1 = new Employee("Sachin",242423,1000);
		//Employee emp2 = new Employee("Mahesh",543456,1200);
		
		//emp1.PrintName();
		//emp2.PrintName();

		Employee emp3 = new Employee("Rahul",456785);
		
		Employee.ChangeCompanyName();
		
	
		
		Person per1 = new Person();
		
		Childclass child1 = new Childclass("Namrata",30,"dancer");
	//child1.display();
	//child1.print();
	Methodoverloading obj = new Methodoverloading();
	obj.sum(4, 6);
	obj.sum(4, 7,8);
	 //Bankabstractexample bank = new Bankabstractexample(); --can not creat object of abstract//
	Icicibank bank1 = new Icicibank();
	bank1.Creditcard();
	bank1.welcome();
	
	capsulation obj10 = new capsulation();
	
	obj10.setName("Rohit");
	System.out.println(obj10.getName());
	}

}

