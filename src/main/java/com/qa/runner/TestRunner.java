package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:com/qa/features/freecrm.feature",
		glue={"com/qa/steps"},
		format={"pretty","html:test-output", "json:json_output/cucumber.json", "junit:juni_xml/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict=false,
		tags={"@BDDPOM"}
		)
public class TestRunner {

}
