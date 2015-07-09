package springbootwar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String hello(){
		return "HelloWar!";
	}
	
	@RequestMapping("/hi.html")
	public ModelAndView hi(){
		Hi hi = new Hi();
		hi.setName("hiInWar");
		System.out.println("hi");
		
		return new ModelAndView("hi2", "hi", hi);
	}
	
	@RequestMapping("/hi2")
	public ModelAndView hi2(){
		Hi hi = new Hi();
		hi.setName("hiIn hi2");
		System.out.println("hi2");
		
		return new ModelAndView("hi2", "hi", hi);
	}
}
