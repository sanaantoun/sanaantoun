package lab10com249;



interface Ordered{
	public boolean precedes(Object x);
	public boolean succeds(Object x);
}
public class Employee implements Ordered {

	protected double salary;
	protected long IDNum;
	
	public Employee(double salary, long IDNum) {
		this.salary=salary;
		this.IDNum=IDNum;
	}
	
	public Employee(Employee e) {
		this.salary=e.salary;
		this.IDNum=e.IDNum;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getIDNUM() {
		return IDNum;
	}

	public void setIDNUM(long IDNum) {
		this.IDNum=IDNum;
	}

	public String toString() {
		return "This employee has a salary of " + salary + " and an IDNum of " + IDNum + ".";
	}

	public boolean equals(Object x) {
		if (x==null|| this==null||this.getClass()!=x.getClass()) 
			return false;
		else
		{
			Employee e=(Employee)x;
			
			return (this.getIDNUM()==e.getIDNUM() && this.getSalary()==e.getSalary()  );
		}
	}

	public boolean precedes(Object x) {
		if(x == null || x.getClass() != this.getClass())
			return false;
		Employee e = (Employee)x;
		if (this.salary < e.salary)
		
			return true;
		else 

		return false;
	}


	public boolean succeds(Object x) {
		if(x == null || x.getClass() != this.getClass())
			return false;
		
		Employee e = (Employee)x;
		if (this.IDNum > e.IDNum)
			return true;
		else 
		
		return false;
	}
	
}


 class Book implements Ordered{
	protected int NumOfPages;
	protected int yearofCreation;
	
	public Book(int NumOfPages, int yearofCreation) {
		this.NumOfPages=NumOfPages;
		this.yearofCreation=yearofCreation;
	}
	
	public Book(Book b) {
		this.NumOfPages=b.NumOfPages;
		this.yearofCreation=b.yearofCreation;
	}

	public int getNumOfPages() {
		return NumOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		NumOfPages = numOfPages;
	}

	public int getYearofCreation() {
		return yearofCreation;
	}

	public void setYearofCreation(int yearofCreation) {
		this.yearofCreation = yearofCreation;
	}

	public String toString() {
		return "Book has NumOfPages " + NumOfPages + " and a yearofCreation of " + yearofCreation + ".";
	}

	public boolean equals(Object x) {
		if (x==null|| this==null||this.getClass()!=x.getClass()) 
			return false;
		else
		{
			Book b=(Book)x;
			
			return (this.getNumOfPages()==b.getNumOfPages() && this.getYearofCreation()== b.getYearofCreation() );
		}
	}
	
	public boolean precedes(Object x) {
		if(x == null || x.getClass() != this.getClass())
			return false;
		Book b = (Book)x;
		if (this.yearofCreation < b.yearofCreation)
		
			return true;
		else 

		return false;
	}
	
	public boolean succeds(Object x) {
		if(x == null || x.getClass() != this.getClass())
			return false;
		
		Book b = (Book)x;
		if (this.NumOfPages > b.NumOfPages)
			return true;
		else 
		
		return false;
	}

	
}
