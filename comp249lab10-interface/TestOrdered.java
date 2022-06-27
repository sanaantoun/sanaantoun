package lab10com249;

public class TestOrdered {

	public static void main(String[] args) {
	
		Employee employee1= new Employee(100000, 40209806);
		Employee employee2= new Employee(95000, 30029377);
		Employee employee3= new Employee(125000, 56029437);
		
		
		Book book1= new Book(400, 2012);
		Book book2 = new Book (700, 2003);
		Book book3 = new Book (933, 2021);
		
		boolean x;
		
		x=employee1.precedes(employee2);
	
		 
		x=employee2.precedes(employee3);
		
		x=employee1.succeds(employee2);
		
		x=employee2.succeds(employee3);
		
		
		x=book1.precedes(book2);
		 
		x=book2.precedes(book3);
		
		x=book1.succeds(book2);
		
		x=book2.succeds(book3);
		
	}

}
