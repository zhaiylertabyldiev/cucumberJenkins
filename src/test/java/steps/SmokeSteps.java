package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {
    @Given("I print Hello World")
    public void i_print_hello_world() {
        System.out.println("Hello World!!!");
    }
    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("We are happy! =)");
    }



    @Given("I run Cucumber test")
    public void i_run_cucumber_test() {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is Cucumber test! :)");
        }
    }
    @Then("verify this is Cucumber")
    public void verify_this_is_cucumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is Cucumber indeed! =)");
        }
    }

}