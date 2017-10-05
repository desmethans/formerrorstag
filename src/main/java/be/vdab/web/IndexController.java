package be.vdab.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class IndexController {

	private static final String VIEW = "/WEB-INF/JSP/index.jsp";

	@GetMapping
	ModelAndView findByPostcodeReeks() {
		CommandObject reeks = new CommandObject();
		return new ModelAndView(VIEW).addObject(reeks);
	}

	@GetMapping(params = { "value" })
	ModelAndView findByPostcodeReeks(CommandObject reeks, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView(VIEW);
		return modelAndView;
	}

	@InitBinder("commandObject")
	void initBinderPostcodeReeks(DataBinder dataBinder) {
		dataBinder.setRequiredFields("value");
	}
}