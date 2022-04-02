package core.data.addmoney;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "q0:request")
public class TagRequest {
  @JacksonXmlProperty(localName = "q1:reqId")
  private String reqId;
  @JacksonXmlProperty(localName = "q1:subSys")
  private String subSys;
  @JacksonXmlProperty(localName = "q1:customerId")
  private Integer customerId;
  @JacksonXmlProperty(localName = "q1:D")
  private String D;
  @JacksonXmlProperty(localName = "q1:N")
  private Integer N;
  @JacksonXmlProperty(localName = "q1:A")
  private Integer A;
  @JacksonXmlProperty(localName = "q1:PINN")
  private String PINN;
  @JacksonXmlProperty(localName = "q1:PNAME")
  private String PNAME;
  @JacksonXmlProperty(localName = "q1:PACC")
  private String PACC;
  @JacksonXmlProperty(localName = "q1:PIDD")
  private Object PIDD;
  @JacksonXmlProperty(localName = "q1:PIDN")
  private Object PIDN;
  @JacksonXmlProperty(localName = "q1:PIDI")
  private Object PIDI;
  @JacksonXmlProperty(localName = "q1:PBBIK")
  private String PBBIK;
  @JacksonXmlProperty(localName = "q1:PBCA")
  private String PBCA;
  @JacksonXmlProperty(localName = "q1:PBTYP")
  private Object PBTYP;
  @JacksonXmlProperty(localName = "q1:PBNAME")
  private String PBNAME;
  @JacksonXmlProperty(localName = "q1:PBPT")
  private Object PBPT;
  @JacksonXmlProperty(localName = "q1:PBP")
  private String PBP;
  @JacksonXmlProperty(localName = "q1:RINN")
  private Object RINN;
  @JacksonXmlProperty(localName = "q1:PKPP")
  private Object PKPP;
  @JacksonXmlProperty(localName = "q1:RTYP")
  private Object RTYP;
  @JacksonXmlProperty(localName = "q1:RNAME")
  private String RNAME;
  @JacksonXmlProperty(localName = "q1:RACC")
  private String RACC;
  @JacksonXmlProperty(localName = "q1:RBBIK")
  private String RBBIK;
  @JacksonXmlProperty(localName = "q1:RBCA")
  private String RBCA;
  @JacksonXmlProperty(localName = "q1:RBTYP")
  private Object RBTYP;
  @JacksonXmlProperty(localName = "q1:RBNAME")
  private String RBNAME;
  @JacksonXmlProperty(localName = "q1:RBPT")
  private Object RBPT;
  @JacksonXmlProperty(localName = "q1:RBP")
  private Object RBP;
  @JacksonXmlProperty(localName = "q1:RKPP")
  private Object RKPP;
  @JacksonXmlProperty(localName = "q1:OKATO")
  private Integer OKATO;
  @JacksonXmlProperty(localName = "q1:TS")
  private Object TS;
  @JacksonXmlProperty(localName = "q1:REASON")
  private Integer REASON;
  @JacksonXmlProperty(localName = "q1:STYPE")
  private Integer STYPE;
  @JacksonXmlProperty(localName = "q1:TP")
  private Integer TP;
  @JacksonXmlProperty(localName = "q1:TN")
  private String TN;
  @JacksonXmlProperty(localName = "q1:TD")
  private Integer TD;
  @JacksonXmlProperty(localName = "q1:TT")
  private Integer TT;
  @JacksonXmlProperty(localName = "q1:CBCCODE")
  private Integer CBCCODE;
  @JacksonXmlProperty(localName = "q1:DOCID")
  private Integer DOCID;
  @JacksonXmlProperty(localName = "q1:UIN")
  private Object UIN;
  @JacksonXmlProperty(localName = "q1:PAYPURP")
  private String PAYPURP;
  @JacksonXmlProperty(localName = "q1:PCARD")
  private Object PCARD;
  @JacksonXmlProperty(localName = "q1:RCARD")
  private Object RCARD;
  @JacksonXmlProperty(localName = "q1:COMISSION")
  private Double COMISSION;
  @JacksonXmlProperty(localName = "q1:COMISSIONACC")
  private String COMISSIONACC;
  @JacksonXmlProperty(localName = "q1:isNotice")
  private Integer isNotice;
}