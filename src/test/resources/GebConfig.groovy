/*
 This is the Geb configuration file.
 
 See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Platform
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile


waiting {
 timeout = 50
}

environments {

 firefox {
	 driver = {
		 new FirefoxDriver()
	 }
 }
 
}

