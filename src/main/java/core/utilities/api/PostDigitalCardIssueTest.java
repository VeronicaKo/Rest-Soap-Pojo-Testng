package core.utilities.api;


import core.annotations.TestClient;
import core.data.cards.NewDigitalCardRequest;
import core.data.cards.NewDigitalCardResponse;
import core.data.client.Client;
import core.data.enums.is;
import core.utilities.api.PostAuthorization;
import core.utilities.api.ResultOfAuthorization;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PostDigitalCardIssueTest {

    @Test(
            description = "TC331. Выпуск цифровой карты",
            groups = {"api"})
    @Description("Новая цифровая карта для клиента")
    @Owner("KoshelevaVA")
    public void postDigitalCardIssue() {
        NewDigitalCardRequest rq =
                NewDigitalCardRequest.builder()
                        .accId("")
                        .accType("")
                        .accNum("")
                        .productCode("3333")
                        .amount(0)
                        .branchCode("9")
                        .design("")
                        .mainCardId("")
                        .accMainCard("")
                        .numMainCard("")
                        .reasonText("По сроку")
                        .issuingPin(0)
                        .comisOpenCard(0)
                        .isDigital(true)
                        .cardProcId("444444")
                        .build();

        ResultOfAuthorization resultOfAuthorization = new PostAuthorization().getData(client);

        List<NewDigitalCardResponse> newDigitalCard =
                given()
                        .cookie(resultOfAuthorization.getcookie())
                        .spec(resultOfAuthorization.getrequestSpec())
                        .basePath(" /open_card/v2 HTTP/1.1")
                        .relaxedHTTPSValidation()
                        .contentType(ContentType.JSON)
                        .body(rq)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .jsonPath()
                        .getList("result", NewDigitalCardResponse.class);

        Assert.assertEquals(0, newDigitalCard);
    }
}
