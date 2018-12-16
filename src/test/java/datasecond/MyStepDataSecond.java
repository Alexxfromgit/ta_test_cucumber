package datasecond;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.Map;

public class MyStepDataSecond {

    private Map<String,String> map = new HashMap<>();

    @Given("^data items '([^\"]*)' and '([^\"]*)'$")
    public void dataItemsAnd(String arg0, String arg1) {
        System.out.println("START GIVEN DATA SECOND");
        map.put(arg0,arg1);
        System.out.println(map.get(arg0));
        System.out.println("FINISH GIVEN DATA SECOND");
    }

    @When("^print to console$")
    public void printToConsole() throws Throwable {
        System.out.println("START WHEN DATA SECOND");
        System.out.println("Step When is written via console");
        System.out.println("FINISH WHEN DATA SECOND");
    }

    @Then("^check the '([^\"]*)'$")
    public void checkThe(String arg0) throws Throwable {
        System.out.println("START THEN DATA SECOND");
        System.out.println(arg0);
        System.out.println("FINISH THEN DATA SECOND");
    }
}
