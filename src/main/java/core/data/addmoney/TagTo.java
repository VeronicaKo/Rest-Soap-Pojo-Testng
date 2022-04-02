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
@JacksonXmlRootElement(localName = "wsa:To")
public class TagTo {
    @JacksonXmlProperty(isAttribute = true,localName = "soap:mustUnderstand")
    public Integer mustUnderstand;
    @JacksonXmlText
    public String text;
}
