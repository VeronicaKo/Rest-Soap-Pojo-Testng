package core.utilities.api;

import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class AuthenticationAdditional {

  public void requestPin(
      Cookie cookie, RequestSpecification RequestSpec, Boolean parameter, int statusCode) {
    given()
        .cookie(cookie)
        .spec(RequestSpec)
        .queryParam("restart", "false")
        .basePath(
            "/authentication/additional?restart="
                + parameter)
        .relaxedHTTPSValidation()
        .contentType(ContentType.JSON)
        .when()
        .post()
        .then()
        .statusCode(statusCode);
  }
}
