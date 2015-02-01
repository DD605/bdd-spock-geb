package pages

import geb.Page

class HelloDemoPage extends Page {
	
	static url = "http://localhost:8080"
	static at = { title.matches(".*DEMO.*") }
	static content = {
		menu { module MenuModule }
		zKHelloTo(wait:true) { $("input.T_TBX_VM_TO") }
		sayHello(wait:true) { $("button.T_BTN_SAY_HALLO") }
	}
	
	def sayHello(words) {
		zKHelloTo = words
		sayHello.click()
	}
	

}
