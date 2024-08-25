package in.pwskills.nitin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.pwskills.nitin.model.Employee;
import in.pwskills.nitin.service.IEmployeeService;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	/***
	 * 1. Display a from
	 * 2. Method : Get
	 * 3. Action : /showFrom
	 * 4. Input  : Model
	 * 5. Return : ViewName
	 */
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "/employee/employee-form";
	}
	
	/***
	 * 1. Save the Object Collected from User
	 * 2. Method : Post
	 * 3. Action : 
	 * 4. Input  : Employee 
	 * 5. Return : ViewName
	 */
	
	@PostMapping("/save")
	public String saveEmployeeData(@ModelAttribute Employee employee) {
		service.saveRecord(employee);
		return "redirect:/employee/list";
	}
	
	/***
	 * 1. Get all the records from db
	 * 2. Method : Get
	 * 3. Action : /list
	 * 4. Input  : Model
	 */
	
	@GetMapping("/list")
	public String displayEmployeeList(@PageableDefault(page=0, size=3) Pageable pageable,
										Model model) {
		Page<Employee> page = service.displayAllRecords(pageable);
		List<Employee> employees = page.getContent();
		model.addAttribute("employees", employees);
		model.addAttribute("page", page);
		return "/employee/list-employees";
	}
	
	/***
	 * 1. Collect the Id form user
	 * 2. Method : Post
	 * 3. Action : /delete
	 * 4. Input  : Id
	 * 5. Return : redirect
	 */
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") Integer id) {
		service.deleteRecord(id);
		return "redirect:/employee/list";
	}
	
	/***
	 * 1. Collect the Id form user
	 * 2. Method : Post
	 * 3. Action : /showFormForUpdate
	 * 4. Input  : Id
	 * 5. Return : employee-form
	 */
	
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("empId") Integer id, Model model) {
		Employee employee = service.findEmployee(id);
		model.addAttribute("employee", employee);
		return "/employee/employee-form";
	}
}







