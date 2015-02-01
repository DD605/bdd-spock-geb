package pages

import geb.Page
import groovy.lang.Closure;

class AgileLearnerPage extends Page {
	
	static url = "https://www.agilelearner.com"
	static at = { title == "agile learner" }
	static content = {
		searchWords { $("#keywordstb") }
		searchButton { $("button.search") }
		results (wait:true) {$("#foundpresentations")}
	}
	
	def searchFor(words) {
		println "lookup $words"
		searchWords = words
		searchButton.click()
		results.text()
	}

}
