package everis.com.startereto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temp.mensaje")
public class TempProperties {

	private String tempFormat = "celsius";
	
	public String getTempFormat() {
		return tempFormat;
	}
	public void setTempFormat(String tempFormat) {
		this.tempFormat = tempFormat;
	}
}
