package specs

import org.spockframework.runtime.model.SpecMetadata;

import pages.AgileLearnerPage;
import geb.Browser;
import geb.Configuration;
import geb.spock.GebReportingSpec;
import geb.spock.GebSpec

class AgileLearnerSpec extends GebSpec {
	
	def "Search for Groovy at the agilelearner.com"() {
		when:
			to AgileLearnerPage
			at AgileLearnerPage
		then:
			searchFor("Spoc Groovy").matches("Found [\\d]* presentations")
	}	
}
