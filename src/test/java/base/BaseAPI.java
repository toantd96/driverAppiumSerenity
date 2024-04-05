package base;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
public class BaseAPI {
  public Response getAPI(String baseURL) {
    Response response =
        SerenityRest.given()
                .baseUri(baseURL)
                .when()
                .get()
                .andReturn();
    return response;
  }
}
