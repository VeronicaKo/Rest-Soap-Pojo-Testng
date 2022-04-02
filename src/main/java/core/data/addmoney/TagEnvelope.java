package core.data.addmoney;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "soap:Envelope")
public class TagEnvelope {
  @JacksonXmlProperty(localName = "soap:Header")
  private TagHeader TagHeader;
  @JacksonXmlProperty(localName = "soap:Body")
  private TagBody TagBody;
  @JacksonXmlProperty(isAttribute = true, localName ="xmlns:soap")
  private String soap;
  @JacksonXmlProperty(isAttribute = true, localName ="xmlns:q0")
  private String q0;
  @JacksonXmlProperty(isAttribute = true, localName ="xmlns:q1")
  private String q1;
//  @JacksonXmlProperty(isAttribute = true)
//  private String text;
}
