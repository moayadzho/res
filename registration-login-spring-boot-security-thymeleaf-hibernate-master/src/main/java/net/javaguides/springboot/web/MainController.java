package net.javaguides.springboot.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/customer")
	public String customer() {
		return "customer";
	}
	@GetMapping("/page1")
	public String page1() {
		return "page1";
	}
	@GetMapping("/page2")
	public String page2() {
		return "page2";
	}
	@GetMapping("/page3")
	public String page3() {
		return "page3";
	}
	@GetMapping("/page4")
	public String page4() {
		return "page4";
	}
	@GetMapping("/page5")
	public String page5() {
		return "page5";
	}

	@GetMapping("/page6")
	public String page6() {
		return "page6";
	}

	@GetMapping("/a1")
	public String a1() {
		return "a1";
	}

	@GetMapping("/a2")
	public String a2() {
		return "a2";
	}

	@GetMapping("/a3")
	public String a3() {
		return "a3";
	}

	@GetMapping("/a4")
	public String a4() {
		return "a4";
	}

	@GetMapping("/a5")
	public String a5() {
		return "a5";
	}

	@GetMapping("/a6")
	public String a6() {
		return "a6";
	}
	@GetMapping("/b1")
	public String b1() {
		return "b1";
	}

	@GetMapping("/b2")
	public String b2() {
		return "b2";
	}

	@GetMapping("/b3")
	public String b3() {
		return "b3";
	}

	@GetMapping("/b4")
	public String b4() {
		return "b4";
	}

	@GetMapping("/b5")
	public String b5() {
		return "b5";
	}

	@GetMapping("/b6")
	public String b6() {
		return "b6";
	}
	@GetMapping("/c1")
	public String c1() {
		return "c1";
	}

	@GetMapping("/c2")
	public String c2() {
		return "c2";
	}

	@GetMapping("/c3")
	public String c3() {
		return "c3";
	}

	@GetMapping("/c4")
	public String c4() {
		return "c4";
	}

	@GetMapping("/c5")
	public String c5() {
		return "c5";
	}

	@GetMapping("/c6")
	public String c6() {
		return "c6";
	}

}






