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
@JacksonXmlRootElement(localName = "wsa:Action")
public class TagAction {
  @JacksonXmlProperty(isAttribute = true,localName = "soap:mustUnderstand")
  private Integer mustUnderstand;
  @JacksonXmlText
  private String text;
}
