package comparetoExample;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class demo1 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		Integer id1=o1.getId();
		Integer id2=o2.getId();
		return id1.compareTo(id2);
	}
	
}
class demo2 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
class demo3 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}
	
}
class demo4 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getDept().compareTo(o2.getDept());
	}
	
}
class demo5 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		Integer id1=o1.getSalary();
		Integer id2=o2.getSalary();
		return id1.compareTo(id2);
	}
	
}

class Employee1{
	private int id;
	private String name;
	private String email;
	private String dept;
	private int salary;
	
	Employee1(){
		
	}

	public Employee1(int id, String name, String email, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			demo1 obj1=new demo1();
			demo1 obj2=new demo1();
			demo1 obj3=new demo1();
			demo1 obj4=new demo1();
			demo5 obj5=new demo5();
			TreeSet<Employee1> al=null;
			System.out.println("ENTER CATAGORY YOU WANT TO SORT \n1.ID\n2.Name\n3.Email\n4.Department\n5.Salary");
			int choice=scan.nextInt();
			switch (choice) {
			case 1:al=new TreeSet<Employee1>(obj1);
				break;
			case 2:al=new TreeSet<Employee1>(obj2);
				break;
			case 3:al=new TreeSet<Employee1>(obj3);
				break;
			case 4:al=new TreeSet<Employee1>(obj4);
				break;
			case 5:al=new TreeSet<Employee1>(obj5);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			System.out.println("ENTER NO.OF EMPLOYEES");
			
			int n=scan.nextInt();
			scan.nextLine();
			
			for(int i=0;i<n;i++)
			{
				Employee1 e=new Employee1();
				System.out.println("ENTEER THE DETAILS OF EMPLOYEE");
				String details=scan.nextLine();
				String arr[]=details.split(",");
				e.setId(Integer.parseInt(arr[0]));
				e.setName(arr[1]);
				e.setEmail(arr[2]);
				e.setDept(arr[3]);
				e.setSalary(Integer.parseInt(arr[4]));
				al.add(e);
			}
			System.out.println(al);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
