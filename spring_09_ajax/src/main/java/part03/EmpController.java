package part03;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//http://localhost:8090/myapp/empsearch.do

@Controller
public class EmpController {
	private EmployeesDAO dao;

	public EmpController() {
		
	}

	public void setDao(EmployeesDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/empsearch.do", method = RequestMethod.GET)
	public String execute() {
		return "part03/empList";
	}// execute
	
	@ResponseBody
	@RequestMapping(value = "/empsearch.do", method = RequestMethod.POST)
	public List<EmployeesDTO> process(String data){
		System.out.println(data);
		System.out.println(dao.search(data));
		return dao.search(data);
	
	}//process

}// class


/* [DTO,DTO] : List => DTO
 * 
 * [{employee_id:100, first_name:'Steven', salary:24000},
 *  {employee_id:128, first_name:'Steven', salary:2200}] 
 * 
 * 
 */
