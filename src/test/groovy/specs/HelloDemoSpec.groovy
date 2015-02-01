/**
 * 
 */
package specs

import pages.HelloDemoPage;
import geb.spock.GebReportingSpec;
import geb.spock.GebSpec

/**
 * @author Dirk Deyne
 *
 */
class HelloDemoSpec extends GebSpec {
	
	def "On the RADNG demo page Zk hello should be accessble"(){
		when:
			to HelloDemoPage
		then:
			at HelloDemoPage
			menu.gotoHelloZk()
			sayHello("Spock-world")
			
	}
	
}
