

public class employee_dao {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.out();
		EmployeeDao e_dao = new EmployeeDaoImpl1();
		e_dao.addYear(e);
		e.out();
	}	
	
}

class Employee{
	int year = 10;
	public void out() {
		System.out.println(year);
	}
}

interface EmployeeDao{
	void addYear(Employee e);
	//抽取出功能 交由其他class實作
}

class EmployeeDaoImpl1 implements EmployeeDao{
	//實作功能
	@Override
	public void addYear(Employee e) {
		e.year += 5;
	}
}