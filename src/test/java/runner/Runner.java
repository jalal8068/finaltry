package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@Homepage"},format={"pretty","html:Report"},monochrome=true,features="C:\\workspace\\bddpageobject\\src\\test\\resources\\feature",glue="homepagetest")
public class Runner {

}
