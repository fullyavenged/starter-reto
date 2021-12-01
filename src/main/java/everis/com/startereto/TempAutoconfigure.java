package everis.com.startereto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temp.class)
@EnableConfigurationProperties(TempProperties.class)
public class TempAutoconfigure {
	
	private TempProperties tProperties;
	
	public TempAutoconfigure(TempProperties tProperties) {
		
		this.tProperties = tProperties;
	}

	@Bean
	public Temp temp() {
		return new Temp(tProperties.getTempFormat());
	}
}
