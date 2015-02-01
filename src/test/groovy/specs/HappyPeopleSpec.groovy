package specs

import pages.ComplexPage;
import spock.lang.Shared;
import spock.lang.Unroll;
import geb.spock.GebSpec

class HappyPeopleSpec extends GebSpec {


	def "commit button only available when last and first-name are given" (){

		when:
		to ComplexPage
		at ComplexPage

		then:
		commit.isDisabled() == true
		lastname.value("Deyne")
		age.click() // put focus on age
		waitFor{
			commit.isDisabled() == true
		}

		firstname.value("Dirk")
		age.click()
		waitFor{
			commit.isDisabled() == false
		}

	}
	
	@Unroll
	def "commit multiple (un)happy people: #lname, #fname \t #result"(){
		to ComplexPage
		at ComplexPage
		lastname.value(lname)
		firstname.value(fname)
		age.value(age_)
		areYouHappy.value(happy)
		gender.value(sexe)
		commit.click()
		
		expect:
		message.text() == result
		
		where:
		 lname  | fname | sexe   | age_ | happy  || result
		 "Deyne"|"Kevin"|"MALE"  | 24   | true   || ":) Deyne, Kevin, [MALE, age:24]"
		 "Deyne"|"Dirk" |"MALE"  | 49   | true   || ":) Deyne, Dirk, [MALE, age:49]"
		 "Dua"  |"Vera" |"FEMALE"| 27   | false  || ":( Dua, Vera, [FEMALE, age:27]"
		 "Devos"|"Mia"  |"FEMALE"| 28   | false  || ":( Devos, Mia, [FEMALE, age:28]"
	}
}
