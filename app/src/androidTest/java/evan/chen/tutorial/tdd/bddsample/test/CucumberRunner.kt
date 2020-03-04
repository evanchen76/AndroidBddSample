package evan.chen.tutorial.tdd.bddsample.test

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@CucumberOptions(
    features = ["features"],
    glue = ["evan.chen.tutorial.tdd.bddsample.stepdefinitions"],
    tags = ["@register"]
)

class CucumberRunner {
}
