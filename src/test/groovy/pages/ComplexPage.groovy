/**
 * 
 */
package pages

import geb.Page

/**
 * @author Dirk Deyne
 *
 */
class ComplexPage extends Page {
	def nr = 0
	
	static url = "http://localhost:8080/complex"
	static at = {title == "~ TEST PAGE ~" }
	static content = {
		//Date calc
		startDate { $(".T_DTE_VM_TODAY input") }
		daysToAdd { $("input.T_NR_VM_STEP") }
		calculate { $("button.T_BTN_ADD_DAYS") }
		caclulatedDate(wait:true) { $(".T_DTE_VM_FUTURE input") }
		
		//Happy People
		lastname{ $("input.T_TBX_VM_PERSON_LASTNAME") }
		firstname (wait:true) { $("input.T_TBX_VM_PERSON_FIRSTNAME") }
		age { $("input.T_NR_VM_PERSON_AGE") }
		gender { $("select.T_LBX_GENDER") }
		areYouHappy(wait:true) { $(".T_CH_VM_PERSON_HAPPY input") }
		commit(wait:true) { $("button.T_BTN_COMMIT") }
		
		message(wait:true) { $(".z-messagebox-window .z-messagebox") }
		ok(wait:true) { $("button.z-messagebox-button") }
	}

}
