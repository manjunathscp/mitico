package mitico.leo.tests.Gherkin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions {


    @Given("^A dummy login user accesses a class file$")
    public void aDummyLoginUserAccessesAClassFile() throws Throwable {
        System.out.println("Dummy user has logged in");
    }

    @Then("^he is able to print a statement$")
    public void heIsAbleToPrintAStatement() throws Throwable {
        System.out.println("I already printed something :P");
    }
}
