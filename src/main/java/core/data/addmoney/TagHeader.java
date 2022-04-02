package core.data.addmoney;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "soap:Header")
public class TagHeader {
  @JacksonXmlText
  @JacksonXmlProperty(localName = "wsa:Action")
  private TagAction tagAction;
  @JacksonXmlProperty(localName = "wsa:To")
  private TagTo tagTo;
  @JacksonXmlProperty(isAttribute = true,localName = "xmlns:wsa")
  private String wsa;
//  private String text;
}