package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/jerlinEg5.feature"},
                   glue="stepdef",
                  plugin="json:target/jsonreport.json")
                   //plugin="html:target/htmlreport")
                		  // plugin="json:target/cucumber.json")
                		  // plugin="junit:target/xmlreport.xml",
                		   //tags={"@smoke"})
                				   //tags={"@regression"})
                				   //tags={"@smoke,@regression"})
                				  // tags={"@smoke","@regression"})
                				   //tags={"~@smoke"})
                				   //tags={"~@regression"})
public class RunnerClass {

}
