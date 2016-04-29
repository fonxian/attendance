package react;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/react")
public class ReactController {
	
	@RequestMapping(value="/test")
	public String react(){
		return "/react/test";
	}
	
}
