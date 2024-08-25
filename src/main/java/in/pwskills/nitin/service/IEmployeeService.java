package in.pwskills.nitin.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.pwskills.nitin.model.Employee;

public interface IEmployeeService {

	void saveRecord(Employee employee);
	Page<Employee> displayAllRecords(Pageable pageable);
	void deleteRecord(Integer eid);
	Employee findEmployee(Integer eid);
}
