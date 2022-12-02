package aft;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "classpath:aft/features",
        glue = {"aft.steps", "aft.configurations", "aft.hook"})
@io.cucumber.junit.platform.engine.Cucumber
public class RunCucumberTest {
}
