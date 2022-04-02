package core.utilities.api;

import core.data.addmoney.CreateXmlForAddMoneyToCustomerAccount;
import core.data.client.Client;
import io.restassured.RestAssured;
import org.hamcrest.core.IsEqual;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class AddMoneyToCustomerAccount {
  public void addMoneyToCustomerAccount(Client client, Integer sumOfOperation) throws IOException {
    //Код для зачисления денег на счет клиента. Одинаковые суммы пополнения в один день не проходят, только первая.
    //Чтобы поменять клиента, меняем значение вызываемого dataProvider, счет тянется API запросом, берется первый

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    String accountNumber = new GetAccountsOfCustomer().getAccountsOfCustomer(client).get(0);
    String documentXmlTo = CreateXmlForAddMoneyToCustomerAccount.createXMLasString(formatter.format(date), accountNumber, sumOfOperation);

    RestAssured.baseURI = "https://bank.srv:8443";

    given()
        .header("Content-Type", "text/xml")
        .relaxedHTTPSValidation()
        .and()
        .body(documentXmlTo)
        .when()
        .post("/isimpleperson")
        .then()
        .statusCode(200)
        .and()
        .assertThat().body(containsString("<q1:status>2</q1:status>"));
  }
}
