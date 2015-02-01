/**
 * 
 */
package specs

import java.text.SimpleDateFormat;

import pages.ComplexPage;
import pages.HelloDemoPage;
import geb.spock.GebSpec

/**
 * @author Dirk Deyne
 *
 */
class DateCalcSpec extends GebSpec {
	
	def "At the complexPage calculation of Dates should be possible"(){
		
		def today = new Date().format("dd-MMM-yyyy")
		def treeDaysLater = new Date().next().next().next().format("dd-MMM-yyyy")
		
		// "goto complex page"
		when:
			to HelloDemoPage
			menu.gotoComplex()
			at ComplexPage
		
		// "today should be displayed as starting date "	
		then:
			startDate.value() == today
		
		// "adding three days should be possible" 
		then :
			daysToAdd.value(3)
			calculate.click()
			caclulatedDate.value() == treeDaysLater
	}
}
