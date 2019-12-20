import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int empId;
	String firstName;
	String lastName;
	
	public Employee(int id , String fName,String lName) {
		empId = id;
		firstName = fName;
		lastName = lName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

public class CompratorExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2,"Abhijeet","Waikar");
		Employee e2 = new Employee(1,"Gajendra","Zalte");
		Employee e3 = new Employee(3,"ketan","Rangari");
		
		List<Employee> empList = new ArrayList();
		empList.add(e1);
		empList.add(e3);
		empList.add(e2);
		
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.empId - o2.empId;
			}
			
		});
		
		empList.forEach(e -> System.out.print(e.empId +" "+ e.firstName+" "+e.lastName));
		empList.sort((Employee e11, Employee e22) -> e11.getLastName().compareTo(e22.getLastName()));
		System.out.println();
		System.out.println("By last Name ");
		System.out.println();
		empList.forEach(e -> System.out.print(e.empId +" "+ e.firstName+" "+e.lastName));
		
	}
	
}
