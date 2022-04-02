package core.data.addmoney;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class CreateXmlForAddMoneyToCustomerAccount {
  public static String createXMLasString(String dataPayment, String account, Integer sum) {
    String xmlString;
    try {
      XmlMapper xmlMapper = new XmlMapper();

      TagRequest tagRequest = new TagRequest(
          "555555555-5555-5555-5555-5555555555555",
          "ISMPL",
          0,
          dataPayment,
          3,
          sum,
          "055555555555555",
          "Оооооооооооооооооооооооооооооооооооооооо",
          "777777777777777777777777",
          "",
          "",
          "",
          "044444444444",
          "333333333333333333333",
          "",
          "КБ \"банк\" ООО",
          "",
          "Г.KKKKKKKKKKKKKKK",
          "",
          "",
          "",
          "Жуков Жук Жукович",
          account,
          "04444444444",
          "30101810200000000722",
          "",
          "КБ \"банк\" ООО",
          "",
          "",
          "",
          0,
          "",
          0,
          3,
          0,
          "{0}",
          0,
          0,
          0,
          2222222222,
          "",
          "Перевод денежных средств на счет физического лица Без НДС.",
          "",
          "",
          0.00,
          "7777777777777777777777",
          0
      );

      TagAction tagAction = new TagAction(1, "http://bbbbb.com/ttt/aaaaaaaaaaaaaaa/AAAAAAAAAAAAAAAAA/AAAAAAAAAAA/pdr");
      TagTo tagTo = new TagTo(1, "http://localhost:88888");
      TagHeader tagHeader = new TagHeader(tagAction, tagTo, "http://www.w3.org/2222/22/addressing");
      TagPdr tagPdr = new TagPdr(tagRequest);
      TagBody tagBody = new TagBody(tagPdr);

      xmlString = xmlMapper
          .writeValueAsString(new TagEnvelope(tagHeader, tagBody,
              "http://www.w3.org/2222/22/soap-envelope",
              "http://bbbbb.com/ttt/aaaaaaaaaaa/ABSInterface",
              "http://bbbbb.com/ttt/aaaaaaaaaaa"));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      xmlString = "";
    }
    return xmlString;
  }

}