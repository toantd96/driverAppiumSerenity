package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import base.BaseAPI;

public class DemoAPI {
  BaseAPI baseAPI = new BaseAPI();
  Response response;
  String API_URL;

  @Given("I have an user")
  public void iHaveAnUser() {
    API_URL =
        "http://dummy.restapiexample.com/api/v1/employee/1";
//    API_URL = "https://reqres.in/api";
  }

  @When("I call API to get user")
  public void iCallAPIToGetUser() {
    response = baseAPI.getAPI(API_URL);
  }

  @Then("the API should return status {int}")
  public void theAPIShouldReturnStatus(int statusCode) {
    Assert.assertEquals("Status code incorrect", statusCode, response.getStatusCode());
  }
}
