package core.data.addmoney;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@JacksonXmlRootElement(localName = "soap:Body")
public class TagBody {
  @JacksonXmlProperty(localName = "q0:pdr")
  private TagPdr TagPdr;
}