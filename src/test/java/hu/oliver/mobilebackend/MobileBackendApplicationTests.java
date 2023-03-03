package hu.oliver.mobilebackend;

import hu.oliver.mobilebackend.Model.Employee.Employee;
import hu.oliver.mobilebackend.Model.Employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MobileBackendApplicationTests {

	// NOT WORKING!
	// hibakód: employee tábla tabon

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Rachel");
		employee.setLocation("Building-5");
		employee.setBranch("IT");
		employeeDao.save(employee);
	}

	@Test
	void getAllEmployeeTest() {
		List<Employee> employees = employeeDao.getAllEmployees();
		System.out.println(employees);
	}

	@Test
	void getAllEmployeesAndDeleteTest() {
		List<Employee> employees = employeeDao.getAllEmployees();
		for(Employee employee : employees) {
			employeeDao.delete(employee);
		}
	}

}
