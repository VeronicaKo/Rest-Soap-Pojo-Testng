package core.utilities.api;

import core.data.client.Client;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAccountsOfCustomer {

  public List<String> getAccountsOfCustomer(Client client) {
    ResultOfAuthorization resultOfAuthorization = new PostAuthorization().getData(client);

    List<String> accounts  = given()
        .cookie(resultOfAuthorization.getcookie())
        .spec(resultOfAuthorization.getrequestSpec())
        .basePath("/product/acc_list_light")
        .relaxedHTTPSValidation()
        .contentType(ContentType.JSON)
        .when()
        .get()
        .then()
        .statusCode(200)
        .extract()
        .response().jsonPath().getList("response.accountLights.ca");

    return accounts;
  }
}
