package comparetoExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String email;
	private String dept;
	private int salary;
	
	Employee(){
		
	}
	Employee(int id,String name,String email,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.dept=dept;
		this.salary=salary;
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
	@Override
	public int compareTo(Employee e2) {
		Employee e1=this;
		Integer id1=e1.id;
		Integer id2=e2.id;
//		return id1.compareTo(id2);
		String mail1=e1.email;
		String mail2=e2.email;
//		return name1.compareTo(name2);
		String dept1=e1.dept;
		String dept2=e2.dept;
		
		Integer sal1=e1.salary;
		Integer sal2=e2.salary;
		if(e1.id==e2.id)
		{
		return e1.name.compareTo(e2.name);
		}
		else if(e1.name==e2.name)
		{
			return mail1.compareTo(mail2);
		}
		else if(e1.email==e2.email)
		{
			return dept1.compareTo(dept2);
			
		}
		else if(dept1==dept2)
		{
			return sal1.compareTo(sal2);
		}
		return id1.compareTo(id2);
		
	}
	
}

public class ComparetoExample {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			ArrayList<Employee> al=new ArrayList<Employee>();
			System.out.println("ENTER NO.OF EMPLOYEES");
			
			int n=scan.nextInt();
			scan.nextLine();
			for(int i=0;i<n;i++)
			{
				Employee e=new Employee();
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
			Collections.sort(al);
			System.out.println(al);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
