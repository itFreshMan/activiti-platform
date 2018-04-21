package cn.jhs.activiti.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: jhs
 * @desc:
 * @date: Create in 2018/4/21  14:19
 */
@Controller
public class ViewController {
	
	@GetMapping(value = {"/", "/index"})
	public String index() {
		return "redirect:/modeler/model-list";
	}
	
	@GetMapping("/modeler/model-list")
	public String modelList() {
		return "/modeler/model-list";
	}
	
	@GetMapping("/modeler/modeler")
	public String modeler(String modelId, ModelMap modelMap) {
		modelMap.put("modelId", modelId);
		return "/modeler/modeler";
	}
}
