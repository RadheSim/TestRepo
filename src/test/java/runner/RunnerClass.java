package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse_data\\CucumberProj\\features", 
                  glue= {"/CucumberProj/src/test/java/stepDefinition"},
                  plugin= {"pretty","html:target/htmlreports"})



public class RunnerClass {
	
}


















/*
 
 
 
Dependecies :
 
Selenium-java
Cobertura
Cucumber-jvm-deps
Cucumber-reporting
Gherkin
JUnit
Mockito-all-1.10.19


Cucumber-core   info.cuckes
Cucumber-java
Cucumber-junit
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  */


