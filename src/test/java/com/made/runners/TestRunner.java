package com.made.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/made/features"},
        glue = {"com/made/hooks","com/made/stepDefinitions"},
        plugin = {"pretty","json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumberOne"}

)
public class TestRunner {
}
