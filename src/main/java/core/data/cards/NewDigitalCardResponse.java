package core.data.cards;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewDigitalCardResponse {
  private String attempts;
  private String availTypes;
  private String displayedFields;
  private String leftAttempts;
  private String notifyMessageId;
  private String result;
  private String text;
  private String type;
}
