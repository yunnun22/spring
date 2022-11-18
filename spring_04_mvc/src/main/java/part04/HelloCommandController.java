package part04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// http://localhost:8090/myapp/mem.htm

@Controller
public class HelloCommandController {

 //  @RequestMapping(value = "/mem.htm" , method = RequestMethod.GET)
   @GetMapping("/mem.htm")
	public String form() {
      return "part04/memForm";
   }

  // @RequestMapping(value = "/mem.htm" , method = RequestMethod.POST)
//   @PostMapping("/mem.htm")
//   public ModelAndView submit(String name, int age, ModelAndView mav) {
//	   mav.addObject("name",name);
//	   mav.addObject("age",age);
//	   mav.setViewName("part04/memPro");
// 
//      return mav;
// }

   
//   @PostMapping("/mem.htm")
//   public String submit(MemDTO dto) {
//	   return "part04/memPro";
//	   
//   }
   
   @PostMapping("/mem.htm")
   public String submit(@ModelAttribute("dto") MemDTO dto) {
	   return "part04/memPro";
	   
   }
   
}