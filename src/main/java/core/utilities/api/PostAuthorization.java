package core.utilities.api;

import core.data.client.Client;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;
import core.utilities.UrlUtil;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class PostAuthorization {

  public ResultOfAuthorization getData(Client client) {
    String authBasic =
            Base64.getEncoder()
                    .encodeToString(
                            String.format("%s:%s", client.getLoginData().getLogin(),  client.getLoginData().getPass()).getBytes());
    Map<String, String> forHeaders = new HashMap<>();

    forHeaders.put("Authorization", ("Basic " + authBasic));

    RequestSpecification requestSpec =
            new RequestSpecBuilder()
                    .setBaseUri(UrlUtil.getAppUrl())
                    .setAccept("application/json, text/plain, */*")
                    .setContentType(ContentType.JSON)
                    .addHeaders(forHeaders)
                    .build();

    Cookie cookie = new AuthenticationLoginEnter().cookieForLogin(requestSpec);
    int statusCode200 = 200;
    new AuthenticationAdditional().requestPin(cookie, requestSpec, true, statusCode200);
    new AuthenticationNotification().sentPin(cookie, requestSpec, client);

    return new ResultOfAuthorization(cookie, requestSpec);
  }
}
