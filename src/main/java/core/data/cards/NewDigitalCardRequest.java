package core.data.cards;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class NewDigitalCardRequest {
  private String accId;
  private String accType;
  private String accNum;
  private String productCode;
  private Integer amount;
  private String branchCode;
  private String design;
  private String mainCardId;
  private String accMainCard;
  private String numMainCard;
  private String reasonText;
  private Integer issuingPin;
  private Integer comisOpenCard;
  private Boolean isDigital;
  private String cardProcId;
}
