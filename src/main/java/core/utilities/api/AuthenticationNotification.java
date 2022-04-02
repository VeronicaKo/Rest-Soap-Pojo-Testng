package core.utilities.api;

import core.BankClient;
import core.data.client.Client;
import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class AuthenticationNotification {

  public void sentPin(Cookie cookie, RequestSpecification RequestSpec, Client client) {
    given()
        .cookie(cookie)
        .spec(RequestSpec)
        .queryParam("key", client.getLoginData().getPin())
        .basePath(
            "/authentication/additional/notification?key="
                + client.getLoginData().getPin())
        .relaxedHTTPSValidation()
        .contentType(io.restassured.http.ContentType.JSON)
        .when()
        .post()
        .then()
        .statusCode(200);
  }
}
