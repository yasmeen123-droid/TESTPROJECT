package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty" ,"html:Report\\cucumber","json:Report\\cucumber.json" },
features ="C:\\HandsOn\\Workspace\\CUCUTEST\\src\\test\\FEATURES\\CUCU.feature",
tags="@tag1",
glue = "StepDef")
public class run{}
