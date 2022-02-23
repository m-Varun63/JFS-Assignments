import java.util.*;
class Employee
{
	int id,salary;
	String name,dept;
	public Employee(int id, String name, String dept, int salary) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId()-o2.getId();
	}
}
class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
class DeptComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.getDept().compareTo(o2.getDept());
    }
}
class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.getSalary()-o2.getSalary();
    }
}
public class Q3 {
	public static void main(String[] args)
	{
		System.out.println("Please Select an Option");
		System.out.println("a) Id\nb) Name\nc) Department\nd) Salary");
		
		Scanner sc=new Scanner(System.in);
		String select=sc.nextLine();
		
		if(select.equals("a"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new IdComparator());
			emp.add(new Employee(101,"Ankit","CSE",100000));
            emp.add(new Employee(102,"Kartik","CSE",75000));
            emp.add(new Employee(103,"Riya","CSE",40000));
            emp.add(new Employee(104,"Anuj","EEE",80000));
            emp.add(new Employee(105,"Abhishek","EEE",60000));
            emp.add(new Employee(106,"Rakesh","ECE",85000));
            emp.add(new Employee(107,"Neha","MECH",45000));
            emp.add(new Employee(108,"Varun","CSE",95000));
            emp.add(new Employee(109,"Shreya","ECE",110000));
            emp.add(new Employee(110,"Rohan","CSE",55000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
		else if(select.equals("b"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new NameComparator());
			emp.add(new Employee(101,"Ankit","CSE",100000));
            emp.add(new Employee(102,"Kartik","CSE",75000));
            emp.add(new Employee(103,"Riya","CSE",40000));
            emp.add(new Employee(104,"Anuj","EEE",80000));
            emp.add(new Employee(105,"Abhishek","EEE",60000));
            emp.add(new Employee(106,"Rakesh","ECE",85000));
            emp.add(new Employee(107,"Neha","MECH",45000));
            emp.add(new Employee(108,"Varun","CSE",95000));
            emp.add(new Employee(109,"Shreya","ECE",110000));
            emp.add(new Employee(110,"Rohan","CSE",55000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
		else if(select.equals("c"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new DeptComparator());
			emp.add(new Employee(101,"Ankit","CSE",100000));
            emp.add(new Employee(102,"Kartik","CSE",75000));
            emp.add(new Employee(103,"Riya","CSE",40000));
            emp.add(new Employee(104,"Anuj","EEE",80000));
            emp.add(new Employee(105,"Abhishek","EEE",60000));
            emp.add(new Employee(106,"Rakesh","ECE",85000));
            emp.add(new Employee(107,"Varun","CSE",95000));
            emp.add(new Employee(109,"Shreya","ECE",110000));
            emp.add(new Employee(110,"Rohan","CSE",55000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
		else if(select.equals("d"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new SalaryComparator());
			emp.add(new Employee(101,"Ankit","CSE",100000));
            emp.add(new Employee(102,"Kartik","CSE",75000));
            emp.add(new Employee(103,"Riya","CSE",40000));
            emp.add(new Employee(104,"Anuj","EEE",80000));
            emp.add(new Employee(105,"Abhishek","EEE",60000));
            emp.add(new Employee(106,"Rakesh","ECE",85000));
            emp.add(new Employee(107,"Varun","CSE",95000));
            emp.add(new Employee(109,"Shreya","ECE",110000));
            emp.add(new Employee(110,"Rohan","CSE",55000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
	}

}