package core.utilities.api;

import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class AuthenticationLoginEnter {

  public Cookie cookieForLogin(RequestSpecification RequestSpec) {
    Cookie cookie =
        given()
            .spec(RequestSpec)
            .basePath("/personal/login")
            .relaxedHTTPSValidation()
            .when()
            .post()
            .then()
            .statusCode(461)
            .extract()
            .response()
            .getDetailedCookie("JSESSIONID");

    return cookie;
  }
}
