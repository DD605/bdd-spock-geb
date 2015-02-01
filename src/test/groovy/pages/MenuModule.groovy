package pages

import geb.Module

class MenuModule extends Module {
	
	static content = {
		helloZK { $("li.T_MITEM_HELLO_ZK") }
		complex(to:ComplexPage) { $("li.T_MITEM_LABELS_COMPLEX_LABEL")}
		urlBased { $("li.T_MITEM_HELLO_URL_BASED") }
	}
	
	def gotoHelloZk() {
		helloZK.click()
	}
	
	def gotoComplex() {
		complex.click()
	}
	
	def gotoUrlBased() {
		urlBased.click()
	}
	
	def gotoPage(page) {
		page.click()
	}
}
