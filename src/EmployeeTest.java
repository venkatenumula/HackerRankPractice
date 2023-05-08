import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Employee> allEmps=new ArrayList<Employee>();
        allEmps.add(new Employee(80000, 2, "Venkat"));
        allEmps.add(new Employee(75000, 2, "Bindu"));
        allEmps.add(new Employee(100000, 3, "Naveen"));
        allEmps.add(new Employee(80000, 1, "Srinu"));
         String startSt="S";
         List<String> sEmps=allEmps.stream().filter( e-> e.name.toUpperCase().startsWith(startSt)).map(Employee :: getName). collect(Collectors.toList());
         
         for(String s : sEmps)
         {
             System.out.println(s);
         }
        
         Map<Integer, List<Employee>> gEmps= allEmps.stream().collect(Collectors.groupingBy(Employee :: getDept));
         System.out.println(gEmps);
    }
}

class Employee
{
    public int salary,dept;
    public String name;
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", name=" + name + "]";
	}
	public Employee(int salary, int dept, String name) {
		super();
		this.salary = salary;
		this.dept = dept;
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public int getDept()
	{
		return this.dept;
	}
    
    // Getter and Setter methods
}