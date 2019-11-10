package com.basic.getRequestBasicsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//glue is java code
		//we canrun multiple feature file byjust adding path below using comma
		features= {"src/test/resources/com/basic/getRequestBasicsFF/"},
		glue={"com/basic/getRequestBasicsSD/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report22711.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerGETRequestTest {

}
