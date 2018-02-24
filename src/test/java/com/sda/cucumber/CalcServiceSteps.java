package com.sda.cucumber;


import com.sda.CalcService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalcServiceSteps {
    private String text;
    private int actual;
    private CalcService calcService;

    @Given("^I initialize CalcService$")
    public void I_initialize_CalcService() {
        calcService = new CalcService();
    }

    @When("^I execute calculate method$")
    public void I_execute_calculate_method() {
        actual = calcService.calculate(text);
    }



    @And("^I pass null$")
    public void I_pass_null() {
        text = null;
    }



    @And("^I pass blank$")
    public void I_pass_blank() {
        text = "";
    }

    @And("^I pass text with letters$")
    public void I_pass_text_with_letters() {
        text = "3a;2;4;5b";
    }



    @And("^I pass recipe$")
    public void I_pass_recipe() {
        text = "2 jablka;3 jajka; 5 zimniaków";
    }



    @And("^I pass (.*) value$")
    public void I_pass_text_value(String text) {
        this.text = text;
    }

    @Then("^I get (.*) as a result$")
        public void I_get_value_as_a_result (int result){
            Assert.assertEquals(result, actual);
        }

}
